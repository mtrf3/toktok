package com.bytedance.globalpayment.iap.model.enums;

import X.V0N;

/* loaded from: classes14.dex */
public enum OrderStateEnum {
    Init("INIT"),
    Pending("PENDING"),
    Success("SUCCEED"),
    Failed("FAILED"),
    Closed("CLOSED"),
    Expired("EXPIRED"),
    Processing("PROCESSING"),
    Active("ACTIVE"),
    Abandoned("ABANDONED"),
    Cancelled("CANCELLED"),
    Preorder("PREORDER"),
    SusPended("SUSPENDED"),
    Unknown("UNKNOWN");

    public String state;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    public static OrderStateEnum from(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -1149187550:
                if (str.equals("SUCCEED")) {
                    return Success;
                }
                return Unknown;
            case -591252731:
                if (str.equals("EXPIRED")) {
                    return Expired;
                }
                return Unknown;
            case 2252048:
                if (str.equals("INIT")) {
                    return Init;
                }
                return Unknown;
            case 35394935:
                if (str.equals("PENDING")) {
                    return Pending;
                }
                return Unknown;
            case 907287315:
                if (str.equals("PROCESSING")) {
                    return Processing;
                }
                return Unknown;
            case 1990776172:
                if (str.equals("CLOSED")) {
                    return Closed;
                }
                return Unknown;
            case 2066319421:
                if (str.equals("FAILED")) {
                    return Failed;
                }
                return Unknown;
            default:
                return Unknown;
        }
    }

    public static OrderStateEnum valueOf(String str) {
        return (OrderStateEnum) V0N.LJJJ(OrderStateEnum.class, str);
    }

    public static OrderStateEnum from(int i) {
        switch (i) {
            case 1:
                return Pending;
            case 2:
                return Active;
            case 3:
                return Abandoned;
            case 4:
                return Cancelled;
            case 5:
                return SusPended;
            case 6:
                return Expired;
            case 7:
                return Preorder;
            default:
                return Unknown;
        }
    }

    OrderStateEnum(String str) {
        this.state = str;
    }
}
