package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.9IF, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9IF {
    public static final C9IF ADD_FRIENDS;
    public static final C9IF EDIT_PROFILE;
    public static final C9IF FOLLOW;
    public static final C9IF FOLLOW_MESSAGE;
    public static final C9IF INSTAGRAM;
    public static final /* synthetic */ C9IF[] LJLILLLLZI;
    public static final C9IF MESSAGE;
    public static final C9IF MORE;
    public static final C9IF RECOMMEND;
    public static final C9IF REC_USER;
    public static final C9IF SHARE_PROFILE;
    public static final C9IF SOCIAL_BUTTON;
    public static final C9IF TWITTER;
    public static final C9IF YOUTUBE;
    public final int LJLIL;

    public static C9IF valueOf(String str) {
        return (C9IF) V0N.LJJJ(C9IF.class, str);
    }

    public static C9IF[] values() {
        return (C9IF[]) LJLILLLLZI.clone();
    }

    static {
        int i;
        C9IF c9if = new C9IF("MORE", 0, 1000);
        MORE = c9if;
        C9IF c9if2 = new C9IF("EDIT_PROFILE", 1, 10);
        EDIT_PROFILE = c9if2;
        C9IF c9if3 = new C9IF("ADD_FRIENDS", 2, 20);
        ADD_FRIENDS = c9if3;
        C9IF c9if4 = new C9IF("REC_USER", 3, 21);
        REC_USER = c9if4;
        C9IF c9if5 = new C9IF("SOCIAL_BUTTON", 4, 30);
        SOCIAL_BUTTON = c9if5;
        C9IF c9if6 = new C9IF("TWITTER", 5, 31);
        TWITTER = c9if6;
        C9IF c9if7 = new C9IF("YOUTUBE", 6, 32);
        YOUTUBE = c9if7;
        C9IF c9if8 = new C9IF("INSTAGRAM", 7, 33);
        INSTAGRAM = c9if8;
        if (C9H6.LIZ() == 3 || L12.LIZLLL()) {
            i = 19;
        } else {
            i = 34;
        }
        C9IF c9if9 = new C9IF("SHARE_PROFILE", 8, i);
        SHARE_PROFILE = c9if9;
        C9IF c9if10 = new C9IF("FOLLOW", 9, 1);
        FOLLOW = c9if10;
        C9IF c9if11 = new C9IF("MESSAGE", 10, 2);
        MESSAGE = c9if11;
        C9IF c9if12 = new C9IF("FOLLOW_MESSAGE", 11, 0);
        FOLLOW_MESSAGE = c9if12;
        C9IF c9if13 = new C9IF("RECOMMEND", 12, 100);
        RECOMMEND = c9if13;
        LJLILLLLZI = new C9IF[]{c9if, c9if2, c9if3, c9if4, c9if5, c9if6, c9if7, c9if8, c9if9, c9if10, c9if11, c9if12, c9if13};
    }

    public final int getId() {
        return this.LJLIL;
    }

    public C9IF(String str, int i, int i2) {
        this.LJLIL = i2;
    }
}
