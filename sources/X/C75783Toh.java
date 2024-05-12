package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestSearchFeedGuestSizeOptSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3AddHostTag;
import com.bytedance.android.livesdk.livesetting.other.LiveImageLoaderModuleSetting;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS163S0100000_13;

/* renamed from: X.Toh, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75783Toh extends C75785Toj {
    public static final /* synthetic */ int LJJIFFI = 0;
    public final String LJI;
    public LinkPlayerInfo LJII;
    public boolean LJIIIIZZ;
    public EnumC74991Tbv LJIIIZ;
    public C47061t0 LJIIJ;
    public C47061t0 LJIIJJI;
    public C47061t0 LJIIL;
    public FrameLayout LJIILIIL;
    public ConstraintLayout LJIILJJIL;
    public C47061t0 LJIILL;
    public C47121t6 LJIILLIIL;
    public C47121t6 LJIIZILJ;
    public boolean LJIJ;
    public boolean LJIJI;
    public ViewGroup LJIJJ;
    public View LJIJJLI;
    public View LJIL;
    public View LJJ;
    public final C62822Ol8 LJJI;

    @Override // X.C75785Toj, X.AbstractC75784Toi
    public final int LIZIZ() {
        return R.layout.dfe;
    }

    @Override // X.AbstractC75784Toi
    public final void LIZLLL() {
        C75378TiA c75378TiA = (C75378TiA) this.LJJI.getValue();
        if (c75378TiA != null) {
            C73411SrX c73411SrX = c75378TiA.LIZLLL;
            if (c73411SrX != null) {
                c73411SrX.dispose();
            }
            c75378TiA.LIZLLL = null;
        }
        super.LIZLLL();
    }

    @Override // X.C75785Toj
    public final void LJFF() {
        super.LJFF();
        ViewGroup viewGroup = this.LIZ;
        if (viewGroup != null) {
            C87277YNd.LJJIJ(viewGroup);
        }
        ViewGroup viewGroup2 = this.LJIJJ;
        if (viewGroup2 != null) {
            C87277YNd.LJJIJ(viewGroup2);
        }
    }

    @Override // X.C75785Toj
    public final void LJI() {
        super.LJI();
        ViewGroup viewGroup = this.LIZ;
        if (viewGroup != null) {
            C87277YNd.LJJIJ(viewGroup);
        }
        ViewGroup viewGroup2 = this.LJIJJ;
        if (viewGroup2 != null) {
            C87277YNd.LJJIJ(viewGroup2);
        }
    }

    @Override // X.C75785Toj, X.AbstractC75784Toi
    public final String LIZ() {
        return this.LJI;
    }

    public C75783Toh(String str) {
        super(0);
        this.LJI = str;
        this.LJJI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 602));
    }

    @Override // X.C75785Toj, X.AbstractC75784Toi
    public final void LIZJ(ViewGroup viewGroup) {
        C47061t0 c47061t0;
        C47061t0 c47061t02;
        C47061t0 c47061t03;
        FrameLayout frameLayout;
        ConstraintLayout constraintLayout;
        C47061t0 c47061t04;
        C47121t6 c47121t6;
        C47121t6 c47121t62;
        ViewGroup viewGroup2;
        View view;
        ViewGroup viewGroup3;
        View view2;
        View view3;
        super.LIZJ(viewGroup);
        View view4 = null;
        if (viewGroup != null) {
            c47061t0 = (C47061t0) viewGroup.findViewById(R.id.f6u);
        } else {
            c47061t0 = null;
        }
        this.LJIIJ = c47061t0;
        if (viewGroup != null) {
            c47061t02 = (C47061t0) viewGroup.findViewById(R.id.f6t);
        } else {
            c47061t02 = null;
        }
        this.LJIIJJI = c47061t02;
        if (viewGroup != null) {
            c47061t03 = (C47061t0) viewGroup.findViewById(R.id.hba);
        } else {
            c47061t03 = null;
        }
        this.LJIIL = c47061t03;
        if (viewGroup != null) {
            frameLayout = (FrameLayout) viewGroup.findViewById(R.id.a_9);
        } else {
            frameLayout = null;
        }
        this.LJIILIIL = frameLayout;
        if (frameLayout != null) {
            C87277YNd.LJJIIZ(frameLayout);
        }
        if (viewGroup != null) {
            constraintLayout = (ConstraintLayout) viewGroup.findViewById(R.id.d8a);
        } else {
            constraintLayout = null;
        }
        this.LJIILJJIL = constraintLayout;
        if (constraintLayout != null) {
            C87277YNd.LJJIIZ(constraintLayout);
        }
        if (viewGroup != null) {
            c47061t04 = (C47061t0) viewGroup.findViewById(R.id.d8b);
        } else {
            c47061t04 = null;
        }
        this.LJIILL = c47061t04;
        if (viewGroup != null) {
            c47121t6 = (C47121t6) viewGroup.findViewById(R.id.d8c);
        } else {
            c47121t6 = null;
        }
        this.LJIILLIIL = c47121t6;
        if (viewGroup != null) {
            c47121t62 = (C47121t6) viewGroup.findViewById(R.id.d8d);
        } else {
            c47121t62 = null;
        }
        this.LJIIZILJ = c47121t62;
        if (viewGroup != null) {
            viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.g1n);
        } else {
            viewGroup2 = null;
        }
        this.LJ = viewGroup2;
        if (viewGroup != null) {
            view = viewGroup.findViewById(R.id.eze);
        } else {
            view = null;
        }
        this.LJFF = view;
        ViewGroup viewGroup4 = this.LJ;
        if (viewGroup4 != null) {
            C87277YNd.LJJIIZ(viewGroup4);
        }
        View view5 = this.LJFF;
        if (view5 != null) {
            C87277YNd.LJJIIZ(view5);
        }
        if (viewGroup != null) {
            viewGroup3 = (ViewGroup) viewGroup.findViewById(R.id.deu);
        } else {
            viewGroup3 = null;
        }
        this.LJIJJ = viewGroup3;
        if (viewGroup3 != null) {
            C87277YNd.LJJIIZ(viewGroup3);
        }
        if (viewGroup != null) {
            view2 = viewGroup.findViewById(R.id.hay);
        } else {
            view2 = null;
        }
        this.LJIJJLI = view2;
        if (view2 != null) {
            C87277YNd.LJJIIZ(view2);
        }
        if (viewGroup != null) {
            view3 = viewGroup.findViewById(R.id.e7e);
        } else {
            view3 = null;
        }
        this.LJIL = view3;
        if (viewGroup != null) {
            view4 = viewGroup.findViewById(R.id.d8w);
        }
        this.LJJ = view4;
        if (CCJ.LIZ(C39849FkT.LIZ())) {
            ViewGroup viewGroup5 = this.LIZIZ;
            if (viewGroup5 != null) {
                viewGroup5.setLayoutDirection(1);
            }
            ViewGroup viewGroup6 = this.LIZIZ;
            if (viewGroup6 != null) {
                viewGroup6.setTextDirection(4);
            }
            View view6 = this.LJIL;
            if (view6 != null) {
                view6.setLayoutDirection(1);
            }
            View view7 = this.LJIL;
            if (view7 == null) {
                return;
            }
            view7.setTextDirection(4);
        }
    }

    public final void LJII(int i) {
        boolean z;
        User user;
        ImageModel avatarThumb;
        ViewGroup.LayoutParams layoutParams;
        int i2;
        int i3 = 0;
        if (i == 0 || i == 1 || i != 2) {
            z = false;
        } else {
            z = true;
        }
        this.LJIJI = z;
        if (z) {
            LinkPlayerInfo linkPlayerInfo = this.LJII;
            if (linkPlayerInfo != null && (user = linkPlayerInfo.mUser) != null && (avatarThumb = user.getAvatarThumb()) != null) {
                LJIIIZ(avatarThumb, this.LJIIIZ);
                C15540jG c15540jG = new C15540jG();
                C47061t0 c47061t0 = this.LJIILL;
                if (c47061t0 != null) {
                    c15540jG.LIZ = c47061t0;
                    c15540jG.LIZIZ = CFX.LIZ("tiktok_live_watch_resource", "tiktok_live_watch_resource_normal_1");
                    c15540jG.LIZJ = "ttlive_pause_live_anim.webp";
                    c15540jG.LJFF = true;
                }
                C15490jB.LJI(c15540jG);
                C47061t0 c47061t02 = this.LJIIJJI;
                if (c47061t02 != null) {
                    C87277YNd.LJJIIZ(c47061t02);
                }
                ConstraintLayout constraintLayout = this.LJIILJJIL;
                if (constraintLayout != null) {
                    C87277YNd.LJJIJ(constraintLayout);
                }
                C47121t6 c47121t6 = this.LJIIZILJ;
                if (c47121t6 != null) {
                    if (this.LJIIIIZZ) {
                        i2 = R.string.kat;
                    } else {
                        i2 = R.string.lt7;
                    }
                    c47121t6.setText(i2);
                }
                ViewGroup viewGroup = this.LIZIZ;
                if (viewGroup != null && (layoutParams = viewGroup.getLayoutParams()) != null) {
                    i3 = layoutParams.height;
                }
                TBH.LIZ(i3, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ);
            }
            View view = this.LJJ;
            if (view != null) {
                C87277YNd.LJJIIZ(view);
                return;
            }
            return;
        }
        ConstraintLayout constraintLayout2 = this.LJIILJJIL;
        if (constraintLayout2 != null) {
            C87277YNd.LJJIIZ(constraintLayout2);
        }
        if (this.LJIJ) {
            C47061t0 c47061t03 = this.LJIIJJI;
            if (c47061t03 == null) {
                return;
            }
            C87277YNd.LJJIJ(c47061t03);
            return;
        }
        FrameLayout frameLayout = this.LJIILIIL;
        if (frameLayout != null) {
            C87277YNd.LJJIIZ(frameLayout);
        }
        ViewGroup viewGroup2 = this.LJIJJ;
        if (viewGroup2 == null) {
            return;
        }
        C87277YNd.LJJIIZ(viewGroup2);
    }

    public static void LJIIJ(C47061t0 c47061t0, float f) {
        if (c47061t0 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = c47061t0.getLayoutParams();
        layoutParams.height = C15380j0.LIZ(f);
        layoutParams.width = C15380j0.LIZ(f);
        c47061t0.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [X.W5O, REQUEST] */
    public final void LJIIIZ(ImageModel imageModel, EnumC74991Tbv enumC74991Tbv) {
        ViewGroup viewGroup;
        int i;
        int i2;
        int i3;
        float f;
        if (this.LIZIZ == null || (viewGroup = this.LIZ) == null) {
            return;
        }
        C87277YNd.LJJIJ(viewGroup);
        FrameLayout frameLayout = this.LJIILIIL;
        if (frameLayout != null) {
            C87277YNd.LJJIJ(frameLayout);
        }
        ViewGroup viewGroup2 = this.LJ;
        if (viewGroup2 != null) {
            C87277YNd.LJJIIZ(viewGroup2);
        }
        View view = this.LJFF;
        if (view != null) {
            C87277YNd.LJJIIZ(view);
        }
        C47061t0 c47061t0 = this.LJIIJJI;
        int i4 = 0;
        if (c47061t0 != null && enumC74991Tbv != null) {
            if (MultiGuestSearchFeedGuestSizeOptSettings.INSTANCE.getValue()) {
                ViewGroup viewGroup3 = this.LIZIZ;
                if (viewGroup3 != null) {
                    i2 = viewGroup3.getMeasuredWidth();
                } else {
                    i2 = 0;
                }
                if (i2 > C15380j0.LIZ(104.0f)) {
                    LJIIJ(c47061t0, 60.0f);
                    LJIIJ(this.LJIIL, 96.0f);
                } else if (i2 > C15380j0.LIZ(50.0f)) {
                    LJIIJ(c47061t0, 40.0f);
                    LJIIJ(this.LJIIL, 64.0f);
                } else {
                    LJIIJ(c47061t0, 24.0f);
                    LJIIJ(this.LJIIL, 38.0f);
                }
            } else {
                ViewGroup viewGroup4 = this.LIZIZ;
                if (viewGroup4 != null) {
                    i = viewGroup4.getMeasuredWidth();
                } else {
                    i = 0;
                }
                if (i > C15380j0.LIZ(104.0f)) {
                    LJIIJ(c47061t0, 60.0f);
                    LJIIJ(this.LJIIL, 96.0f);
                } else {
                    LJIIJ(c47061t0, 40.0f);
                    LJIIJ(this.LJIIL, 64.0f);
                }
            }
        }
        C47061t0 c47061t02 = this.LJIIJJI;
        if (c47061t02 != null) {
            if (LiveImageLoaderModuleSetting.useImageModule()) {
                C78720Uuy LJIIIZ = C15650jR.LIZ().LJIIIZ(imageModel);
                LJIIIZ.LJIIIIZZ = R.drawable.cuk;
                int width = c47061t02.getWidth();
                int height = c47061t02.getHeight();
                LJIIIZ.LJ = width;
                LJIIIZ.LJFF = height;
                LJIIIZ.LJIIL = Boolean.TRUE;
                LJIIIZ.LJIIJJI(c47061t02);
            } else {
                C31665Cbl.LJIIJ(c47061t02, imageModel, c47061t02.getWidth(), c47061t02.getHeight(), R.drawable.cuk);
            }
        }
        C47061t0 c47061t03 = this.LJIIJ;
        if (c47061t03 != null) {
            if (this.LJIIIIZZ && enumC74991Tbv == EnumC74991Tbv.FLOAT) {
                C87277YNd.LJJIIZ(c47061t03);
                return;
            }
            C87277YNd.LJJIJ(c47061t03);
            ViewGroup viewGroup5 = this.LIZIZ;
            if (viewGroup5 != null) {
                i3 = viewGroup5.getHeight();
            } else {
                i3 = 0;
            }
            ViewGroup viewGroup6 = this.LIZIZ;
            if (viewGroup6 != null) {
                i4 = viewGroup6.getWidth();
            }
            if (i3 == 0 || i4 == 0) {
                f = 0.74698794f;
            } else {
                f = i4 / i3;
            }
            C78739UvH c78739UvH = new C78739UvH(f);
            if (imageModel.getUrls() != null && imageModel.getUrls().size() != 0) {
                if (LiveImageLoaderModuleSetting.useImageModule()) {
                    C78720Uuy LJIIIZ2 = C15650jR.LIZ().LJIIIZ(imageModel);
                    LJIIIZ2.LIZIZ(f);
                    LJIIIZ2.LJIIJJI(c47061t03);
                    return;
                }
                C31665Cbl.LJFF(c47061t03, imageModel, c78739UvH);
                return;
            }
            W5P LIZJ = W5P.LIZJ(R.drawable.cuk);
            LIZJ.LJIIJ = c78739UvH;
            ?? LIZ = LIZJ.LIZ();
            C81705W4v LIZJ2 = W5I.LIZJ();
            LIZJ2.LIZLLL = LIZ;
            LIZJ2.LJIIL = c47061t03.getController();
            c47061t03.setController(LIZJ2.LIZ());
        }
    }

    public final void LJIIJJI(int i, boolean z) {
        EnumC74991Tbv enumC74991Tbv;
        if (this.LJIIIIZZ) {
            if (z) {
                ViewGroup viewGroup = this.LIZ;
                if (viewGroup != null) {
                    C87277YNd.LJJIJ(viewGroup);
                }
                C29306Beo.LJJLJLI(this.LJIJJLI);
                return;
            }
            if (1 == MultiGuestV3AddHostTag.getValue() && ((enumC74991Tbv = this.LJIIIZ) == EnumC74991Tbv.GRID_FIX || enumC74991Tbv == EnumC74991Tbv.FLOAT_FIX || ((enumC74991Tbv == EnumC74991Tbv.GRID_FLOAT && i > 1) || enumC74991Tbv == EnumC74991Tbv.ZOOM_GRID_ANCHOR))) {
                ViewGroup viewGroup2 = this.LIZ;
                if (viewGroup2 != null) {
                    C87277YNd.LJJIJ(viewGroup2);
                }
                C29306Beo.LJJLJLI(this.LJIJJLI);
                return;
            }
            C29306Beo.LJI(this.LJIJJLI);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(int r2, X.EnumC74991Tbv r3, boolean r4) {
        /*
            r1 = this;
            if (r4 == 0) goto L36
            com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo r0 = r1.LJII
            if (r0 == 0) goto L17
            com.bytedance.android.live.base.model.user.User r0 = r0.mUser
            if (r0 == 0) goto L17
            com.bytedance.android.live.base.model.ImageModel r0 = r0.getAvatarThumb()
            if (r0 == 0) goto L17
            r1.LJIIIZ(r0, r3)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L1b
        L17:
            boolean r0 = r1.LJIIIIZZ
            if (r0 == 0) goto L1e
        L1b:
            r1.LJIJ = r4
            return
        L1e:
            X.Tbv r0 = X.EnumC74991Tbv.FLOAT_FIX
            if (r3 == r0) goto L26
            X.Tbv r0 = X.EnumC74991Tbv.GRID_FIX
            if (r3 != r0) goto L1b
        L26:
            java.lang.String r0 = "show empty view."
            X.C0NB.LIZ(r0)
            r0 = 3
            if (r2 == r0) goto L32
            r1.LJFF()
            goto L1b
        L32:
            r1.LJI()
            goto L1b
        L36:
            android.view.ViewGroup r0 = r1.LJIJJ
            if (r0 == 0) goto L1b
            X.C87277YNd.LJJIIZ(r0)
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75783Toh.LJIIIIZZ(int, X.Tbv, boolean):void");
    }
}
