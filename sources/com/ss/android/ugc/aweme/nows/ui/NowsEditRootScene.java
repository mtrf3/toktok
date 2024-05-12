package com.ss.android.ugc.aweme.nows.ui;

import X.AbstractC143185je;
import X.AbstractC42651GoZ;
import X.ActivityC45651qj;
import X.AnonymousClass673;
import X.C0IB;
import X.C10C;
import X.C10K;
import X.C122034qd;
import X.C133765Mu;
import X.C137965bE;
import X.C138845ce;
import X.C139545dm;
import X.C142575if;
import X.C142835j5;
import X.C143125jY;
import X.C147135q1;
import X.C147165q4;
import X.C147195q7;
import X.C147205q8;
import X.C147265qE;
import X.C147315qJ;
import X.C147535qf;
import X.C150305v8;
import X.C1535160t;
import X.C1550766t;
import X.C1551366z;
import X.C1556669a;
import X.C1556769b;
import X.C1557569j;
import X.C1558169p;
import X.C156906Du;
import X.C161786Wo;
import X.C16880lQ;
import X.C221108m2;
import X.C26338AVi;
import X.C34K;
import X.C39579Fg7;
import X.C41028G8i;
import X.C41047G9b;
import X.C41384GMa;
import X.C41482GPu;
import X.C42000Ge4;
import X.C42034Gec;
import X.C42278GiY;
import X.C42279GiZ;
import X.C42326GjK;
import X.C43075GvP;
import X.C43653HBh;
import X.C44384HbQ;
import X.C47261Igj;
import X.C5HC;
import X.C5L0;
import X.C5LG;
import X.C5MM;
import X.C5XM;
import X.C5YW;
import X.C61878OQg;
import X.C62819Ol5;
import X.C62822Ol8;
import X.C63C;
import X.C67C;
import X.C68M;
import X.C6D8;
import X.C6FS;
import X.C6IB;
import X.C6NA;
import X.C6V4;
import X.C6VC;
import X.C6Z6;
import X.C74275TDb;
import X.C76800UCe;
import X.C78688UuS;
import X.C78897Uxp;
import X.C78934UyQ;
import X.C82622Wbi;
import X.G9D;
import X.G9P;
import X.H78;
import X.H7R;
import X.H8F;
import X.H92;
import X.HEM;
import X.InterfaceC136115Vv;
import X.InterfaceC137115Zr;
import X.InterfaceC139535dl;
import X.InterfaceC139655dx;
import X.InterfaceC140305f0;
import X.InterfaceC142515iZ;
import X.InterfaceC144185lG;
import X.InterfaceC145325n6;
import X.InterfaceC145405nE;
import X.InterfaceC145445nI;
import X.InterfaceC145495nN;
import X.InterfaceC146235oZ;
import X.InterfaceC147145q2;
import X.InterfaceC147215q9;
import X.InterfaceC147355qN;
import X.InterfaceC147435qV;
import X.InterfaceC147905rG;
import X.InterfaceC148865so;
import X.InterfaceC153045zY;
import X.InterfaceC153275zv;
import X.InterfaceC171126nc;
import X.InterfaceC45540Hu4;
import X.InterfaceC88472Yns;
import X.OSZ;
import X.ProgressDialogC43239Gy3;
import X.QD3;
import X.WXC;
import X.X1D;
import Y.AObjectS84S0100000_2;
import Y.AObserverS69S0100000_1;
import Y.AObserverS70S0100000_2;
import Y.ARunnableS13S0300000_2;
import Y.AgS21S0100100_2;
import Y.AgS24S0210000_2;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.nows.ui.NowsEditRootScene;
import com.ss.android.ugc.aweme.services.recording.NowsShootActivityArg;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.CreativeFlowData;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import v5.n;

