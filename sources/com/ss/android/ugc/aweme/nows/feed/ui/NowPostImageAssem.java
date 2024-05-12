package com.ss.android.ugc.aweme.nows.feed.ui;

import X.AnonymousClass064;
import X.AnonymousClass391;
import X.C00F;
import X.C16880lQ;
import X.C181847Bs;
import X.C194237jn;
import X.C194437k7;
import X.C195647m4;
import X.C195937mX;
import X.C196157mt;
import X.C196367nE;
import X.C196557nX;
import X.C196567nY;
import X.C196597nb;
import X.C196607nc;
import X.C196617nd;
import X.C196627ne;
import X.C210188Ms;
import X.C213688a4;
import X.C214348b8;
import X.C221108m2;
import X.C26338AVi;
import X.C32151Nz;
import X.C47704Ins;
import X.C51029K0z;
import X.C55749LuL;
import X.C55953Lxd;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78939UyV;
import X.C7MK;
import X.C7ML;
import X.C7MY;
import X.C8YN;
import X.EnumC196637nf;
import X.InterfaceC115514g7;
import X.InterfaceC194547kI;
import X.InterfaceC197307ok;
import X.InterfaceC74236TBo;
import X.S3I;
import X.S3L;
import X.TBT;
import X.ViewOnTouchListenerC197297oj;
import X.W5F;
import X.W5U;
import X.X1D;
import Y.ACListenerS23S0100000_3;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowAreaMonitorViewModel;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS27S0210000_3;
import kotlin.jvm.internal.AqS71S1100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowPostImageAssem extends NowPostTypeAssem<NowPostImageAssem, C195647m4> implements InterfaceC197307ok {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIJLIL;
    public final C55749LuL LLI;
    public final InterfaceC115514g7 LLIFFJFJJ;
    public ConstraintLayout LLII;
    public SmartImageView LLIIII;
    public SmartImageView LLIIIILZ;
    public TuxIconView LLIIIJ;
    public TuxIconView LLIIIL;
    public final C62822Ol8 LLIIIZ;
    public boolean LLIIJI;

    static {
        TBT tbt = new TBT(NowPostImageAssem.class, "areaMonitorVM", "getAreaMonitorVM()Lcom/ss/android/ugc/aweme/nows/feed/viewmodel/NowAreaMonitorViewModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLIIJLIL = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.byq;
    }

    public NowPostImageAssem() {
        new LinkedHashMap();
        this.LLI = new C55749LuL(C47704Ins.LIZJ(this, C181847Bs.class, "now_feed_hierarchy_data_key"), checkSupervisorPrepared());
        C65776Prg LIZ = C65352Pkq.LIZ(NowAreaMonitorViewModel.class);
        this.LLIFFJFJJ = C214348b8.LIZ(this, LIZ, null, new AqS153S0100000_3(LIZ, 620), null, C196607nc.INSTANCE, null, null);
        this.LLIIIZ = C221108m2.LIZIZ(C196617nd.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.NowPostTypeAssem
    public final SmartImageView n4() {
        SmartImageView smartImageView = this.LLIIII;
        if (smartImageView != null) {
            return smartImageView;
        }
        o.LJIJI("largeWindow");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.NowPostTypeAssem
    public final SmartImageView q4() {
        SmartImageView smartImageView = this.LLIIIILZ;
        if (smartImageView != null) {
            return smartImageView;
        }
        o.LJIJI("smallWindow");
        throw null;
    }

    public final C181847Bs z4() {
        return (C181847Bs) this.LLI.getValue();
    }

    public final String A4() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SmallWindowPosition-");
        LIZ.append(((C195647m4) C51029K0z.LJIILLIIL(this)).LJLIL.getAid());
        return X1D.LIZIZ(LIZ);
    }

    public final String u4() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FlipState-");
        LIZ.append(((C195647m4) C51029K0z.LJIILLIIL(this)).LJLIL.getAid());
        return X1D.LIZIZ(LIZ);
    }

    public final void B4(UrlModel urlModel) {
        W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
        C196367nE.LIZ.getClass();
        LJII.LJIJI = C196367nE.LIZIZ();
        LJII.LIZJ = getContext();
        if (C210188Ms.LIZLLL()) {
            LJII.LJIIJ();
        } else {
            LJII.LJIIIIZZ();
        }
    }

    public final void C4(boolean z) {
        if (this.LLIIJI) {
            InterfaceC194547kI item = (InterfaceC194547kI) C51029K0z.LJIILLIIL(this);
            C181847Bs nowsFeedHierarchyData = z4();
            o.LJIIIZ(item, "item");
            o.LJIIIZ(nowsFeedHierarchyData, "nowsFeedHierarchyData");
            C7MK.LJII("click_now_retry", new AqS27S0210000_3(item, nowsFeedHierarchyData, z, 9));
        }
    }

    @Override // X.C8XO
    public final void F0(Object item) {
        o.LJIIIZ(item, "item");
        C194237jn.LIZ(this, p4());
        this.LLIIJI = false;
    }

    @Override // X.InterfaceC197307ok
    public final void LJJJLL(View v) {
        o.LJIIIZ(v, "v");
        C8YN.LJIJI(p4(), new AqS169S0100000_3(this, 318));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLII = (ConstraintLayout) C7MY.LIZLLL(view, "view", R.id.ehv, "view.findViewById(R.id.image_root_view)");
        View findViewById = view.findViewById(R.id.ayn);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.btn_retry_load)");
        this.LLIIIJ = (TuxIconView) findViewById;
        View findViewById2 = view.findViewById(R.id.j3f);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.ring_loading)");
        this.LLIIIL = (TuxIconView) findViewById2;
        View findViewById3 = view.findViewById(R.id.h70);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.now_large_window)");
        this.LLIIII = (SmartImageView) findViewById3;
        View findViewById4 = view.findViewById(R.id.h7v);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.now_small_window)");
        this.LLIIIILZ = (SmartImageView) findViewById4;
        boolean z = true;
        if (C00F.LIZ(31744, 0, "now_feed_fps_opt", true) != 0) {
            z = false;
        }
        if (z) {
            SmartImageView smartImageView = this.LLIIII;
            if (smartImageView != null) {
                S3I s3i = new S3I();
                s3i.LIZLLL = C32151Nz.LJIIZILJ(28);
                smartImageView.setCircleOptions(new S3L(s3i));
            } else {
                o.LJIJI("largeWindow");
                throw null;
            }
        }
        SmartImageView smartImageView2 = this.LLIIIILZ;
        if (smartImageView2 != null) {
            S3I s3i2 = new S3I();
            s3i2.LIZLLL = C32151Nz.LJIIZILJ(18);
            float LJIIZILJ = C32151Nz.LJIIZILJ(2);
            s3i2.LIZJ = -16777216;
            s3i2.LIZIZ = LJIIZILJ;
            smartImageView2.setCircleOptions(new S3L(s3i2));
            SmartImageView smartImageView3 = this.LLIIIILZ;
            if (smartImageView3 != null) {
                ConstraintLayout constraintLayout = this.LLII;
                if (constraintLayout != null) {
                    smartImageView3.setOnTouchListener(new ViewOnTouchListenerC197297oj(smartImageView3, constraintLayout, this));
                    p4().hv0(this, C213688a4.LIZLLL());
                    C8YN.LJII(this, (AssemViewModel) this.LLIFFJFJJ.LIZ(this, LLIIJLIL[0]), new TBT() { // from class: X.7nT
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((C196287n6) obj).LJLILLLLZI;
                        }
                    }, C213688a4.LIZLLL(), C196567nY.LJLIL, 4);
                    C8YN.LJII(this, p4(), new TBT() { // from class: X.7nU
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return Boolean.valueOf(((C194437k7) obj).LJLLI);
                        }
                    }, C213688a4.LIZLLL(), C196557nX.LJLIL, 4);
                    return;
                }
                o.LJIJI("imageRootView");
                throw null;
            }
            o.LJIJI("smallWindow");
            throw null;
        }
        o.LJIJI("smallWindow");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.NowPostTypeAssem, X.InterfaceC193877jD
    public final void t1(C194437k7 nowPostCellState) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        float f;
        UrlModel urlModel;
        UrlModel urlModel2;
        UrlModel urlModel3;
        UrlModel urlModel4;
        C196597nb c196597nb;
        UrlModel urlModel5;
        UrlModel urlModel6;
        UrlModel urlModel7;
        UrlModel urlModel8;
        UrlModel urlModel9;
        UrlModel urlModel10;
        UrlModel urlModel11;
        UrlModel urlModel12;
        o.LJIIIZ(nowPostCellState, "nowPostCellState");
        NowPostInfo nowPostInfo = ((C195647m4) C51029K0z.LJIILLIIL(this)).LJLIL.nowPostInfo;
        SmartImageView smartImageView = this.LLIIII;
        if (smartImageView != null) {
            smartImageView.setVisibility(0);
            TuxIconView tuxIconView = this.LLIIIJ;
            if (tuxIconView != null) {
                tuxIconView.setVisibility(8);
                Bundle bundle = z4().LJLJI;
                int i3 = z4().LJLJI.getInt(A4(), 17);
                if ((i3 & 16) > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if ((i3 & 1) > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                AnonymousClass064 anonymousClass064 = new AnonymousClass064();
                ConstraintLayout constraintLayout = this.LLII;
                if (constraintLayout != null) {
                    anonymousClass064.LJII(constraintLayout);
                    SmartImageView smartImageView2 = this.LLIIIILZ;
                    if (smartImageView2 != null) {
                        anonymousClass064.LJFF(smartImageView2.getId());
                        if (z) {
                            i = 6;
                        } else {
                            i = 7;
                        }
                        SmartImageView smartImageView3 = this.LLIIIILZ;
                        if (smartImageView3 != null) {
                            int id = smartImageView3.getId();
                            ConstraintLayout constraintLayout2 = this.LLII;
                            if (constraintLayout2 != null) {
                                anonymousClass064.LJIIIIZZ(id, i, constraintLayout2.getId(), i);
                                if (z2) {
                                    i2 = 3;
                                } else {
                                    i2 = 4;
                                }
                                SmartImageView smartImageView4 = this.LLIIIILZ;
                                if (smartImageView4 != null) {
                                    int id2 = smartImageView4.getId();
                                    ConstraintLayout constraintLayout3 = this.LLII;
                                    if (constraintLayout3 != null) {
                                        anonymousClass064.LJIIIIZZ(id2, i2, constraintLayout3.getId(), i2);
                                        if (AVExternalServiceImpl.LIZ().configService().avsettingsConfig().enableNowsSelfieWindowGoldenRatio()) {
                                            f = 0.382f;
                                        } else {
                                            f = 0.32f;
                                        }
                                        SmartImageView smartImageView5 = this.LLIIIILZ;
                                        if (smartImageView5 != null) {
                                            anonymousClass064.LJIIJJI(f, smartImageView5.getId());
                                            SmartImageView smartImageView6 = this.LLIIIILZ;
                                            if (smartImageView6 != null) {
                                                anonymousClass064.LJIJI(smartImageView6.getId(), "H,3:4");
                                                ConstraintLayout constraintLayout4 = this.LLII;
                                                if (constraintLayout4 != null) {
                                                    anonymousClass064.LIZIZ(constraintLayout4);
                                                    SmartImageView smartImageView7 = this.LLIIIILZ;
                                                    if (smartImageView7 != null) {
                                                        C26338AVi.LJI(smartImageView7, AnonymousClass391.LIZJ(16), AnonymousClass391.LIZJ(16), AnonymousClass391.LIZJ(16), AnonymousClass391.LIZJ(16), false, 16);
                                                        Serializable serializable = bundle.getSerializable(u4());
                                                        if ((serializable instanceof C196597nb) && (c196597nb = (C196597nb) serializable) != null) {
                                                            EnumC196637nf largeImage = c196597nb.getLargeImage();
                                                            int[] iArr = C196627ne.LIZ;
                                                            int i4 = iArr[largeImage.ordinal()];
                                                            if (i4 != 3) {
                                                                if (i4 == 4) {
                                                                    String aid = ((C195647m4) C51029K0z.LJIILLIIL(this)).LJLIL.getAid();
                                                                    SmartImageView smartImageView8 = this.LLIIII;
                                                                    if (smartImageView8 != null) {
                                                                        C7ML c7ml = (C7ML) C51029K0z.LJIILLIIL(this);
                                                                        if (nowPostInfo != null) {
                                                                            urlModel11 = nowPostInfo.getFrontImage();
                                                                        } else {
                                                                            urlModel11 = null;
                                                                        }
                                                                        C195937mX.LJIIJ(smartImageView8, c7ml, 1, urlModel11, m4(), new AqS153S0100000_3(this, 1700), new AqS71S1100000_3(aid, this, 6));
                                                                        if (nowPostInfo != null) {
                                                                            urlModel12 = nowPostInfo.getBackImage();
                                                                        } else {
                                                                            urlModel12 = null;
                                                                        }
                                                                        B4(urlModel12);
                                                                        p4().kv0(new AqS169S0100000_3(nowPostInfo, 963));
                                                                    } else {
                                                                        o.LJIJI("largeWindow");
                                                                        throw null;
                                                                    }
                                                                }
                                                            } else {
                                                                String aid2 = ((C195647m4) C51029K0z.LJIILLIIL(this)).LJLIL.getAid();
                                                                SmartImageView smartImageView9 = this.LLIIII;
                                                                if (smartImageView9 != null) {
                                                                    C7ML c7ml2 = (C7ML) C51029K0z.LJIILLIIL(this);
                                                                    if (nowPostInfo != null) {
                                                                        urlModel5 = nowPostInfo.getBackImage();
                                                                    } else {
                                                                        urlModel5 = null;
                                                                    }
                                                                    C195937mX.LJIIJ(smartImageView9, c7ml2, 1, urlModel5, m4(), new AqS153S0100000_3(this, 1699), new AqS71S1100000_3(aid2, this, 5));
                                                                    if (nowPostInfo != null) {
                                                                        urlModel6 = nowPostInfo.getFrontImage();
                                                                    } else {
                                                                        urlModel6 = null;
                                                                    }
                                                                    B4(urlModel6);
                                                                    p4().kv0(new AqS169S0100000_3(nowPostInfo, 960));
                                                                } else {
                                                                    o.LJIJI("largeWindow");
                                                                    throw null;
                                                                }
                                                            }
                                                            int i5 = iArr[c196597nb.getSmallImage().ordinal()];
                                                            if (i5 != 1) {
                                                                if (i5 == 2) {
                                                                    SmartImageView smartImageView10 = this.LLIIIILZ;
                                                                    if (smartImageView10 != null) {
                                                                        C7ML c7ml3 = (C7ML) C51029K0z.LJIILLIIL(this);
                                                                        if (nowPostInfo != null) {
                                                                            urlModel9 = nowPostInfo.getBackImageThumbnail();
                                                                        } else {
                                                                            urlModel9 = null;
                                                                        }
                                                                        C195937mX.LJIIJJI(smartImageView10, c7ml3, 1, urlModel9, null, new AqS153S0100000_3(this, 1702), 16);
                                                                        if (nowPostInfo != null) {
                                                                            urlModel10 = nowPostInfo.getFrontImageThumbnail();
                                                                        } else {
                                                                            urlModel10 = null;
                                                                        }
                                                                        B4(urlModel10);
                                                                        p4().kv0(new AqS169S0100000_3(nowPostInfo, 969));
                                                                    } else {
                                                                        o.LJIJI("smallWindow");
                                                                        throw null;
                                                                    }
                                                                }
                                                            } else {
                                                                SmartImageView smartImageView11 = this.LLIIIILZ;
                                                                if (smartImageView11 != null) {
                                                                    C7ML c7ml4 = (C7ML) C51029K0z.LJIILLIIL(this);
                                                                    if (nowPostInfo != null) {
                                                                        urlModel7 = nowPostInfo.getFrontImageThumbnail();
                                                                    } else {
                                                                        urlModel7 = null;
                                                                    }
                                                                    C195937mX.LJIIJJI(smartImageView11, c7ml4, 1, urlModel7, null, new AqS153S0100000_3(this, 1701), 16);
                                                                    if (nowPostInfo != null) {
                                                                        urlModel8 = nowPostInfo.getBackImageThumbnail();
                                                                    } else {
                                                                        urlModel8 = null;
                                                                    }
                                                                    B4(urlModel8);
                                                                    p4().kv0(new AqS169S0100000_3(nowPostInfo, 967));
                                                                } else {
                                                                    o.LJIJI("smallWindow");
                                                                    throw null;
                                                                }
                                                            }
                                                        } else {
                                                            String aid3 = ((C195647m4) C51029K0z.LJIILLIIL(this)).LJLIL.getAid();
                                                            SmartImageView smartImageView12 = this.LLIIII;
                                                            if (smartImageView12 != null) {
                                                                C7ML c7ml5 = (C7ML) C51029K0z.LJIILLIIL(this);
                                                                if (nowPostInfo != null) {
                                                                    urlModel = nowPostInfo.getBackImage();
                                                                } else {
                                                                    urlModel = null;
                                                                }
                                                                C195937mX.LJIIJ(smartImageView12, c7ml5, 1, urlModel, m4(), new AqS153S0100000_3(this, 1707), new AqS71S1100000_3(aid3, this, 7));
                                                                SmartImageView smartImageView13 = this.LLIIIILZ;
                                                                if (smartImageView13 != null) {
                                                                    C7ML c7ml6 = (C7ML) C51029K0z.LJIILLIIL(this);
                                                                    if (nowPostInfo != null) {
                                                                        urlModel2 = nowPostInfo.getFrontImageThumbnail();
                                                                    } else {
                                                                        urlModel2 = null;
                                                                    }
                                                                    C195937mX.LJIIJJI(smartImageView13, c7ml6, 1, urlModel2, null, new AqS153S0100000_3(this, 1708), 16);
                                                                    if (nowPostInfo != null) {
                                                                        urlModel3 = nowPostInfo.getFrontImage();
                                                                    } else {
                                                                        urlModel3 = null;
                                                                    }
                                                                    B4(urlModel3);
                                                                    if (nowPostInfo != null) {
                                                                        urlModel4 = nowPostInfo.getBackImageThumbnail();
                                                                    } else {
                                                                        urlModel4 = null;
                                                                    }
                                                                    B4(urlModel4);
                                                                } else {
                                                                    o.LJIJI("smallWindow");
                                                                    throw null;
                                                                }
                                                            } else {
                                                                o.LJIJI("largeWindow");
                                                                throw null;
                                                            }
                                                        }
                                                        SmartImageView smartImageView14 = this.LLIIIILZ;
                                                        if (smartImageView14 != null) {
                                                            C195937mX.LIZIZ(smartImageView14, nowPostInfo, 0);
                                                            return;
                                                        } else {
                                                            o.LJIJI("smallWindow");
                                                            throw null;
                                                        }
                                                    }
                                                    o.LJIJI("smallWindow");
                                                    throw null;
                                                }
                                                o.LJIJI("imageRootView");
                                                throw null;
                                            }
                                            o.LJIJI("smallWindow");
                                            throw null;
                                        }
                                        o.LJIJI("smallWindow");
                                        throw null;
                                    }
                                    o.LJIJI("imageRootView");
                                    throw null;
                                }
                                o.LJIJI("smallWindow");
                                throw null;
                            }
                            o.LJIJI("imageRootView");
                            throw null;
                        }
                        o.LJIJI("smallWindow");
                        throw null;
                    }
                    o.LJIJI("smallWindow");
                    throw null;
                }
                o.LJIJI("imageRootView");
                throw null;
            }
            o.LJIJI("retryLoadBtn");
            throw null;
        }
        o.LJIJI("largeWindow");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.NowPostTypeAssem, X.InterfaceC193877jD
    public final void x1(C194437k7 nowPostCellState) {
        o.LJIIIZ(nowPostCellState, "nowPostCellState");
        TuxIconView tuxIconView = this.LLIIIL;
        if (tuxIconView != null) {
            tuxIconView.clearAnimation();
            TuxIconView tuxIconView2 = this.LLIIIL;
            if (tuxIconView2 != null) {
                tuxIconView2.setVisibility(8);
                SmartImageView smartImageView = this.LLIIII;
                if (smartImageView != null) {
                    smartImageView.setVisibility(0);
                    TuxIconView tuxIconView3 = this.LLIIIJ;
                    if (tuxIconView3 != null) {
                        tuxIconView3.setVisibility(0);
                        TuxIconView tuxIconView4 = this.LLIIIJ;
                        if (tuxIconView4 != null) {
                            C16880lQ.LJJJ(tuxIconView4, new ACListenerS23S0100000_3(this, 99));
                            C8YN.LJIJI((AssemViewModel) this.LLIFFJFJJ.LIZ(this, LLIIJLIL[0]), new AqS169S0100000_3(this, 317));
                            return;
                        } else {
                            o.LJIJI("retryLoadBtn");
                            throw null;
                        }
                    }
                    o.LJIJI("retryLoadBtn");
                    throw null;
                }
                o.LJIJI("largeWindow");
                throw null;
            }
            o.LJIJI("loadRing");
            throw null;
        }
        o.LJIJI("loadRing");
        throw null;
    }

    @Override // X.InterfaceC197307ok
    public final void LJIJ(float f, View v) {
        boolean z;
        boolean z2;
        boolean z3;
        int width;
        boolean z4;
        String str;
        o.LJIIIZ(v, "v");
        int[] iArr = new int[2];
        ConstraintLayout constraintLayout = this.LLII;
        if (constraintLayout != null) {
            constraintLayout.getLocationOnScreen(iArr);
            ConstraintLayout constraintLayout2 = this.LLII;
            if (constraintLayout2 != null) {
                int i = 0;
                int width2 = (constraintLayout2.getWidth() / 2) + iArr[0];
                ConstraintLayout constraintLayout3 = this.LLII;
                if (constraintLayout3 != null) {
                    float x = constraintLayout3.getX();
                    if (f <= width2 && x <= f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Context context = getContext();
                    if (context != null && C26338AVi.LIZJ(context)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z ? !z2 : z2) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    int LIZIZ = C7MY.LIZIZ(16);
                    if (z) {
                        width = LIZIZ;
                    } else {
                        ConstraintLayout constraintLayout4 = this.LLII;
                        if (constraintLayout4 != null) {
                            int width3 = constraintLayout4.getWidth() - LIZIZ;
                            SmartImageView smartImageView = this.LLIIIILZ;
                            if (smartImageView != null) {
                                width = width3 - smartImageView.getWidth();
                            } else {
                                o.LJIJI("smallWindow");
                                throw null;
                            }
                        } else {
                            o.LJIJI("imageRootView");
                            throw null;
                        }
                    }
                    SmartImageView smartImageView2 = this.LLIIIILZ;
                    if (smartImageView2 != null) {
                        smartImageView2.animate().x(width).y(LIZIZ).setDuration(300L).setInterpolator(C55953Lxd.LJ()).start();
                        Integer valueOf = Integer.valueOf(z4().LJLJI.getInt(A4(), 17));
                        if ((16 & valueOf.intValue()) > 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4 != z3) {
                            valueOf.intValue();
                            if (z3) {
                                i = 16;
                            }
                            z4().LJLJI.putInt(A4(), i | 1);
                        }
                        if (z) {
                            str = "top_left_corner";
                        } else {
                            str = "top_right_corner";
                        }
                        C196157mt.LIZIZ((InterfaceC194547kI) C51029K0z.LJIILLIIL(this), str, "drag", C7MK.LIZLLL(z4().LJLILLLLZI, (C7ML) C51029K0z.LJIILLIIL(this)));
                        return;
                    }
                    o.LJIJI("smallWindow");
                    throw null;
                }
                o.LJIJI("imageRootView");
                throw null;
            }
            o.LJIJI("imageRootView");
            throw null;
        }
        o.LJIJI("imageRootView");
        throw null;
    }
}
