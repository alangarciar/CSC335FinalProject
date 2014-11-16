package unit;

import java.awt.Image;
import java.awt.Point;

public abstract class Unit
{
  private int attackRange, damage, health, moveRange;
  private Image iconImage;
  private Point location;
  private String username;

  // This is the Constructor of Unit which is the abstract class that all units
  // call.
  public Unit(int attackRange, int damage, int health, int moveRange,
      Image iconImage, Point location, String username)
  {
    this.attackRange = attackRange;
    this.damage = damage;
    this.health = health;
    this.moveRange = moveRange;
    this.iconImage = iconImage;
    this.location = location;
    this.username = username;
  }

  // Each Type of Unit will have a different attack() and levelUp()
  public abstract void attack();

  public abstract void levelUp();

  // Getters for all instance variables.
  public int getAttackRange()
  {
    return attackRange;
  }

  public int getDamage()
  {
    return damage;
  }

  public int getHealth()
  {
    return health;
  }

  public int getMoveRange()
  {
    return moveRange;
  }

  public Image getIconImage()
  {
    return iconImage;
  }

  public Point getLocation()
  {
    return location;
  }

  public String getUsername()
  {
    return username;
  }

  // Setters for all instance variables
  public void setAttackRange(int attackrange)
  {
    this.attackRange = attackrange;
  }

  public void setDamage(int damage)
  {
    this.damage = damage;
  }

  public void setHealth(int health)
  {
    this.health = health;
  }

  public void setMoveRange(int moverange)
  {
    this.moveRange = moverange;
  }

  public void setIconImage(Image icon)
  {
    this.iconImage = icon;
  }

  public void setLocation(Point location)
  {
    this.location = location;
  }

  public void setUsername(String username)
  {
    this.username = username;
  }
}