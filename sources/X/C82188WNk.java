package X;

import Y.ARunnableS50S0100000_14;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.ss.android.ugc.aweme.choosemusic.cutpanel.CutMusicPanel;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEEditor;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WNk, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82188WNk extends WM7 implements InterfaceC145565nU, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIJLIL;
    public final C82622Wbi LJLIL;
    public final InterfaceC82194WNq LJLILLLLZI;
    public final InterfaceC133865Ne LJLJI;
    public boolean LJLJJI;
    public final long LJLJJL;
    public final long LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public int LJLLILLLL;
    public AVMusic LJLLJ;
    public String LJLLL;
    public int LJLLLL;
    public AVMusic LJLLLLLL;
    public String LJLZ;
    public float LJZ;
    public boolean LJZI;
    public final InterfaceC82196WNs LJZL;
    public final SafeHandler LL;
    public final C82632Wbs LLD;
    public final C82631Wbr LLF;
    public final C82632Wbs LLFF;
    public final C82632Wbs LLFFF;
    public final InterfaceC153045zY LLFII;
    public final NLEEditor LLFZ;
    public boolean LLI;
    public final C62822Ol8 LLIFFJFJJ;
    public FrameLayout LLII;
    public InterfaceC82187WNj LLIIII;
    public FragmentManager LLIIIILZ;
    public XVD LLIIIJ;
    public C150055uj LLIIIL;
    public final ARunnableS50S0100000_14 LLIIIZ;
    public boolean LLIIJI;

    static {
        TBT tbt = new TBT(C82188WNk.class, "mVideoPublishModel", "getMVideoPublishModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLIIJLIL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C82188WNk.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0, c65351Pkp), C61845OOz.LIZJ(C82188WNk.class, "editCutMusicApi", "getEditCutMusicApi()Lcom/ss/android/ugc/gamora/editor/cutmusic/EditCutMusicApi;", 0, c65351Pkp), C61845OOz.LIZJ(C82188WNk.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0, c65351Pkp)};
    }

    @Override // X.InterfaceC145565nU
    public final void LJJJLIIL() {
        this.LL.removeCallbacksAndMessages(null);
    }

    public final InterfaceC145455nJ LLJILJIL() {
        return (InterfaceC145455nJ) this.LLFF.LIZ(this, LLIIJLIL[2]);
    }

    public final VideoPublishEditModel LLJILJILJ() {
        return (VideoPublishEditModel) this.LLD.LIZ(this, LLIIJLIL[0]);
    }

    public final void LLJJ() {
        String str;
        String str2;
        float f;
        boolean z;
        AVMusic aVMusic = this.LJLLJ;
        if (aVMusic != null) {
            str = aVMusic.getMusicId();
        } else {
            str = null;
        }
        AVMusic aVMusic2 = this.LJLLLLLL;
        if (aVMusic2 != null) {
            str2 = aVMusic2.getMusicId();
        } else {
            str2 = null;
        }
        if (!o.LJ(str, str2)) {
            InterfaceC82187WNj interfaceC82187WNj = this.LLIIII;
            if (interfaceC82187WNj != null) {
                interfaceC82187WNj.v7();
            } else {
                o.LJIJI("mCutMusicPanel");
                throw null;
            }
        }
        View view = this.mView;
        boolean z2 = false;
        if (view != null) {
            view.setVisibility(0);
        }
        FragmentManager fragmentManager = this.LLIIIILZ;
        if (fragmentManager != null) {
            InterfaceC82187WNj interfaceC82187WNj2 = this.LLIIII;
            if (interfaceC82187WNj2 != null) {
                interfaceC82187WNj2.wb(this.LJLJJI);
                InterfaceC153045zY interfaceC153045zY = this.LLFII;
                if (interfaceC153045zY != null) {
                    C122034qd LJJI = C17N.LJJI(interfaceC153045zY);
                    if (LJJI != null) {
                        InterfaceC123794tT LJFF = LJJI.LJFF();
                        C121914qR LJJIII = LJFF.LJJIII();
                        if (LJJIII != null) {
                            f = LJJIII.LJIIIIZZ;
                        } else {
                            f = 1.0f;
                        }
                        this.LJZ = f;
                        C121914qR LJJIII2 = LJFF.LJJIII();
                        if (LJJIII2 != null) {
                            z = LJJIII2.LJIIIZ;
                        } else {
                            z = false;
                        }
                        this.LLI = z;
                        if (!z) {
                            C121914qR LJJIII3 = LJFF.LJJIII();
                            if (LJJIII3 != null) {
                                LJJIII3.LJIIIZ = this.LLI;
                            } else {
                                LJJIII3 = null;
                            }
                            LJFF.LJJJJJL(LJJIII3);
                        }
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                InterfaceC82187WNj interfaceC82187WNj3 = this.LLIIII;
                if (interfaceC82187WNj3 != null) {
                    interfaceC82187WNj3.I5(this.LJZ);
                    InterfaceC82187WNj interfaceC82187WNj4 = this.LLIIII;
                    if (interfaceC82187WNj4 != null) {
                        interfaceC82187WNj4.d8(!this.LLI);
                        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.LJLIL.LJ(VideoPublishEditModel.class, null);
                        InterfaceC82187WNj interfaceC82187WNj5 = this.LLIIII;
                        if (interfaceC82187WNj5 != null) {
                            XVD xvd = this.LLIIIJ;
                            String enterMethod = LLJILJIL().getEnterMethod();
                            MusicBuzModel musicBuzModel = videoPublishEditModel.creativeModel.musicBuzModel;
                            interfaceC82187WNj5.kb(XVD.LIZ(xvd, null, null, null, null, enterMethod, musicBuzModel.musicSelectTab, musicBuzModel.musicRecTypeRecent, 24575));
                            InterfaceC82187WNj interfaceC82187WNj6 = this.LLIIII;
                            if (interfaceC82187WNj6 != null) {
                                interfaceC82187WNj6.r(this.LJZI);
                                InterfaceC82187WNj interfaceC82187WNj7 = this.LLIIII;
                                if (interfaceC82187WNj7 != null) {
                                    C44423Hc3 LJ = C73098SmU.LJ();
                                    if (LJ != null && LJ.LJI() == 3) {
                                        z2 = true;
                                    }
                                    interfaceC82187WNj7.Fj(z2);
                                    InterfaceC82187WNj interfaceC82187WNj8 = this.LLIIII;
                                    if (interfaceC82187WNj8 != null) {
                                        interfaceC82187WNj8.x0(fragmentManager);
                                    } else {
                                        o.LJIJI("mCutMusicPanel");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("mCutMusicPanel");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("mCutMusicPanel");
                                throw null;
                            }
                        } else {
                            o.LJIJI("mCutMusicPanel");
                            throw null;
                        }
                    } else {
                        o.LJIJI("mCutMusicPanel");
                        throw null;
                    }
                } else {
                    o.LJIJI("mCutMusicPanel");
                    throw null;
                }
            } else {
                o.LJIJI("mCutMusicPanel");
                throw null;
            }
        }
        this.LL.post(this.LLIIIZ);
    }

    public final InterfaceC143655kP getEditPreviewApi() {
        return (InterfaceC143655kP) this.LLFFF.LIZ(this, LLIIJLIL[3]);
    }

    @Override // X.InterfaceC145565nU
    public final void LLIIIILZ() {
        boolean booleanValue;
        if (LLJILJILJ().getMMusicPath() != null && !LLJILJILJ().isStickPointMode) {
            getEditPreviewApi().U2(false, false, false);
            C5XM c5xm = (C5XM) this.LLF.LIZ(this, LLIIJLIL[1]);
            if (c5xm != null) {
                c5xm.Fu0(false);
            }
            this.LJLILLLLZI.LIZJ(this.LJZ);
            this.LJLLILLLL = C78934UyQ.LJLIL.getMusicService().getMusicDuration(LLJILJILJ().getMMusicPath());
            int mMusicStart = LLJILJILJ().getMMusicStart();
            this.LJLJLJ = mMusicStart;
            this.LJLJLLL = mMusicStart;
            Boolean isSoundLoop = LLJILJILJ().getIsSoundLoop();
            if (isSoundLoop == null) {
                booleanValue = false;
            } else {
                booleanValue = isSoundLoop.booleanValue();
            }
            this.LJLL = booleanValue;
            this.LJLLI = booleanValue;
            if (!this.LLIIJI) {
                LLJJ();
            }
            InterfaceC82187WNj interfaceC82187WNj = this.LLIIII;
            Integer num = null;
            if (interfaceC82187WNj != null) {
                FrameLayout mc = interfaceC82187WNj.mc();
                if (mc != null) {
                    C150045ui c150045ui = (C150045ui) this.LLIFFJFJJ.getValue();
                    if (c150045ui != null) {
                        Activity activity = this.mActivity;
                        o.LJII(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                        c150045ui.LIZJ((C29S) activity, mc);
                    }
                    InterfaceC82187WNj interfaceC82187WNj2 = this.LLIIII;
                    if (interfaceC82187WNj2 != null) {
                        interfaceC82187WNj2.v6(mc);
                    } else {
                        o.LJIJI("mCutMusicPanel");
                        throw null;
                    }
                }
                InterfaceC153045zY value = getEditPreviewApi().Kh().getValue();
                if (value == null || (num = Integer.valueOf(value.LLJJJJJIL(0, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek, this.LJLJI))) == null || num.intValue() != 0) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("cutMusic seek error: ");
                    LIZ.append(num);
                    H7B.LIZJ(X1D.LIZIZ(LIZ));
                    return;
                }
                return;
            }
            o.LJIJI("mCutMusicPanel");
            throw null;
        }
    }

    @Override // X.WM7
    public final void onPause() {
        super.onPause();
        this.LL.removeCallbacksAndMessages(null);
    }

    @Override // X.WM7
    public final void onResume() {
        super.onResume();
        this.LL.post(this.LLIIIZ);
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC145565nU
    public final void C3(boolean z) {
        this.LJLJJI = z;
    }

    public final void LLJJI(boolean z) {
        this.LLIIJI = true;
        IMusicService LJJLIIIJJI = MusicService.LJJLIIIJJI();
        String str = this.LJLLL;
        InterfaceC82187WNj interfaceC82187WNj = this.LLIIII;
        if (interfaceC82187WNj != null) {
            LJJLIIIJJI.LJJIJL(str, (interfaceC82187WNj.W1() * this.LJLLILLLL) / this.LJLJL, new C82192WNo(this, z));
        } else {
            o.LJIJI("mCutMusicPanel");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
    
        if (r1 == null) goto L19;
     */
    @Override // X.WM7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.os.Bundle r6) {
        /*
            r5 = this;
            super.onActivityCreated(r6)
            X.5kP r0 = r5.getEditPreviewApi()
            androidx.lifecycle.LiveData r0 = r0.Kh()
            java.lang.Object r0 = r0.getValue()
            X.5zY r0 = (X.InterfaceC153045zY) r0
            r4 = 0
            if (r0 == 0) goto Lda
            int r0 = r0.getDuration()
        L18:
            r5.LJLJL = r0
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.LLJILJILJ()
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel r0 = r0.musicBuzModel
            com.ss.android.ugc.aweme.shortvideo.AVMusic r3 = com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt.extractAVMusic(r0)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "OLD_DRAFT avMusicIsNull:"
            r1.append(r0)
            r2 = 1
            if (r3 != 0) goto L33
            r4 = 1
        L33:
            r1.append(r4)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.H7B.LIZ(r0)
            if (r3 == 0) goto L9a
            int r0 = r3.getDuration()
            if (r0 > 0) goto L63
            X.HEa r0 = X.C78934UyQ.LJLIL
            com.ss.android.ugc.aweme.port.in.IAnotherMusicService r1 = r0.getMusicService()
            java.lang.String r0 = r3.path
            int r0 = r1.getMusicDuration(r0)
            r3.setDuration(r0)
            int r1 = r3.getDuration()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.LLJILJILJ()
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel r0 = r0.musicBuzModel
            X.I9T.LJIIIIZZ(r1, r0)
        L63:
            java.lang.String r1 = r3.path
            if (r1 == 0) goto Ld1
            android.content.Context r0 = r5.getApplicationContext()
            boolean r0 = X.C170626mo.LIZJ(r0, r1)
            if (r0 == 0) goto L75
            java.lang.String r1 = r3.path
        L73:
            if (r1 != 0) goto L7d
        L75:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.LLJILJILJ()
            java.lang.String r1 = r0.getMMusicPath()
        L7d:
            r5.LJLLJ = r3
            int r0 = r3.getDuration()
            r5.LJLLILLLL = r0
            if (r1 != 0) goto L89
            java.lang.String r1 = ""
        L89:
            r5.LJLLL = r1
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.LLJILJILJ()
            int r0 = r0.getMMusicStart()
            r5.LJLJLJ = r0
            r5.LLIIJI = r2
            r5.LLJJI(r2)
        L9a:
            X.5nJ r0 = r5.LLJILJIL()
            X.0IB r2 = r0.getVideoLength()
            Y.AObjectS89S0100000_14 r1 = new Y.AObjectS89S0100000_14
            r0 = 187(0xbb, float:2.62E-43)
            r1.<init>(r5, r0)
            r2.LIZIZ(r5, r1)
            X.5nJ r0 = r5.LLJILJIL()
            X.0IB r2 = r0.A00()
            Y.AObjectS89S0100000_14 r1 = new Y.AObjectS89S0100000_14
            r0 = 188(0xbc, float:2.63E-43)
            r1.<init>(r5, r0)
            r2.LIZIZ(r5, r1)
            X.5nJ r0 = r5.LLJILJIL()
            com.bytedance.als.LiveEvent r2 = r0.vk()
            Y.AObjectS89S0100000_14 r1 = new Y.AObjectS89S0100000_14
            r0 = 189(0xbd, float:2.65E-43)
            r1.<init>(r5, r0)
            r2.LIZLLL(r5, r1)
            return
        Ld1:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.LLJILJILJ()
            java.lang.String r1 = r0.getMMusicPath()
            goto L73
        Lda:
            r0 = 0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82188WNk.onActivityCreated(android.os.Bundle):void");
    }

    @Override // X.InterfaceC145565nU
    public final void r(boolean z) {
        this.LJZI = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.WM7
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        String str;
        FragmentManager fragmentManager;
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        CutMusicPanel LJJJJJ = MusicService.LJJLIIIJJI().LJJJJJ();
        o.LJIIIIZZ(LJJJJJ, "get().getService(IMusicS…class.java).cutMusicPanel");
        this.LLIIII = LJJJJJ;
        if (C79004UzY.LJJIJL(LLJILJILJ().canvasVideoData)) {
            InterfaceC82187WNj interfaceC82187WNj = this.LLIIII;
            if (interfaceC82187WNj != null) {
                interfaceC82187WNj.t1();
            } else {
                o.LJIJI("mCutMusicPanel");
                throw null;
            }
        }
        InterfaceC82187WNj interfaceC82187WNj2 = this.LLIIII;
        if (interfaceC82187WNj2 != null) {
            interfaceC82187WNj2.Qj(SceneExtensionsKt.LIZLLL(this), inflater, container, L7Q.DARK);
            InterfaceC82187WNj interfaceC82187WNj3 = this.LLIIII;
            if (interfaceC82187WNj3 != null) {
                FrameLayout mc = interfaceC82187WNj3.mc();
                if (mc != null) {
                    InterfaceC82187WNj interfaceC82187WNj4 = this.LLIIII;
                    if (interfaceC82187WNj4 != null) {
                        interfaceC82187WNj4.v6(mc);
                    } else {
                        o.LJIJI("mCutMusicPanel");
                        throw null;
                    }
                }
                ((C169426ks) C169426ks.LIZIZ.getValue()).LIZ(new C138965cq(new AqS180S0100000_14(this, 200)));
                InterfaceC82187WNj interfaceC82187WNj5 = this.LLIIII;
                if (interfaceC82187WNj5 != null) {
                    interfaceC82187WNj5.C(new C82193WNp(this));
                    InterfaceC82187WNj interfaceC82187WNj6 = this.LLIIII;
                    if (interfaceC82187WNj6 != null) {
                        interfaceC82187WNj6.f5(new C82189WNl(this));
                        InterfaceC82187WNj interfaceC82187WNj7 = this.LLIIII;
                        if (interfaceC82187WNj7 != null) {
                            interfaceC82187WNj7.rb(new C82190WNm(this));
                            InterfaceC82187WNj interfaceC82187WNj8 = this.LLIIII;
                            if (interfaceC82187WNj8 != null) {
                                interfaceC82187WNj8.Hb(new C82191WNn(this));
                                VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.LJLIL.LJ(VideoPublishEditModel.class, null);
                                String str2 = "video_edit_page";
                                String str3 = videoPublishEditModel.mShootWay;
                                String creationId = videoPublishEditModel.getCreationId();
                                String LJIIIIZZ = H7R.LJIIIIZZ(videoPublishEditModel);
                                String LJIIIZ = H7R.LJIIIZ(videoPublishEditModel);
                                String musicId = videoPublishEditModel.getMusicId();
                                if (C44384HbQ.LJJIFFI()) {
                                    str = "recommend_music";
                                } else {
                                    str = "edit_normal";
                                }
                                String enterMethod = LLJILJIL().getEnterMethod();
                                MusicBuzModel musicBuzModel = videoPublishEditModel.creativeModel.musicBuzModel;
                                this.LLIIIJ = new XVD(str2, str3, creationId, LJIIIIZZ, LJIIIZ, musicId, str, false, null, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, enterMethod, null == true ? 1 : 0, musicBuzModel.musicSelectTab, musicBuzModel.musicRecTypeRecent, 24448);
                                this.LLIIIL = new C150055uj(videoPublishEditModel.getCreationId(), H7R.LJIIIIZZ(videoPublishEditModel), H7R.LJIIIZ(videoPublishEditModel), videoPublishEditModel.getMusicId(), videoPublishEditModel.mShootWay, 0);
                                View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.cch, container, false);
                                o.LJII(LLLLIILL, "null cannot be cast to non-null type android.widget.FrameLayout");
                                this.LLII = (FrameLayout) LLLLIILL;
                                ActivityC45651qj activityC45651qj = (ActivityC45651qj) this.mActivity;
                                if (activityC45651qj != null) {
                                    fragmentManager = activityC45651qj.getSupportFragmentManager();
                                } else {
                                    fragmentManager = null;
                                }
                                this.LLIIIILZ = fragmentManager;
                                this.LJLLLLLL = MusicBeanUtilKt.extractAVMusic(LLJILJILJ().creativeModel.musicBuzModel);
                                FrameLayout frameLayout = this.LLII;
                                if (frameLayout != null) {
                                    return frameLayout;
                                }
                                o.LJIJI("mParentLayout");
                                throw null;
                            }
                            o.LJIJI("mCutMusicPanel");
                            throw null;
                        }
                        o.LJIJI("mCutMusicPanel");
                        throw null;
                    }
                    o.LJIJI("mCutMusicPanel");
                    throw null;
                }
                o.LJIJI("mCutMusicPanel");
                throw null;
            }
            o.LJIJI("mCutMusicPanel");
            throw null;
        }
        o.LJIJI("mCutMusicPanel");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C82188WNk(C82622Wbi diContainer, InterfaceC82194WNq actionListener, InterfaceC133865Ne seekCallback, boolean z) {
        C122034qd LJJI;
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(actionListener, "actionListener");
        o.LJIIIZ(seekCallback, "seekCallback");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = actionListener;
        this.LJLJI = seekCallback;
        this.LJLJJI = z;
        this.LJLJJL = ((Number) C5BA.LIZ(EnumC127484zQ.VIDEO_CLIP_MIN_DURATION, 100L)).longValue();
        this.LJLJJLL = 60L;
        this.LJLLL = "";
        this.LJZ = 1.0f;
        MusicService.LJJLIIIJJI().LJJIFFI();
        this.LJZL = XVC.LIZ;
        this.LL = new SafeHandler(this);
        NLEEditor nLEEditor = null;
        this.LLD = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LLF = UCI.LJII(diContainer, C5XM.class, null);
        this.LLFF = UCI.LJI(diContainer, InterfaceC145455nJ.class, null);
        this.LLFFF = UCI.LJI(diContainer, InterfaceC143655kP.class, null);
        this.LLFII = getEditPreviewApi().Kh().getValue();
        InterfaceC153045zY value = getEditPreviewApi().Kh().getValue();
        if (value != null && (LJJI = C17N.LJJI(value)) != null) {
            nLEEditor = LJJI.LJIIJ;
        }
        this.LLFZ = nLEEditor;
        this.LLIFFJFJJ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 198));
        this.LLIIIJ = new XVD(null, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, false, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 131071);
        this.LLIIIZ = new ARunnableS50S0100000_14(this, 109);
    }
}
