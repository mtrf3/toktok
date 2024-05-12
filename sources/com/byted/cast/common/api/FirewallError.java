package com.byted.cast.common.api;

/* loaded from: classes29.dex */
public class FirewallError {
    public static int getFirewallErr(int i) {
        switch (i) {
            case -19:
                return 600019;
            case -18:
                return 600018;
            case -17:
                return 600017;
            case -16:
                return 600016;
            case -15:
                return 600015;
            case -14:
                return 600014;
            case -13:
                return 600013;
            case -12:
                return 600012;
            case -11:
                return 600011;
            case -10:
                return 600010;
            case -9:
                return 600009;
            case -8:
                return 600008;
            case -7:
                return 600007;
            case -6:
                return 600006;
            case -5:
                return 600005;
            case -4:
                return 600004;
            case -3:
                return 600003;
            case -2:
                return 600002;
            case -1:
                return 600001;
            default:
                return 600000;
        }
    }

    public static String getFirewallErrorMsg(int i) {
        switch (i) {
            case -19:
                return "Firewall mediasdk block mix";
            case -18:
                return "Firewall mediasdk block tcp out";
            case -17:
                return "Firewall mediasdk block tcp in";
            case -16:
                return "Firewall mediasdk block udp out";
            case -15:
                return "Firewall mediasdk block udp in";
            case -14:
                return "Firewall mediasdk block all out";
            case -13:
                return "Firewall mediasdk block all in";
            case -12:
                return "Firewall bonjour block mix";
            case -11:
                return "Firewall bonjour block tcp out";
            case -10:
                return "Firewall bonjour block tcp in";
            case -9:
                return "Firewall bonjour block udp out";
            case -8:
                return "Firewall bonjour block udp in";
            case -7:
                return "Firewall bonjour block all out";
            case -6:
                return "Firewall bonjour block all in";
            case -5:
                return "Firewall block all in";
            case -4:
                return "Firewall multi active networks, and policies are different，maybe env is ok";
            case -3:
                return "Bonjour service not running";
            case -2:
                return "Bonjour service not installed";
            case -1:
                return "Firewall system error, maybe env is ok";
            default:
                return "Firewall is not blocked";
        }
    }

    public static boolean mayConnect(int i) {
        if (i == -5) {
            return false;
        }
        switch (i) {
            case -19:
            case -18:
            case -17:
            case -16:
            case -15:
            case -14:
            case -13:
                return false;
            default:
                return true;
        }
    }
}
