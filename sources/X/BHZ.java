package X;

import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public enum BHZ {
    VIDEO,
    SCREEN_RECORD,
    THIRD_PARTY,
    LIVE_VOICE;

    public static final BHW Companion = new BHW();
    public Hashtag LJLIL;
    public GameTag LJLILLLLZI;

    public static BHZ valueOf(String str) {
        return (BHZ) V0N.LJJJ(BHZ.class, str);
    }

    public final GameTag getGameTag() {
        int i = BHY.LIZ[ordinal()];
        GameTag gameTag = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        GameTag gameTag2 = C28514BHa.LJFF;
                        if (gameTag2 != null) {
                            return gameTag2;
                        }
                        String pbContent = InterfaceC30442Bx8.LLLLZLLIL.LIZJ();
                        if (pbContent != null && pbContent.length() != 0) {
                            o.LJIIIIZZ(pbContent, "pbContent");
                            gameTag = (GameTag) C46104I7o.LJIJJ(GameTag.class, pbContent);
                        }
                        C28514BHa.LJFF = gameTag;
                    } else {
                        throw new C162476Zf();
                    }
                } else {
                    return this.LJLILLLLZI;
                }
            } else {
                return C28514BHa.LIZIZ();
            }
        } else {
            GameTag gameTag3 = C28514BHa.LIZIZ;
            if (gameTag3 != null) {
                return gameTag3;
            }
            String pbContent2 = InterfaceC30442Bx8.LLLLZIL.LIZJ();
            if (pbContent2 != null && pbContent2.length() != 0) {
                o.LJIIIIZZ(pbContent2, "pbContent");
                gameTag = (GameTag) C46104I7o.LJIJJ(GameTag.class, pbContent2);
            }
            C28514BHa.LIZIZ = gameTag;
        }
        return gameTag;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
    
        if (r3 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.android.livesdk.model.Hashtag getHashtag() {
        /*
            r10 = this;
            int[] r1 = X.BHY.LIZ
            int r0 = r10.ordinal()
            r1 = r1[r0]
            java.lang.String r2 = "pbContent"
            r3 = 0
            r0 = 1
            if (r1 == r0) goto L4a
            r0 = 2
            if (r1 == r0) goto L3e
            r0 = 3
            if (r1 == r0) goto L3b
            r0 = 4
            if (r1 != r0) goto L8b
            com.bytedance.android.livesdk.model.Hashtag r0 = X.C28514BHa.LJ
            if (r0 == 0) goto L1c
        L1b:
            return r0
        L1c:
            X.J0d<java.lang.String> r0 = X.InterfaceC30442Bx8.LLLLZLL
            java.lang.Object r1 = r0.LIZJ()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L2c
            int r0 = r1.length()
            if (r0 != 0) goto L2f
        L2c:
            X.C28514BHa.LJ = r3
            goto L7b
        L2f:
            java.lang.Class<com.bytedance.android.livesdk.model.Hashtag> r0 = com.bytedance.android.livesdk.model.Hashtag.class
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r2)
            java.lang.Object r3 = X.C46104I7o.LJIJJ(r0, r1)
            com.bytedance.android.livesdk.model.Hashtag r3 = (com.bytedance.android.livesdk.model.Hashtag) r3
            goto L2c
        L3b:
            com.bytedance.android.livesdk.model.Hashtag r0 = r10.LJLIL
            goto L1b
        L3e:
            com.bytedance.android.livesdk.model.GameTag r0 = r10.getGameTag()
            if (r0 != 0) goto L45
            return r3
        L45:
            com.bytedance.android.livesdk.model.Hashtag r0 = X.C28514BHa.LIZ()
            goto L1b
        L4a:
            com.bytedance.android.livesdk.model.Hashtag r0 = X.C28514BHa.LIZ
            if (r0 == 0) goto L4f
            goto L1b
        L4f:
            X.J0d<java.lang.String> r0 = X.InterfaceC30442Bx8.LLLLZ
            java.lang.Object r1 = r0.LIZJ()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L5f
            int r0 = r1.length()
            if (r0 != 0) goto L7d
        L5f:
            com.bytedance.android.livesdk.model.Hashtag r3 = new com.bytedance.android.livesdk.model.Hashtag
            X.J0d<java.lang.Long> r0 = X.InterfaceC30442Bx8.LLJLIL
            java.lang.Object r4 = r0.LIZJ()
            java.lang.Long r4 = (java.lang.Long) r4
            X.J0d<java.lang.String> r0 = X.InterfaceC30442Bx8.LLJLILLLLZIIL
            java.lang.Object r5 = r0.LIZJ()
            java.lang.String r5 = (java.lang.String) r5
            r6 = 0
            r7 = 0
            r8 = 12
            r9 = r6
            r3.<init>(r4, r5, r6, r7, r8, r9)
        L79:
            X.C28514BHa.LIZ = r3
        L7b:
            r0 = r3
            goto L1b
        L7d:
            java.lang.Class<com.bytedance.android.livesdk.model.Hashtag> r0 = com.bytedance.android.livesdk.model.Hashtag.class
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r2)
            java.lang.Object r3 = X.C46104I7o.LJIJJ(r0, r1)
            com.bytedance.android.livesdk.model.Hashtag r3 = (com.bytedance.android.livesdk.model.Hashtag) r3
            if (r3 != 0) goto L79
            goto L5f
        L8b:
            X.6Zf r0 = new X.6Zf
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BHZ.getHashtag():com.bytedance.android.livesdk.model.Hashtag");
    }

    public final boolean isSelectFinish() {
        Long l;
        Hashtag hashtag;
        Long l2;
        int i = BHY.LIZ[ordinal()];
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    return true;
                }
                throw new C162476Zf();
            }
            Hashtag hashtag2 = getHashtag();
            Long l3 = null;
            if (hashtag2 != null) {
                l = hashtag2.id;
            } else {
                l = null;
            }
            Hashtag LIZ = C28514BHa.LIZ();
            if (LIZ != null) {
                l3 = LIZ.id;
            }
            if (o.LJ(l, l3)) {
                if (getGameTag() != null) {
                    return true;
                }
            } else if (getHashtag() != null && ((hashtag = getHashtag()) == null || (l2 = hashtag.id) == null || l2.longValue() != 0)) {
                return true;
            }
        } else if (getGameTag() != null) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Enum
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("hashtag = ");
        LIZ.append(getHashtag());
        LIZ.append(",gameTag = ");
        LIZ.append(getGameTag());
        LIZ.append(" ,isSelectFinish = ");
        LIZ.append(isSelectFinish());
        return X1D.LIZIZ(LIZ);
    }

    public final void updateHashTagGameTag(Hashtag hashtag, GameTag gameTag) {
        Long l;
        Long l2;
        String str;
        Long l3;
        Long l4;
        String LJJJJZI;
        Long l5;
        Long l6;
        Long l7;
        Long l8;
        Long l9;
        Long l10;
        String str2;
        String str3;
        Long l11;
        Long l12;
        int i = BHY.LIZ[ordinal()];
        String str4 = "";
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    Hashtag LIZ = C28514BHa.LIZ();
                    if (LIZ != null) {
                        l9 = LIZ.id;
                    } else {
                        l9 = null;
                    }
                    if (hashtag != null) {
                        l10 = hashtag.id;
                    } else {
                        l10 = null;
                    }
                    if (o.LJ(l9, l10) && gameTag == null) {
                        return;
                    }
                    C28514BHa.LJ = hashtag;
                    C48459J0d<String> c48459J0d = InterfaceC30442Bx8.LLLLZLL;
                    if (hashtag == null || (str2 = C46104I7o.LJJJJZI(hashtag)) == null) {
                        str2 = "";
                    }
                    c48459J0d.LIZ(str2);
                    C28514BHa.LJFF = gameTag;
                    C48459J0d<String> c48459J0d2 = InterfaceC30442Bx8.LLLLZLLIL;
                    if (gameTag == null || (str3 = C46104I7o.LJJJJZI(gameTag)) == null) {
                        str3 = "";
                    }
                    c48459J0d2.LIZ(str3);
                    if (gameTag == null) {
                        return;
                    }
                    if (hashtag != null) {
                        l11 = hashtag.id;
                    } else {
                        l11 = null;
                    }
                    Hashtag LIZ2 = C28514BHa.LIZ();
                    if (LIZ2 != null) {
                        l12 = LIZ2.id;
                    } else {
                        l12 = null;
                    }
                    if (o.LJ(l11, l12)) {
                        return;
                    }
                    C28514BHa.LJFF = null;
                    c48459J0d2.LIZ("");
                    return;
                }
                Hashtag LIZ3 = C28514BHa.LIZ();
                if (LIZ3 != null) {
                    l5 = LIZ3.id;
                } else {
                    l5 = null;
                }
                if (hashtag != null) {
                    l6 = hashtag.id;
                } else {
                    l6 = null;
                }
                if (o.LJ(l5, l6) && gameTag == null) {
                    return;
                }
                this.LJLIL = hashtag;
                this.LJLILLLLZI = gameTag;
                if (gameTag == null) {
                    return;
                }
                if (hashtag != null) {
                    l7 = hashtag.id;
                } else {
                    l7 = null;
                }
                Hashtag LIZ4 = C28514BHa.LIZ();
                if (LIZ4 != null) {
                    l8 = LIZ4.id;
                } else {
                    l8 = null;
                }
                if (o.LJ(l7, l8)) {
                    return;
                }
                this.LJLILLLLZI = null;
                return;
            }
            C28514BHa.LIZLLL = gameTag;
            C48459J0d<String> c48459J0d3 = InterfaceC30442Bx8.LLLLLZL;
            if (gameTag != null && (LJJJJZI = C46104I7o.LJJJJZI(gameTag)) != null) {
                str4 = LJJJJZI;
            }
            c48459J0d3.LIZ(str4);
            return;
        }
        Hashtag LIZ5 = C28514BHa.LIZ();
        if (LIZ5 != null) {
            l = LIZ5.id;
        } else {
            l = null;
        }
        if (hashtag != null) {
            l2 = hashtag.id;
        } else {
            l2 = null;
        }
        if (o.LJ(l, l2) && gameTag == null) {
            return;
        }
        C28514BHa.LIZJ(hashtag);
        C28514BHa.LIZIZ = gameTag;
        C48459J0d<String> c48459J0d4 = InterfaceC30442Bx8.LLLLZIL;
        if (gameTag == null || (str = C46104I7o.LJJJJZI(gameTag)) == null) {
            str = "";
        }
        c48459J0d4.LIZ(str);
        if (gameTag == null) {
            return;
        }
        if (hashtag != null) {
            l3 = hashtag.id;
        } else {
            l3 = null;
        }
        Hashtag LIZ6 = C28514BHa.LIZ();
        if (LIZ6 != null) {
            l4 = LIZ6.id;
        } else {
            l4 = null;
        }
        if (o.LJ(l3, l4)) {
            return;
        }
        C28514BHa.LIZIZ = null;
        c48459J0d4.LIZ("");
    }
}
