package X;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DEFAULT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.McB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC57171McB {
    public static final EnumC57171McB CHALLENGE;
    public static final EnumC57171McB COMMENT;
    public static final EnumC57171McB DEFAULT;
    public static final EnumC57171McB GROUP_CHAT;
    public static final EnumC57171McB INVITE_FRIENDS;
    public static final EnumC57171McB LIVE;
    public static final /* synthetic */ EnumC57171McB[] LJLJI;
    public static final EnumC57171McB MULTI_LIVE;
    public static final EnumC57171McB MUSIC;
    public static final EnumC57171McB NOW_BONUS_INVITE;
    public static final EnumC57171McB NOW_INVITATION;
    public static final EnumC57171McB NOW_MEMORY;
    public static final EnumC57171McB NOW_MY_POST;
    public static final EnumC57171McB NOW_OTHER_POST;
    public static final EnumC57171McB NOW_VIDEO_MEMORY;
    public static final EnumC57171McB PHOTO_VIDEO;
    public static final EnumC57171McB PLAYLIST;
    public static final EnumC57171McB POI;
    public static final EnumC57171McB PRODUCT;
    public static final EnumC57171McB QA;
    public static final EnumC57171McB SEARCH;
    public static final EnumC57171McB STICKERS;
    public static final EnumC57171McB STORY;
    public static final EnumC57171McB SUBSCRIBE_INVITE;
    public static final EnumC57171McB USER;
    public static final EnumC57171McB VIDEO_COLLECTION;
    public static final EnumC57171McB VIDEO_POST;
    public final int LJLIL;
    public final int LJLILLLLZI;

    public static EnumC57171McB valueOf(String str) {
        return (EnumC57171McB) V0N.LJJJ(EnumC57171McB.class, str);
    }

    public static EnumC57171McB[] values() {
        return (EnumC57171McB[]) LJLJI.clone();
    }

    static {
        EnumC57171McB enumC57171McB = new EnumC57171McB("VIDEO_POST", 0, 0, 21);
        VIDEO_POST = enumC57171McB;
        EnumC57171McB enumC57171McB2 = new EnumC57171McB("NOW_MY_POST", 1, 1, 211);
        NOW_MY_POST = enumC57171McB2;
        EnumC57171McB enumC57171McB3 = new EnumC57171McB("NOW_OTHER_POST", 2, 2, 212);
        NOW_OTHER_POST = enumC57171McB3;
        EnumC57171McB enumC57171McB4 = new EnumC57171McB("NOW_INVITATION", 3, 3, 213);
        NOW_INVITATION = enumC57171McB4;
        int i = 4;
        EnumC57171McB enumC57171McB5 = new EnumC57171McB("DEFAULT", i, i);
        DEFAULT = enumC57171McB5;
        int i2 = 5;
        EnumC57171McB enumC57171McB6 = new EnumC57171McB("USER", i2, i2);
        USER = enumC57171McB6;
        int i3 = 6;
        EnumC57171McB enumC57171McB7 = new EnumC57171McB("CHALLENGE", i3, i3);
        CHALLENGE = enumC57171McB7;
        int i4 = 7;
        EnumC57171McB enumC57171McB8 = new EnumC57171McB("MUSIC", i4, i4);
        MUSIC = enumC57171McB8;
        int i5 = 8;
        EnumC57171McB enumC57171McB9 = new EnumC57171McB("STICKERS", i5, i5);
        STICKERS = enumC57171McB9;
        int i6 = 9;
        EnumC57171McB enumC57171McB10 = new EnumC57171McB("INVITE_FRIENDS", i6, i6);
        INVITE_FRIENDS = enumC57171McB10;
        int i7 = 10;
        EnumC57171McB enumC57171McB11 = new EnumC57171McB("LIVE", i7, i7);
        LIVE = enumC57171McB11;
        int i8 = 11;
        EnumC57171McB enumC57171McB12 = new EnumC57171McB("SEARCH", i8, i8);
        SEARCH = enumC57171McB12;
        int i9 = 12;
        EnumC57171McB enumC57171McB13 = new EnumC57171McB("QA", i9, i9);
        QA = enumC57171McB13;
        int i10 = 13;
        EnumC57171McB enumC57171McB14 = new EnumC57171McB("GROUP_CHAT", i10, i10);
        GROUP_CHAT = enumC57171McB14;
        int i11 = 14;
        EnumC57171McB enumC57171McB15 = new EnumC57171McB("PHOTO_VIDEO", i11, i11);
        PHOTO_VIDEO = enumC57171McB15;
        int i12 = 15;
        EnumC57171McB enumC57171McB16 = new EnumC57171McB("PRODUCT", i12, i12);
        PRODUCT = enumC57171McB16;
        int i13 = 16;
        EnumC57171McB enumC57171McB17 = new EnumC57171McB("PLAYLIST", i13, i13);
        PLAYLIST = enumC57171McB17;
        int i14 = 17;
        EnumC57171McB enumC57171McB18 = new EnumC57171McB("MULTI_LIVE", i14, i14);
        MULTI_LIVE = enumC57171McB18;
        int i15 = 18;
        EnumC57171McB enumC57171McB19 = new EnumC57171McB("SUBSCRIBE_INVITE", i15, i15);
        SUBSCRIBE_INVITE = enumC57171McB19;
        int i16 = 19;
        EnumC57171McB enumC57171McB20 = new EnumC57171McB("COMMENT", i16, i16);
        COMMENT = enumC57171McB20;
        int i17 = 20;
        EnumC57171McB enumC57171McB21 = new EnumC57171McB("STORY", i17, i17);
        STORY = enumC57171McB21;
        int i18 = 21;
        EnumC57171McB enumC57171McB22 = new EnumC57171McB("NOW_BONUS_INVITE", i18, i18);
        NOW_BONUS_INVITE = enumC57171McB22;
        int i19 = 22;
        EnumC57171McB enumC57171McB23 = new EnumC57171McB("NOW_MEMORY", i19, i19);
        NOW_MEMORY = enumC57171McB23;
        int i20 = 23;
        EnumC57171McB enumC57171McB24 = new EnumC57171McB("NOW_VIDEO_MEMORY", i20, i20);
        NOW_VIDEO_MEMORY = enumC57171McB24;
        int i21 = 24;
        EnumC57171McB enumC57171McB25 = new EnumC57171McB("VIDEO_COLLECTION", i21, i21);
        VIDEO_COLLECTION = enumC57171McB25;
        int i22 = 25;
        EnumC57171McB enumC57171McB26 = new EnumC57171McB("POI", i22, i22);
        POI = enumC57171McB26;
        LJLJI = new EnumC57171McB[]{enumC57171McB, enumC57171McB2, enumC57171McB3, enumC57171McB4, enumC57171McB5, enumC57171McB6, enumC57171McB7, enumC57171McB8, enumC57171McB9, enumC57171McB10, enumC57171McB11, enumC57171McB12, enumC57171McB13, enumC57171McB14, enumC57171McB15, enumC57171McB16, enumC57171McB17, enumC57171McB18, enumC57171McB19, enumC57171McB20, enumC57171McB21, enumC57171McB22, enumC57171McB23, enumC57171McB24, enumC57171McB25, enumC57171McB26};
    }

    public final int getFollowFrom() {
        return this.LJLILLLLZI;
    }

    public final int getRawValue() {
        return this.LJLIL;
    }

    public /* synthetic */ EnumC57171McB(String str, int i, int i2) {
        this(str, i, i2, 210);
    }

    public EnumC57171McB(String str, int i, int i2, int i3) {
        this.LJLIL = i2;
        this.LJLILLLLZI = i3;
    }
}