/* loaded from: classes3.dex */
public final class NowsEditRootScene extends AbstractC42651GoZ implements InterfaceC45540Hu4, InterfaceC137115Zr, InterfaceC145445nI {
    public static final /* synthetic */ int LLILLJJLI = 0;
    public final NowsShootActivityArg LJLJJL;
    public FrameLayout LJLJL;
    public FrameLayout LJLJLJ;
    public ViewGroup LJLJLLL;
    public VideoPublishEditModel LJLL;
    public C137965bE LJLLI;
    public C142575if LJLLILLLL;
    public C6FS LJLLJ;
    public int LJLLLLLL;
    public C6VC LJZL;
    public InterfaceC153275zv LL;
    public InterfaceC136115Vv LLD;
    public InterfaceC145405nE LLF;
    public C5XM LLFF;
    public InterfaceC148865so LLFFF;
    public C5LG LLFII;
    public C42278GiY LLFZ;
    public ProgressDialogC43239Gy3 LLI;
    public C41047G9b LLIFFJFJJ;
    public InterfaceC146235oZ LLIIII;
    public InterfaceC140305f0 LLIIIILZ;
    public InterfaceC147145q2 LLIIIJ;
    public InterfaceC147215q9 LLIIIL;
    public C161786Wo LLIIIZ;
    public InterfaceC142515iZ LLIIJI;
    public C5L0 LLIIJLIL;
    public AVMusic LLIIL;
    public InterfaceC145325n6 LLIIZ;
    public final AqS168S0100000_2 LJLJJLL = new AqS168S0100000_2(this, 80);
    public final C62822Ol8 LJLLL = C221108m2.LIZIZ(C142835j5.LJLIL);
    public final n<C76800UCe> LJLLLL = new n<>();
    public boolean LJLZ = true;
    public final ArrayList<C5HC> LJZ = new ArrayList<>();
    public final ArrayList<InterfaceC144185lG> LJZI = new ArrayList<>();
    public final C62822Ol8 LLII = C221108m2.LIZIZ(new AqS152S0100000_2(this, 117));
    public final C62822Ol8 LLIILII = C221108m2.LIZIZ(new AqS152S0100000_2(this, 122));
    public final C62822Ol8 LLIILZL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 119));
    public final C62822Ol8 LLIL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 121));
    public final C62822Ol8 LLILII = C221108m2.LIZIZ(new AqS152S0100000_2(this, LiveTryModeCountDownThresholdSetting.DEFAULT));
    public final C147165q4 LLILIL = new C6NA() { // from class: X.5q4
        @Override // X.C6NA
        public final void LJIJJLI() {
        }

        @Override // X.C6NA
        public final boolean LLZZ() {
            List<StickerItemModel> list;
            if (NowsEditRootScene.this.findSceneByTag("EditStickerScene") != null) {
                C63C LLLI = NowsEditRootScene.this.LLLI();
                if (LLLI != null) {
                    if (LLLI.LLZZ()) {
                        return true;
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            VideoPublishEditModel videoPublishEditModel = NowsEditRootScene.this.LJLL;
            if (videoPublishEditModel != null) {
                InfoStickerModel infoStickerModel = videoPublishEditModel.infoStickerModel;
                if (infoStickerModel != null && (list = infoStickerModel.stickers) != null) {
                    Iterator<StickerItemModel> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        StickerItemModel next = it.next();
                        if (!next.isNowSmallWindowSticker()) {
                            if (next != null) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
            o.LJIJI("model");
            throw null;
        }

        @Override // X.C6NA
        public final boolean w8() {
            C6FS c6fs = NowsEditRootScene.this.LJLLJ;
            if (c6fs != null) {
                return c6fs.w8();
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }

        @Override // X.C6NA
        public final void y8() {
            C6FS c6fs = NowsEditRootScene.this.LJLLJ;
            if (c6fs != null) {
                c6fs.uR(false);
            }
        }

        @Override // X.C6NA
        public final void x8(Runnable runnable) {
            NowsEditRootScene nowsEditRootScene = NowsEditRootScene.this;
            nowsEditRootScene.LLLFF(new AqS149S0200000_2(nowsEditRootScene, runnable, 16));
        }
    };
    public final C147265qE LLILL = new C147265qE();
    public final C62822Ol8 LLILLIZIL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 118));

    @Override // X.InterfaceC145445nI
    public final void LJJJZ() {
    }

    @Override // X.InterfaceC145445nI
    public final void LLIIIZ(int i, int i2, boolean z, String path, int i3) {
        o.LJIIIZ(path, "path");
    }

    @Override // X.InterfaceC137115Zr
    public final InterfaceC147355qN LJLLL() {
        VideoPublishEditModel videoPublishEditModel = this.LJLL;
        if (videoPublishEditModel != null) {
            return new C147195q7(videoPublishEditModel);
        }
        o.LJIJI("model");
        throw null;
    }

    public final InterfaceC153045zY LLLFFI() {
        C142575if c142575if = this.LJLLILLLL;
        if (c142575if != null) {
            return c142575if.Kh().getValue();
        }
        o.LJIJI("editPreviewApi");
        throw null;
    }

    public final C147135q1 LLLFZ() {
        return (C147135q1) this.LLILLIZIL.getValue();
    }

    public final C63C LLLI() {
        return (C63C) this.LLIILII.getValue();
    }

    @Override // X.AbstractC42651GoZ
    public final boolean onBackPressed() {
        ArrayList<C5HC> arrayList = this.LJZ;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator<C5HC> it = arrayList.iterator();
            while (it.hasNext()) {
                if (it.next().onKeyDown(4, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC145445nI
    public final void LJLJLJ() {
        boolean z;
        if (C44384HbQ.LJJIFFI()) {
            VideoPublishEditModel videoPublishEditModel = this.LJLL;
            if (videoPublishEditModel != null) {
                H8F.LJJIII(2, videoPublishEditModel, "ai_panel");
                C78934UyQ.LJLIL.getMusicService().LJIIZILJ();
                InterfaceC145325n6 interfaceC145325n6 = this.LLIIZ;
                boolean z2 = true;
                if (interfaceC145325n6 != null) {
                    interfaceC145325n6.show(true);
                }
                C142575if c142575if = this.LJLLILLLL;
                if (c142575if != null) {
                    c142575if.U2(false, false, false);
                    VideoPublishEditModel videoPublishEditModel2 = this.LJLL;
                    if (videoPublishEditModel2 != null) {
                        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(videoPublishEditModel2.creativeModel.musicBuzModel);
                        if (extractAVMusic != null) {
                            z = extractAVMusic.isMvThemeMusic();
                        } else {
                            z = false;
                        }
                        InterfaceC145495nN interfaceC145495nN = (InterfaceC145495nN) this.LLILII.getValue();
                        VideoPublishEditModel videoPublishEditModel3 = this.LJLL;
                        if (videoPublishEditModel3 != null) {
                            if (!C44384HbQ.LJJIIZ(videoPublishEditModel3) || z) {
                                z2 = false;
                            }
                            interfaceC145495nN.B8(z2);
                            return;
                        }
                        o.LJIJI("model");
                        throw null;
                    }
                    o.LJIJI("model");
                    throw null;
                }
                o.LJIJI("editPreviewApi");
                throw null;
            }
            o.LJIJI("model");
            throw null;
        }
        VideoPublishEditModel videoPublishEditModel4 = this.LJLL;
        if (videoPublishEditModel4 != null) {
            H8F.LJJIII(6, videoPublishEditModel4, null);
            C63C LLLI = LLLI();
            if (LLLI != null) {
                LLLI.LJLJJL();
            }
            InterfaceC153275zv interfaceC153275zv = this.LL;
            if (interfaceC153275zv != null) {
                interfaceC153275zv.r3();
            }
            C142575if c142575if2 = this.LJLLILLLL;
            if (c142575if2 != null) {
                c142575if2.DM().setValue(C5MM.LIZJ());
                ((InterfaceC145495nN) this.LLILII.getValue()).r3();
                VideoPublishEditModel videoPublishEditModel5 = this.LJLL;
                if (videoPublishEditModel5 != null) {
                    H8F.LJIL(videoPublishEditModel5);
                    return;
                } else {
                    o.LJIJI("model");
                    throw null;
                }
            }
            o.LJIJI("editPreviewApi");
            throw null;
        }
        o.LJIJI("model");
        throw null;
    }

    @Override // X.AbstractC42651GoZ, X.AbstractC147255qD, X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // X.AbstractC42651GoZ, X.WM7
    public final void onResume() {
        super.onResume();
        VideoPublishEditModel videoPublishEditModel = this.LJLL;
        if (videoPublishEditModel != null) {
            C150305v8.LIZJ(videoPublishEditModel);
            int LJIJ = C62819Ol5.LJIJ(requireSceneContext());
            VideoPublishEditModel videoPublishEditModel2 = this.LJLL;
            if (videoPublishEditModel2 != null) {
                H8F.LJJIJLIJ(LJIJ, C16880lQ.LLJJIJI(requireActivity().getIntent()), videoPublishEditModel2, Boolean.FALSE, "");
                if (G9P.LIZLLL() && G9D.LJFF() && !H92.LJ()) {
                    C41047G9b c41047G9b = this.LLIFFJFJJ;
                    if (c41047G9b != null) {
                        c41047G9b.WQ();
                        return;
                    }
                    return;
                }
                C156906Du c156906Du = (C156906Du) this.LLII.getValue();
                if (c156906Du == null) {
                    return;
                }
                C147205q8 resultListener = C147205q8.LJLIL;
                o.LJIIIZ(resultListener, "resultListener");
                c156906Du.LIZJ(new AqS133S0200000_2(c156906Du, (C156906Du) resultListener, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 84));
                return;
            }
            o.LJIJI("model");
            throw null;
        }
        o.LJIJI("model");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [X.5q4] */
    public NowsEditRootScene(NowsShootActivityArg nowsShootActivityArg) {
        this.LJLJJL = nowsShootActivityArg;
        disableSceneRestore();
        disableSupportRestore();
    }

    @Override // X.InterfaceC137115Zr
    public final void LJII(StickerItemModel stickerItemModel) {
        int i;
        if (!C39579Fg7.LIZIZ(stickerItemModel.path)) {
            if (C138845ce.LIZ() && stickerItemModel.isTextSticker()) {
                VideoPublishEditModel videoPublishEditModel = this.LJLL;
                if (videoPublishEditModel != null) {
                    if (!H7R.LJJJJZ(videoPublishEditModel)) {
                        return;
                    }
                } else {
                    o.LJIJI("model");
                    throw null;
                }
            } else {
                return;
            }
        }
        VideoPublishEditModel videoPublishEditModel2 = this.LJLL;
        if (videoPublishEditModel2 != null) {
            if (!videoPublishEditModel2.hasInfoStickers()) {
                VideoPublishEditModel videoPublishEditModel3 = this.LJLL;
                if (videoPublishEditModel3 != null) {
                    InterfaceC171126nc LIZIZ = C5YW.LIZIZ();
                    VideoPublishEditModel videoPublishEditModel4 = this.LJLL;
                    if (videoPublishEditModel4 != null) {
                        videoPublishEditModel3.infoStickerModel = new InfoStickerModel(LIZIZ.LJJLIIIJJI(videoPublishEditModel4));
                    } else {
                        o.LJIJI("model");
                        throw null;
                    }
                } else {
                    o.LJIJI("model");
                    throw null;
                }
            }
            VideoPublishEditModel videoPublishEditModel5 = this.LJLL;
            if (videoPublishEditModel5 != null) {
                int i2 = 1;
                if (videoPublishEditModel5.infoStickerModel.stickers.size() > 0) {
                    VideoPublishEditModel videoPublishEditModel6 = this.LJLL;
                    if (videoPublishEditModel6 != null) {
                        for (StickerItemModel item : videoPublishEditModel6.infoStickerModel.stickers) {
                            o.LJIIIIZZ(item, "item");
                            if (C1535160t.LIZIZ(item) && (i = item.layerWeight) > i2) {
                                i2 = i;
                            }
                        }
                    } else {
                        o.LJIJI("model");
                        throw null;
                    }
                }
                stickerItemModel.layerWeight += i2;
                VideoPublishEditModel videoPublishEditModel7 = this.LJLL;
                if (videoPublishEditModel7 != null) {
                    videoPublishEditModel7.infoStickerModel.stickers.add(stickerItemModel);
                    return;
                } else {
                    o.LJIJI("model");
                    throw null;
                }
            }
            o.LJIJI("model");
            throw null;
        }
        o.LJIJI("model");
        throw null;
    }

    public final void LLJZIJLIL(int i) {
        FrameLayout frameLayout = this.LJLJL;
        if (frameLayout != null) {
            C26338AVi.LJI(frameLayout, 0, Integer.valueOf(i), 0, 0, false, 16);
            Activity requireActivity = requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            int LIZLLL = i - C6IB.LIZLLL(requireActivity);
            FrameLayout frameLayout2 = this.LJLJLJ;
            if (frameLayout2 != null) {
                C26338AVi.LJI(frameLayout2, 0, Integer.valueOf(LIZLLL), 0, 0, false, 16);
                return;
            } else {
                o.LJIJI("stickerContainer");
                throw null;
            }
        }
        o.LJIJI("surfaceContainer");
        throw null;
    }

    public final void LLL(VideoPublishEditModel videoPublishEditModel) {
        C133765Mu c133765Mu;
        InterfaceC153045zY LLLFFI = LLLFFI();
        C122034qd c122034qd = null;
        if ((LLLFFI instanceof C133765Mu) && (c133765Mu = (C133765Mu) LLLFFI) != null) {
            c122034qd = c133765Mu.LJI();
        }
        C63C LLLI = LLLI();
        if (LLLI != null) {
            if (C150305v8.LIZIZ(videoPublishEditModel, c122034qd, LLLI)) {
                C150305v8.LIZLLL(videoPublishEditModel, (AbstractC143185je) LJLLL());
                return;
            } else {
                C150305v8.LIZJ(videoPublishEditModel);
                return;
            }
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void LLLF(String str) {
        C63C LLLI = LLLI();
        if (LLLI != null) {
            LLLI.LLLL();
        }
        VideoPublishEditModel videoPublishEditModel = this.LJLL;
        if (videoPublishEditModel != null) {
            H8F.LJJIIZI(videoPublishEditModel, str, 0, null, LiveTryModeCountDownThresholdSetting.DEFAULT);
        } else {
            o.LJIJI("model");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLFF(X.InterfaceC65784Pro<X.C76800UCe> r10) {
        /*
            r9 = this;
            boolean r0 = X.C142985jK.LIZ()
            r8 = 0
            java.lang.String r7 = "editPreviewApi"
            java.lang.String r6 = "model"
            if (r0 == 0) goto L74
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.LJLL
            if (r0 == 0) goto La4
            r4 = 0
            X.OSZ r0 = X.C44384HbQ.LJJJJZI(r0, r4)
            X.5iy r5 = new X.5iy
            if (r0 == 0) goto L20
            java.lang.Object r3 = r0.getFirst()
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L24
        L20:
            java.lang.String r3 = ""
            if (r0 == 0) goto L72
        L24:
            java.lang.Object r0 = r0.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
        L2e:
            boolean r0 = X.C78886Uxe.LJJJJL()
            r1 = 1
            if (r0 == 0) goto L48
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.LJLL
            if (r0 == 0) goto La0
            boolean r0 = r0.isMvThemeVideoType()
            if (r0 != 0) goto L48
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.LJLL
            if (r0 == 0) goto L9c
            com.ss.android.ugc.aweme.canvas.CanvasVideoData r0 = r0.canvasVideoData
            if (r0 != 0) goto L48
            r4 = 1
        L48:
            r5.<init>(r2, r3, r4, r1)
            X.5ix r3 = new X.5ix
            r3.<init>()
            X.5if r0 = r9.LJLLILLLL
            if (r0 == 0) goto L98
            androidx.lifecycle.LiveData r0 = r0.Kh()
            java.lang.Object r4 = r0.getValue()
            X.5zY r4 = (X.InterfaceC153045zY) r4
            X.5qA r6 = X.C147225qA.LJLIL
            kotlin.jvm.internal.AqS133S0200000_2 r7 = new kotlin.jvm.internal.AqS133S0200000_2
            r0 = 27
            r7.<init>(r9, r10, r0)
            kotlin.jvm.internal.AqS168S0100000_2 r8 = new kotlin.jvm.internal.AqS168S0100000_2
            r0 = 81
            r8.<init>(r9, r0)
            r3.Vr(r4, r5, r6, r7, r8)
        L71:
            return
        L72:
            r2 = 0
            goto L2e
        L74:
            X.5ix r5 = new X.5ix
            r5.<init>()
            X.5if r0 = r9.LJLLILLLL
            if (r0 == 0) goto Lac
            androidx.lifecycle.LiveData r0 = r0.Kh()
            java.lang.Object r4 = r0.getValue()
            X.5zY r4 = (X.InterfaceC153045zY) r4
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r9.LJLL
            if (r3 == 0) goto La8
            X.5qB r2 = X.C147235qB.LJLIL
            kotlin.jvm.internal.AqS149S0200000_2 r1 = new kotlin.jvm.internal.AqS149S0200000_2
            r0 = 17
            r1.<init>(r9, r10, r0)
            r5.ah0(r4, r3, r2, r1)
            goto L71
        L98:
            kotlin.jvm.internal.o.LJIJI(r7)
            throw r8
        L9c:
            kotlin.jvm.internal.o.LJIJI(r6)
            throw r8
        La0:
            kotlin.jvm.internal.o.LJIJI(r6)
            throw r8
        La4:
            kotlin.jvm.internal.o.LJIJI(r6)
            throw r8
        La8:
            kotlin.jvm.internal.o.LJIJI(r6)
            throw r8
        Lac:
            kotlin.jvm.internal.o.LJIJI(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.nows.ui.NowsEditRootScene.LLLFF(X.Pro):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC42651GoZ, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        InterfaceC145325n6 interfaceC145325n6;
        C6FS c6fs;
        InterfaceC145405nE interfaceC145405nE;
        C5XM c5xm;
        C5LG c5lg;
        C5L0 c5l0;
        C0IB<AVMusic> ya0;
        LiveData<Boolean> vw;
        LiveEvent<OSZ<Integer, Intent>> HZ;
        LiveEvent<Intent> hy;
        LiveData<Integer> qa;
        super.onActivityCreated(bundle);
        ActivityC45651qj LLJLL = LLJLL();
        Intent intent = requireActivity().getIntent();
        o.LJIIIIZZ(intent, "requireActivity().intent");
        C147535qf LJIIIZ = C41384GMa.LJIIIZ(intent, LLJLL);
        VideoPublishEditModel videoPublishEditModel = LJIIIZ.LIZ;
        CreativeInfo creativeInfo = videoPublishEditModel.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "creativeInfo");
        String path = new File(C43653HBh.LIZLLL(creativeInfo), C43075GvP.LIZ("-concat-v")).getPath();
        videoPublishEditModel.mOutputFile = path;
        NowsShootModel nowsShootModel = videoPublishEditModel.creativeModel.nowsShootModel;
        if (nowsShootModel != null) {
            nowsShootModel.syntheticVideoPath = path;
        }
        CreativeFlowData creativeFlowData = videoPublishEditModel.creativeFlowData;
        ShootExtraData shootExtraData = creativeFlowData.getShootExtraData();
        if (shootExtraData == null) {
            shootExtraData = new ShootExtraData(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 4095, 0 == true ? 1 : 0);
        }
        NowsShootActivityArg nowsShootActivityArg = this.LJLJJL;
        if (nowsShootActivityArg != null) {
            shootExtraData.setShootEnterFrom(nowsShootActivityArg.getEnterFrom());
        }
        creativeFlowData.setShootExtraData(shootExtraData);
        this.LJLL = videoPublishEditModel;
        this.LJLLI = new C137965bE(videoPublishEditModel);
        VideoPublishEditModel videoPublishEditModel2 = this.LJLL;
        if (videoPublishEditModel2 != null) {
            AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(videoPublishEditModel2.creativeModel.musicBuzModel);
            if (extractAVMusic != null) {
                VideoPublishEditModel videoPublishEditModel3 = this.LJLL;
                if (videoPublishEditModel3 != null) {
                    videoPublishEditModel3.setMCurMusicLength(extractAVMusic.getDuration());
                } else {
                    o.LJIJI("model");
                    throw null;
                }
            }
            this.LLIIL = extractAVMusic;
            this.LJLLLLLL = LJIIIZ.LIZJ;
            NowsShootModel nowsShootModel2 = (NowsShootModel) requireActivity().getIntent().getParcelableExtra("extra_nows_data");
            if (nowsShootModel2 != null) {
                VideoPublishEditModel videoPublishEditModel4 = this.LJLL;
                if (videoPublishEditModel4 != null) {
                    videoPublishEditModel4.creativeModel.nowsShootModel = nowsShootModel2;
                } else {
                    o.LJIJI("model");
                    throw null;
                }
            }
            VideoPublishEditModel videoPublishEditModel5 = this.LJLL;
            if (videoPublishEditModel5 != null) {
                if (videoPublishEditModel5.getPreviewInfo() == null) {
                    H78.LIZJ("previewInfo is null");
                    LLJJI();
                    return;
                }
                View requireViewById = requireViewById(R.id.j83);
                o.LJIIIIZZ(requireViewById, "requireViewById(R.id.root_view)");
                this.LJLJLLL = (ViewGroup) requireViewById;
                View requireViewById2 = requireViewById(R.id.kuk);
                o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.surface_container)");
                this.LJLJL = (FrameLayout) requireViewById2;
                View requireViewById3 = requireViewById(R.id.cpo);
                o.LJIIIIZZ(requireViewById3, "requireViewById(R.id.edit_sticker_container)");
                this.LJLJLJ = (FrameLayout) requireViewById3;
                ViewGroup viewGroup = (ViewGroup) findViewById(R.id.cor);
                Context requireSceneContext = requireSceneContext();
                o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
                C6VC LJIILIIL = C78897Uxp.LJIILIIL(requireSceneContext, viewGroup);
                this.LJZL = LJIILIIL;
                LJIILIIL.LIZIZ(new C6V4(10001, new WXC() { // from class: X.5q6
                    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
                    
                        if (r0.jw() != false) goto L10;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
                    
                        if (r0.Qf() == true) goto L10;
                     */
                    @Override // X.C6P6, X.C6V2
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final boolean onDown(android.view.MotionEvent r5) {
                        /*
                            r4 = this;
                            com.ss.android.ugc.aweme.nows.ui.NowsEditRootScene r3 = com.ss.android.ugc.aweme.nows.ui.NowsEditRootScene.this
                            X.63C r0 = r3.LLLI()
                            if (r0 == 0) goto L2d
                            boolean r0 = r0.LLLIIIL()
                            r2 = 0
                            if (r0 != 0) goto L1c
                            com.ss.android.ugc.aweme.nows.ui.NowsEditRootScene r0 = com.ss.android.ugc.aweme.nows.ui.NowsEditRootScene.this
                            X.5zv r0 = r0.LL
                            r1 = 1
                            if (r0 == 0) goto L20
                            boolean r0 = r0.Qf()
                            if (r0 != r1) goto L20
                        L1c:
                            r1 = 0
                        L1d:
                            r3.LJLZ = r1
                            return r2
                        L20:
                            com.ss.android.ugc.aweme.nows.ui.NowsEditRootScene r0 = com.ss.android.ugc.aweme.nows.ui.NowsEditRootScene.this
                            X.5so r0 = r0.LLFFF
                            if (r0 == 0) goto L1c
                            boolean r0 = r0.jw()
                            if (r0 != 0) goto L1c
                            goto L1d
                        L2d:
                            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                            java.lang.String r0 = "Required value was null."
                            r0.toString()
                            r1.<init>(r0)
                            throw r1
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C147185q6.onDown(android.view.MotionEvent):boolean");
                    }

                    @Override // X.C6P6, X.C6V2
                    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                        return !NowsEditRootScene.LLLII(NowsEditRootScene.this, motionEvent);
                    }

                    @Override // X.C6P6, X.C6V2
                    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                        return !NowsEditRootScene.LLLII(NowsEditRootScene.this, motionEvent);
                    }
                }));
                C6VC c6vc = this.LJZL;
                if (c6vc != null) {
                    c6vc.LIZIZ(new C6V4(0, new WXC() { // from class: X.5q5
                        @Override // X.C6P6, X.C6V2
                        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                            InterfaceC153275zv interfaceC153275zv;
                            LiveData<Boolean> n2;
                            boolean z = false;
                            if (NowsEditRootScene.this.findSceneByTag("EditStickerScene") != null) {
                                boolean LLLII = NowsEditRootScene.LLLII(NowsEditRootScene.this, motionEvent);
                                C63C LLLI = NowsEditRootScene.this.LLLI();
                                if (LLLI != null) {
                                    z = LLLI.LLLI();
                                    if (!z && (interfaceC153275zv = NowsEditRootScene.this.LL) != null && (n2 = interfaceC153275zv.n2()) != null && o.LJ(n2.getValue(), Boolean.TRUE) && LLLII) {
                                        NowsEditRootScene nowsEditRootScene = NowsEditRootScene.this;
                                        if (nowsEditRootScene.LJLZ) {
                                            nowsEditRootScene.LLLF("tap_anywhere");
                                        }
                                    }
                                } else {
                                    "Required value was null.".toString();
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                            }
                            return z;
                        }
                    }));
                    View requireViewById4 = requireViewById(R.id.dfx);
                    o.LJIIIIZZ(requireViewById4, "requireViewById<View>(R.id.fl_privacy_new)");
                    ViewGroup.LayoutParams layoutParams = requireViewById4.getLayoutParams();
                    o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    Context requireSceneContext2 = requireSceneContext();
                    o.LJIIIIZZ(requireSceneContext2, "requireSceneContext()");
                    int LIZJ = C6IB.LIZJ(requireSceneContext2) - ((int) C74275TDb.LIZ(148.0f));
                    if (LIZJ < 0) {
                        LIZJ = 0;
                    }
                    layoutParams2.bottomMargin = LIZJ;
                    requireViewById4.setLayoutParams(layoutParams2);
                    C78688UuS.LJIIIZ(this, false, new AqS168S0100000_2(this, 89));
                    C44384HbQ.LJIIIZ(this, new AqS168S0100000_2(this, 84));
                    FrameLayout frameLayout = this.LJLJL;
                    if (frameLayout != null) {
                        C142575if c142575if = this.LJLLILLLL;
                        if (c142575if != null) {
                            frameLayout.addView(c142575if.Iy());
                            C82622Wbi LJJLIIIJJI = C44384HbQ.LJJLIIIJJI(this);
                            if (LJJLIIIJJI != null) {
                                interfaceC145325n6 = (InterfaceC145325n6) LJJLIIIJJI.LJIIIIZZ(null, InterfaceC145325n6.class);
                            } else {
                                interfaceC145325n6 = null;
                            }
                            this.LLIIZ = interfaceC145325n6;
                            C82622Wbi LJJLIIIJJI2 = C44384HbQ.LJJLIIIJJI(this);
                            if (LJJLIIIJJI2 != null) {
                                c6fs = (C6FS) LJJLIIIJJI2.LJ(C6FS.class, null);
                            } else {
                                c6fs = null;
                            }
                            this.LJLLJ = c6fs;
                            C82622Wbi LJJLIIIJJI3 = C44384HbQ.LJJLIIIJJI(this);
                            if (LJJLIIIJJI3 != null) {
                                interfaceC145405nE = (InterfaceC145405nE) LJJLIIIJJI3.LJIIIIZZ(null, InterfaceC145405nE.class);
                            } else {
                                interfaceC145405nE = null;
                            }
                            this.LLF = interfaceC145405nE;
                            C82622Wbi LJJLIIIJJI4 = C44384HbQ.LJJLIIIJJI(this);
                            if (LJJLIIIJJI4 != null) {
                                c5xm = (C5XM) LJJLIIIJJI4.LJIIIIZZ(null, C5XM.class);
                            } else {
                                c5xm = null;
                            }
                            this.LLFF = c5xm;
                            C82622Wbi LJJLIIIJJI5 = C44384HbQ.LJJLIIIJJI(this);
                            if (LJJLIIIJJI5 != null) {
                                c5lg = (C5LG) LJJLIIIJJI5.LJIIIIZZ(null, C5LG.class);
                            } else {
                                c5lg = null;
                            }
                            this.LLFII = c5lg;
                            C82622Wbi LJJLIIIJJI6 = C44384HbQ.LJJLIIIJJI(this);
                            if (LJJLIIIJJI6 != null) {
                                this.LL = (InterfaceC153275zv) LJJLIIIJJI6.LJIIIIZZ(null, InterfaceC153275zv.class);
                                this.LLD = (InterfaceC136115Vv) LJJLIIIJJI6.LJIIIIZZ(null, InterfaceC136115Vv.class);
                                this.LLFFF = (InterfaceC148865so) LJJLIIIJJI6.LJIIIIZZ(null, InterfaceC148865so.class);
                                this.LLIIII = (InterfaceC146235oZ) LJJLIIIJJI6.LJ(InterfaceC146235oZ.class, null);
                                this.LLIIIILZ = (InterfaceC140305f0) LJJLIIIJJI6.LJ(InterfaceC140305f0.class, null);
                                this.LLIIIJ = (InterfaceC147145q2) LJJLIIIJJI6.LJ(InterfaceC147145q2.class, null);
                                this.LLIIIL = (InterfaceC147215q9) LJJLIIIJJI6.LJ(InterfaceC147215q9.class, null);
                                this.LLIIIZ = (C161786Wo) LJJLIIIJJI6.LJ(C161786Wo.class, null);
                                this.LLIIJI = (InterfaceC142515iZ) LJJLIIIJJI6.LJ(InterfaceC142515iZ.class, null);
                                InterfaceC153275zv interfaceC153275zv = this.LL;
                                if (interfaceC153275zv != null && (qa = interfaceC153275zv.qa()) != null) {
                                    qa.observe(this, new AObjectS84S0100000_2(this, 35));
                                }
                                C142575if c142575if2 = this.LJLLILLLL;
                                if (c142575if2 != null) {
                                    c142575if2.Zq0().observe(this, new AObserverS70S0100000_2(this, 43));
                                    C6FS c6fs2 = this.LJLLJ;
                                    if (c6fs2 != null && (hy = c6fs2.hy()) != null) {
                                        hy.LIZLLL(this, new AObjectS84S0100000_2(this, 36));
                                    }
                                    C6FS c6fs3 = this.LJLLJ;
                                    if (c6fs3 != null && (HZ = c6fs3.HZ()) != null) {
                                        HZ.LIZLLL(this, new AObjectS84S0100000_2(this, 37));
                                    }
                                    C41047G9b c41047G9b = this.LLIFFJFJJ;
                                    if (c41047G9b != null && (vw = c41047G9b.vw()) != null) {
                                        vw.observe(this, new AObserverS70S0100000_2(this, 37));
                                    }
                                    C142575if c142575if3 = this.LJLLILLLL;
                                    if (c142575if3 != null) {
                                        c142575if3.Vm().observe(this, new AObserverS69S0100000_1(this, 57));
                                        C142575if c142575if4 = this.LJLLILLLL;
                                        if (c142575if4 != null) {
                                            c142575if4.Dt0().observe(this, new AObserverS70S0100000_2(this, 38));
                                            C142575if c142575if5 = this.LJLLILLLL;
                                            if (c142575if5 != null) {
                                                c142575if5.wf0().observe(this, new AObserverS70S0100000_2(this, 39));
                                                C82622Wbi LJJLIIIJJI7 = C44384HbQ.LJJLIIIJJI(this);
                                                if (LJJLIIIJJI7 != null) {
                                                    c5l0 = (C5L0) LJJLIIIJJI7.LJIIIIZZ(null, C5L0.class);
                                                } else {
                                                    c5l0 = null;
                                                }
                                                this.LLIIJLIL = c5l0;
                                                InterfaceC145325n6 interfaceC145325n62 = this.LLIIZ;
                                                if (interfaceC145325n62 != null && (ya0 = interfaceC145325n62.ya0()) != null) {
                                                    ya0.LIZIZ(this, new AObjectS84S0100000_2(this, 33));
                                                }
                                                C142575if c142575if6 = this.LJLLILLLL;
                                                if (c142575if6 != null) {
                                                    c142575if6.p20().observe(this, new AObserverS70S0100000_2(this, 40));
                                                    EventBus.LIZJ().LJIILJJIL(this);
                                                    return;
                                                } else {
                                                    o.LJIJI("editPreviewApi");
                                                    throw null;
                                                }
                                            }
                                            o.LJIJI("editPreviewApi");
                                            throw null;
                                        }
                                        o.LJIJI("editPreviewApi");
                                        throw null;
                                    }
                                    o.LJIJI("editPreviewApi");
                                    throw null;
                                }
                                o.LJIJI("editPreviewApi");
                                throw null;
                            }
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        o.LJIJI("editPreviewApi");
                        throw null;
                    }
                    o.LJIJI("surfaceContainer");
                    throw null;
                }
                o.LJIJI("gestureService");
                throw null;
            }
            o.LJIJI("model");
            throw null;
        }
        o.LJIJI("model");
        throw null;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onEvent(C41482GPu event) {
        o.LJIIIZ(event, "event");
        VideoPublishEditModel videoPublishEditModel = this.LJLL;
        if (videoPublishEditModel != null) {
            event.LIZ(videoPublishEditModel);
            C161786Wo c161786Wo = this.LLIIIZ;
            if (c161786Wo != null) {
                VideoPublishEditModel videoPublishEditModel2 = this.LJLL;
                if (videoPublishEditModel2 != null) {
                    c161786Wo.a80(videoPublishEditModel2.isPrivate());
                    return;
                } else {
                    o.LJIJI("model");
                    throw null;
                }
            }
            o.LJIJI("privacyComponent");
            throw null;
        }
        o.LJIJI("model");
        throw null;
    }

    @Override // X.InterfaceC45540Hu4
    public final void registerActivityOnKeyDownListener(C5HC listener) {
        o.LJIIIZ(listener, "listener");
        this.LJZ.add(listener);
    }

    @Override // X.InterfaceC45540Hu4
    public final void registerActivityOnKeyDownListenerHead(C5HC listener) {
        o.LJIIIZ(listener, "listener");
        ListProtector.add(this.LJZ, 0, listener);
    }

    @Override // X.InterfaceC45540Hu4
    public final void registerActivityResultListener(InterfaceC144185lG listener) {
        o.LJIIIZ(listener, "listener");
        this.LJZI.add(listener);
    }

    @Override // X.InterfaceC45540Hu4
    public final void unRegisterActivityOnKeyDownListener(C5HC listener) {
        o.LJIIIZ(listener, "listener");
        this.LJZ.remove(listener);
    }

    @Override // X.InterfaceC45540Hu4
    public final void unRegisterActivityResultListener(InterfaceC144185lG listener) {
        o.LJIIIZ(listener, "listener");
        this.LJZI.remove(listener);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onEvent(C6Z6 c6z6) {
        requireActivity().finish();
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onEvent(HEM hem) {
        requireActivity().finish();
    }

    public static final boolean LLLII(NowsEditRootScene nowsEditRootScene, MotionEvent motionEvent) {
        float f;
        if (motionEvent != null) {
            f = motionEvent.getY();
        } else {
            f = 0.0f;
        }
        FrameLayout frameLayout = nowsEditRootScene.LJLJL;
        if (frameLayout != null) {
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            if (f > ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) {
                if (nowsEditRootScene.LJLJL != null) {
                    if (f < r0.getHeight() + r1) {
                        return true;
                    }
                } else {
                    o.LJIJI("surfaceContainer");
                    throw null;
                }
            }
            return false;
        }
        o.LJIJI("surfaceContainer");
        throw null;
    }

    public final C10K LLLIIII(Runnable runnable, boolean z) {
        InterfaceC139655dx interfaceC139655dx;
        List<TextStickerData> list;
        AnonymousClass673 anonymousClass673;
        C67C c67c;
        C1557569j c1557569j;
        InterfaceC147435qV interfaceC147435qV;
        InterfaceC147435qV interfaceC147435qV2;
        C1556669a c1556669a;
        C1556769b c1556769b;
        C1558169p c1558169p;
        InterfaceC147435qV interfaceC147435qV3;
        InterfaceC147435qV interfaceC147435qV4;
        C1551366z c1551366z;
        C10K<C76800UCe> c10k;
        C63C LLLI;
        C1550766t c1550766t;
        String effectId;
        InterfaceC139535dl LLJJLIIIJLLLLLLLZ;
        H78.LIZ("VEVideoPublishEditActivity compileStickers");
        C63C LLLI2 = LLLI();
        if (LLLI2 != null && (LLJJLIIIJLLLLLLLZ = LLLI2.LLJJLIIIJLLLLLLLZ()) != null) {
            C139545dm.LIZ(LLJJLIIIJLLLLLLLZ, null, null, 3);
        }
        VideoPublishEditModel videoPublishEditModel = this.LJLL;
        if (videoPublishEditModel != null) {
            C137965bE c137965bE = this.LJLLI;
            if (c137965bE != null) {
                videoPublishEditModel.stickerChallenge = c137965bE.LIZIZ();
                C142575if c142575if = this.LJLLILLLL;
                if (c142575if != null) {
                    InterfaceC153045zY value = c142575if.Kh().getValue();
                    if (value == null) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("editor is null when compiling sticker,isDestroy:");
                        LIZ.append(SceneExtensionsKt.LIZ(this));
                        LIZ.append(".stackTrace:");
                        LIZ.append(Log.getStackTraceString(new Throwable()));
                        H78.LIZJ(X1D.LIZIZ(LIZ));
                        C10K LJIIIZ = C10K.LJIIIZ(null);
                        o.LJIIIIZZ(LJIIIZ, "forResult(null)");
                        return LJIIIZ;
                    }
                    C63C LLLI3 = LLLI();
                    if (LLLI3 != null) {
                        interfaceC139655dx = LLLI3.LLL();
                    } else {
                        interfaceC139655dx = null;
                    }
                    InterfaceC142515iZ interfaceC142515iZ = this.LLIIJI;
                    if (interfaceC142515iZ != null) {
                        InterfaceC147905rG LIZ2 = interfaceC142515iZ.oi0().LIZ();
                        if (interfaceC139655dx == null || (list = interfaceC139655dx.YU()) == null) {
                            list = C61878OQg.INSTANCE;
                        }
                        if (!list.isEmpty()) {
                            StringBuilder sb = new StringBuilder();
                            StringBuilder sb2 = new StringBuilder();
                            int size = list.size();
                            for (int i = 0; i < size; i++) {
                                TextFontStyleData LJIIIIZZ = C68M.LJIIJ().LJIIIIZZ(((TextStickerData) ListProtector.get(list, i)).getFontType());
                                if (LJIIIIZZ != null) {
                                    String str = LJIIIIZZ.title;
                                    if (str == null) {
                                        str = "";
                                    }
                                    sb.append(str);
                                    Effect effect = LJIIIIZZ.LIZJ;
                                    if (effect == null) {
                                        effectId = "";
                                    } else {
                                        effectId = effect.getEffectId();
                                    }
                                    sb2.append(effectId);
                                    if (i != list.size() - 1) {
                                        sb.append(",");
                                        sb2.append(",");
                                    }
                                }
                            }
                            VideoPublishEditModel videoPublishEditModel2 = this.LJLL;
                            if (videoPublishEditModel2 != null) {
                                videoPublishEditModel2.textTypes = sb.toString();
                                VideoPublishEditModel videoPublishEditModel3 = this.LJLL;
                                if (videoPublishEditModel3 != null) {
                                    videoPublishEditModel3.textEffectIds = sb2.toString();
                                } else {
                                    o.LJIJI("model");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("model");
                                throw null;
                            }
                        } else {
                            VideoPublishEditModel videoPublishEditModel4 = this.LJLL;
                            if (videoPublishEditModel4 != null) {
                                videoPublishEditModel4.textTypes = "";
                                videoPublishEditModel4.textEffectIds = "";
                            } else {
                                o.LJIJI("model");
                                throw null;
                            }
                        }
                        InterfaceC147355qN LJLLL = LJLLL();
                        C63C LLLI4 = LLLI();
                        if (LLLI4 != null) {
                            anonymousClass673 = LLLI4.LJZL;
                        } else {
                            anonymousClass673 = null;
                        }
                        C63C LLLI5 = LLLI();
                        if (LLLI5 != null) {
                            c67c = LLLI5.LJLLJ;
                        } else {
                            c67c = null;
                        }
                        C63C LLLI6 = LLLI();
                        if (LLLI6 != null) {
                            c1557569j = LLLI6.LJLLL;
                        } else {
                            c1557569j = null;
                        }
                        InterfaceC147435qV[] interfaceC147435qVArr = new InterfaceC147435qV[8];
                        if (LIZ2 != null) {
                            interfaceC147435qV = LIZ2.LIZ();
                        } else {
                            interfaceC147435qV = null;
                        }
                        interfaceC147435qVArr[0] = interfaceC147435qV;
                        if (interfaceC139655dx != null) {
                            interfaceC147435qV2 = interfaceC139655dx.LIZ();
                        } else {
                            interfaceC147435qV2 = null;
                        }
                        interfaceC147435qVArr[1] = interfaceC147435qV2;
                        if (anonymousClass673 != null) {
                            c1556669a = anonymousClass673.LLJJI();
                        } else {
                            c1556669a = null;
                        }
                        interfaceC147435qVArr[2] = c1556669a;
                        if (c67c != null) {
                            c1556769b = c67c.LLJJI();
                        } else {
                            c1556769b = null;
                        }
                        interfaceC147435qVArr[3] = c1556769b;
                        if (c1557569j != null) {
                            c1558169p = c1557569j.LLJJ();
                        } else {
                            c1558169p = null;
                        }
                        interfaceC147435qVArr[4] = c1558169p;
                        C63C LLLI7 = LLLI();
                        if (LLLI7 != null) {
                            interfaceC147435qV3 = LLLI7.LLJJJ().LIZ();
                        } else {
                            interfaceC147435qV3 = null;
                        }
                        interfaceC147435qVArr[5] = interfaceC147435qV3;
                        C63C LLLI8 = LLLI();
                        if (LLLI8 != null) {
                            interfaceC147435qV4 = LLLI8.LLJJIJIL().LIZ();
                        } else {
                            interfaceC147435qV4 = null;
                        }
                        interfaceC147435qVArr[6] = interfaceC147435qV4;
                        C63C LLLI9 = LLLI();
                        if (LLLI9 != null && (c1550766t = LLLI9.LLIFFJFJJ) != null) {
                            c1551366z = c1550766t.LLJILJILJ();
                        } else {
                            c1551366z = null;
                        }
                        interfaceC147435qVArr[7] = c1551366z;
                        boolean LIZ3 = C147315qJ.LIZ(value, LJLLL, C47261Igj.LJJIJIL(interfaceC147435qVArr));
                        if (C143125jY.LIZ()) {
                            if (!LIZ3) {
                                C63C LLLI10 = LLLI();
                                if (LLLI10 != null) {
                                    if (!C147315qJ.LIZIZ(value, LJLLL, LLLI10)) {
                                        LIZ3 = false;
                                    }
                                } else {
                                    "Required value was null.".toString();
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                            }
                            LIZ3 = true;
                        }
                        ((AbstractC143185je) LJLLL).LIZJ(LIZ3, true);
                        long currentTimeMillis = System.currentTimeMillis();
                        C63C LLLI11 = LLLI();
                        if (LLLI11 != null) {
                            LLLI11.LJIJJ(true);
                        }
                        C63C LLLI12 = LLLI();
                        if (LLLI12 != null) {
                            C10K<C76800UCe> LLIIJLIL = LLLI12.LLIIJLIL(value, this, null);
                            VideoPublishEditModel videoPublishEditModel5 = this.LJLL;
                            if (videoPublishEditModel5 != null) {
                                if (!C42000Ge4.LJIILIIL(videoPublishEditModel5) && (LLLI = LLLI()) != null) {
                                    c10k = LLLI.LLLFFI(value, this, null);
                                } else {
                                    c10k = null;
                                }
                                if (LLIIJLIL.LJIILIIL() && (c10k == null || c10k.LJIILIIL())) {
                                    C63C LLLI13 = LLLI();
                                    if (LLLI13 != null) {
                                        LLLI13.LJI();
                                    }
                                    C63C LLLI14 = LLLI();
                                    if (LLLI14 != null) {
                                        LLLI14.LJIJJ(false);
                                    }
                                    runnable.run();
                                    C10K LJIIIZ2 = C10K.LJIIIZ(null);
                                    o.LJIIIIZZ(LJIIIZ2, "forResult(null)");
                                    return LJIIIZ2;
                                }
                                C10K<Void> LJIJJ = C10K.LJIJJ(C47261Igj.LJJIJIIJI(LLIIJLIL, c10k));
                                AgS21S0100100_2 agS21S0100100_2 = new AgS21S0100100_2(this, currentTimeMillis, 0);
                                C10C c10c = C10K.LJIIIIZZ;
                                C10K LJ = LJIJJ.LJ(agS21S0100100_2, c10c, null);
                                if (!LJ.LJIILIIL()) {
                                    if (z) {
                                        if (C41028G8i.LIZ()) {
                                            if (this.LLFZ == null) {
                                                C42279GiZ c42279GiZ = C42279GiZ.LIZ;
                                                Activity requireActivity = requireActivity();
                                                o.LJIIIIZZ(requireActivity, "requireActivity()");
                                                CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
                                                creativeLoadingDialogBuilder.backCanCancel(false);
                                                creativeLoadingDialogBuilder.showProgress(false);
                                                String string = getString(R.string.pc7);
                                                o.LJIIIIZZ(string, "getString(R.string.processing)");
                                                creativeLoadingDialogBuilder.loadingMessage(string);
                                                this.LLFZ = (C42278GiY) c42279GiZ.createLoadingDialog(requireActivity, 1107, creativeLoadingDialogBuilder);
                                            }
                                            C42278GiY c42278GiY = this.LLFZ;
                                            if (c42278GiY != null) {
                                                c42278GiY.delayShow(C42279GiZ.LIZ());
                                            }
                                        } else {
                                            if (this.LLI == null) {
                                                Activity requireActivity2 = requireActivity();
                                                o.LJIIIIZZ(requireActivity2, "requireActivity()");
                                                ProgressDialogC43239Gy3 LIZIZ = C42034Gec.LIZIZ(requireActivity2);
                                                LIZIZ.setMessage(getString(R.string.pc7));
                                                this.LLI = LIZIZ;
                                            }
                                            ProgressDialogC43239Gy3 progressDialogC43239Gy3 = this.LLI;
                                            if (progressDialogC43239Gy3 != null) {
                                                C16880lQ.LIZ(progressDialogC43239Gy3);
                                            }
                                        }
                                    }
                                    LJ = C10K.LJIJJ(C47261Igj.LJJIJIIJI(LJ, C10K.LJII(Math.max(0L, 50 - (System.currentTimeMillis() - currentTimeMillis)))));
                                    LJ.getClass();
                                }
                                C10K LJ2 = LJ.LJ(new AgS24S0210000_2(z, this, runnable, 0), c10c, null);
                                o.LJIIIIZZ(LJ2, "private fun justCompileS…        )\n        }\n    }");
                                return LJ2;
                            }
                            o.LJIJI("model");
                            throw null;
                        }
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    o.LJIJI("editAdapterApi");
                    throw null;
                }
                o.LJIJI("editPreviewApi");
                throw null;
            }
            o.LJIJI("stickerChallengeManager");
            throw null;
        }
        o.LJIJI("model");
        throw null;
    }

    public final void LLLIIIIL(Runnable runnable, boolean z) {
        C34K c34k = new C34K();
        c34k.element = true;
        LLLIIII(new ARunnableS13S0300000_2(c34k, this, runnable, 7), z);
        if (c34k.element) {
            C142575if c142575if = this.LJLLILLLL;
            if (c142575if != null) {
                c142575if.Iq0();
                c34k.element = false;
            } else {
                o.LJIJI("editPreviewApi");
                throw null;
            }
        }
    }

    @Override // X.AbstractC42651GoZ
    public final void onActivityResult(int i, int i2, Intent intent) {
        C42326GjK.LIZ.getClass();
        C42326GjK.LIZLLL(intent);
        Iterator<InterfaceC144185lG> it = this.LJZI.iterator();
        while (it.hasNext() && !it.next().onActivityResult(i, i2, intent)) {
        }
    }

    @Override // X.AbstractC147255qD, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.cdx, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
    }
}
