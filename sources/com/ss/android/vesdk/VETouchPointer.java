package com.ss.android.vesdk;

import X.V0N;
import X.X1D;

/* loaded from: classes15.dex */
public class VETouchPointer {
    public TouchEvent event;
    public float force;
    public float majorRadius;
    public int pointerId;
    public float x;
    public float y;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("pointerId: ");
        LIZ.append(this.pointerId);
        LIZ.append(", TouchEvent: ");
        LIZ.append(this.event);
        LIZ.append(", x: ");
        LIZ.append(this.x);
        LIZ.append(", y: ");
        LIZ.append(this.y);
        LIZ.append(", force: ");
        LIZ.append(this.force);
        LIZ.append(", majorRadius: ");
        LIZ.append(this.majorRadius);
        return X1D.LIZIZ(LIZ);
    }

    public VETouchPointer() {
    }

    public TouchEvent getEvent() {
        return this.event;
    }

    public float getForce() {
        return this.force;
    }

    public float getMajorRadius() {
        return this.majorRadius;
    }

    public int getPointerId() {
        return this.pointerId;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    /* loaded from: classes15.dex */
    public enum TouchEvent {
        BEGAN,
        MOVED,
        STATIONARY,
        ENDED,
        CANCELED;

        public static TouchEvent valueOf(String str) {
            return (TouchEvent) V0N.LJJJ(TouchEvent.class, str);
        }
    }

    public void setEvent(TouchEvent touchEvent) {
        this.event = touchEvent;
    }

    public void setForce(float f) {
        this.force = f;
    }

    public void setMajorRadius(float f) {
        this.majorRadius = f;
    }

    public void setPointerId(int i) {
        this.pointerId = i;
    }

    public void setX(float f) {
        this.x = f;
    }

    public void setY(float f) {
        this.y = f;
    }

    public VETouchPointer(int i, TouchEvent touchEvent, float f, float f2, float f3, float f4) {
        this.pointerId = i;
        this.event = touchEvent;
        this.x = f;
        this.y = f2;
        this.force = f3;
        this.majorRadius = f4;
    }
}
