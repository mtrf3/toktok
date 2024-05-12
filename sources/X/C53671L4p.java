package X;

import kotlin.jvm.internal.o;

/* renamed from: X.L4p, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53671L4p {
    public static final /* synthetic */ int LIZ = 0;

    public static C53679L4x LIZIZ(boolean z, InterfaceC53515KzP avatarNodePosition, C53455KyR avatarNodeSize, L69 containerView) {
        C53527Kzb c53527Kzb;
        int i;
        int i2;
        int i3;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        C53442KyE c53442KyE = C53442KyE.LJLIL;
        o.LJIIIZ(avatarNodePosition, "avatarNodePosition");
        o.LJIIIZ(avatarNodeSize, "avatarNodeSize");
        o.LJIIIZ(containerView, "containerView");
        int LIZIZ = avatarNodePosition.LIZIZ();
        C53447KyJ LJ = C78929UyL.LJ(containerView);
        InterfaceC88472Yns<C53447KyJ, C53527Kzb> u1 = avatarNodePosition.u1();
        if (u1 != null) {
            c53527Kzb = u1.invoke(LJ);
        } else {
            c53527Kzb = null;
        }
        C71799SFv avatar = containerView.getAvatar();
        int i10 = 0;
        if (c53442KyE != null) {
            i = (int) ((Number) c53442KyE.invoke(LJ)).floatValue();
        } else {
            i = 0;
        }
        InterfaceC88472Yns<C53447KyJ, Float> interfaceC88472Yns = avatarNodeSize.LIZIZ;
        if (interfaceC88472Yns != null) {
            i2 = (int) interfaceC88472Yns.invoke(LJ).floatValue();
        } else {
            i2 = 0;
        }
        InterfaceC88472Yns<C53447KyJ, Float> interfaceC88472Yns2 = avatarNodeSize.LIZIZ;
        if (interfaceC88472Yns2 != null) {
            i3 = (int) interfaceC88472Yns2.invoke(LJ).floatValue();
        } else {
            i3 = 0;
        }
        if ((LIZIZ & 80) == 80) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i11 = -1;
        if (z2) {
            int bottom = avatar.getBottom();
            if (c53527Kzb != null) {
                i9 = c53527Kzb.LJLJI;
            } else {
                i9 = 0;
            }
            int i12 = bottom - i9;
            int i13 = i / 2;
            i5 = i12 + i13;
            i4 = (i5 - i3) - i13;
        } else {
            if ((LIZIZ & 48) == 48) {
                int top = avatar.getTop();
                if (c53527Kzb != null) {
                    i7 = c53527Kzb.LJLJJI;
                } else {
                    i7 = 0;
                }
                i4 = top + i7;
                i6 = i3 + i4;
            } else if ((LIZIZ & 16) == 16) {
                int bottom2 = ((avatar.getBottom() - avatar.getTop()) / 2) + avatar.getTop();
                int i14 = i3 / 2;
                i4 = bottom2 - i14;
                i6 = i14 + bottom2;
            } else {
                i4 = -1;
                i5 = -1;
            }
            i5 = i6;
        }
        if ((LIZIZ & 8388611) == 8388611) {
            if (z && C26338AVi.LIZLLL(avatar)) {
                int right = avatar.getRight();
                if (c53527Kzb != null) {
                    i10 = c53527Kzb.LJLILLLLZI;
                }
                i8 = right - i10;
                i11 = i8 - i2;
            } else {
                int left = avatar.getLeft();
                if (c53527Kzb != null) {
                    i10 = c53527Kzb.LJLILLLLZI;
                }
                i11 = left + i10;
                i8 = i11 + i2;
            }
        } else if ((LIZIZ & 8388613) == 8388613) {
            if (z && C26338AVi.LIZLLL(avatar)) {
                int left2 = avatar.getLeft();
                if (c53527Kzb != null) {
                    i10 = c53527Kzb.LJLIL;
                }
                int i15 = i / 2;
                i11 = (left2 + i10) - i15;
                i8 = i2 + i11 + i15;
            } else {
                int right2 = avatar.getRight();
                if (c53527Kzb != null) {
                    i10 = c53527Kzb.LJLIL;
                }
                int i16 = i / 2;
                i8 = (right2 - i10) + i16;
                i11 = (i8 - i2) - i16;
            }
        } else if ((LIZIZ & 1) == 1) {
            int right3 = ((avatar.getRight() - avatar.getLeft()) / 2) + avatar.getLeft();
            int i17 = i2 / 2;
            i8 = right3 + i17;
            i11 = right3 - i17;
        } else {
            i8 = -1;
        }
        return new C53679L4x(i11, i8, i4, i5);
    }

    public static C53674L4s LIZ(boolean z, InterfaceC53515KzP avatarNodePosition, C53455KyR avatarNodeSize, L69 containerView, InterfaceC88472Yns interfaceC88472Yns) {
        C53527Kzb c53527Kzb;
        float f;
        boolean z2;
        float f2;
        float bottom;
        int i;
        float right;
        int right2;
        int left;
        int i2;
        o.LJIIIZ(avatarNodePosition, "avatarNodePosition");
        o.LJIIIZ(avatarNodeSize, "avatarNodeSize");
        o.LJIIIZ(containerView, "containerView");
        C71799SFv avatar = containerView.getAvatar();
        C53447KyJ LJ = C78929UyL.LJ(containerView);
        int LIZIZ = avatarNodePosition.LIZIZ();
        InterfaceC88472Yns<C53447KyJ, C53527Kzb> u1 = avatarNodePosition.u1();
        if (u1 != null) {
            c53527Kzb = u1.invoke(LJ);
        } else {
            c53527Kzb = null;
        }
        InterfaceC88472Yns<C53447KyJ, Float> interfaceC88472Yns2 = avatarNodeSize.LIZIZ;
        float f3 = 0.0f;
        if (interfaceC88472Yns2 != null) {
            f = interfaceC88472Yns2.invoke(LJ).floatValue();
        } else {
            f = 0.0f;
        }
        if (interfaceC88472Yns != null) {
            f3 = ((Number) interfaceC88472Yns.invoke(LJ)).floatValue();
        }
        float f4 = f3 + f;
        int i3 = 0;
        if ((LIZIZ & 80) == 80) {
            z2 = true;
        } else {
            z2 = false;
        }
        float f5 = -1.0f;
        if (z2) {
            int bottom2 = avatar.getBottom();
            if (c53527Kzb != null) {
                i2 = c53527Kzb.LJLJI;
            } else {
                i2 = 0;
            }
            f2 = (bottom2 - i2) - (f4 / 2);
        } else {
            if ((LIZIZ & 48) == 48) {
                int top = avatar.getTop();
                if (c53527Kzb != null) {
                    i = c53527Kzb.LJLJJI;
                } else {
                    i = 0;
                }
                bottom = top + i;
            } else if ((LIZIZ & 16) == 16) {
                bottom = ((avatar.getBottom() - avatar.getTop()) / 2) + avatar.getTop();
            } else {
                f2 = -1.0f;
            }
            f2 = bottom + (f4 / 2);
        }
        if ((LIZIZ & 8388611) == 8388611) {
            if (z && C26338AVi.LIZLLL(containerView)) {
                right2 = avatar.getRight();
                if (c53527Kzb != null) {
                    i3 = c53527Kzb.LJLILLLLZI;
                }
                f5 = (right2 - i3) - (f4 / 2);
            } else {
                left = avatar.getLeft();
                if (c53527Kzb != null) {
                    i3 = c53527Kzb.LJLILLLLZI;
                }
                right = left + i3;
                f5 = (f4 / 2) + right;
            }
        } else if ((LIZIZ & 8388613) == 8388613) {
            if (z && C26338AVi.LIZLLL(containerView)) {
                left = avatar.getLeft();
                if (c53527Kzb != null) {
                    i3 = c53527Kzb.LJLIL;
                }
                right = left + i3;
                f5 = (f4 / 2) + right;
            } else {
                right2 = avatar.getRight();
                if (c53527Kzb != null) {
                    i3 = c53527Kzb.LJLIL;
                }
                f5 = (right2 - i3) - (f4 / 2);
            }
        } else if ((LIZIZ & 1) == 1) {
            right = ((avatar.getRight() - avatar.getLeft()) / 2) + avatar.getLeft();
            f5 = (f4 / 2) + right;
        }
        return new C53674L4s(f5, f2, f / 2);
    }
}
