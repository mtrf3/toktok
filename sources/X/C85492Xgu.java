package X;

import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.journey.step.swipeup.WelcomeVideoWidget;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.video.local.LocalVideoUrlModel;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.zhiliaoapp.musically.R;
import fjb.a;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.journey.step.swipeup.WelcomeVideoWidget$onBindView$1", f = "WelcomeVideoWidget.kt", l = {BaseNotice.CREATOR}, m = "invokeSuspend")
/* renamed from: X.Xgu, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85492Xgu extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public WelcomeVideoWidget LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ WelcomeVideoWidget LJLJI;
    public final /* synthetic */ View LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85492Xgu(WelcomeVideoWidget welcomeVideoWidget, View view, InterfaceC67352kd<? super C85492Xgu> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = welcomeVideoWidget;
        this.LJLJJI = view;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C85492Xgu(this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        WelcomeVideoWidget welcomeVideoWidget;
        UrlModel urlModel;
        Video video;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                welcomeVideoWidget = this.LJLIL;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            welcomeVideoWidget = this.LJLJI;
            this.LJLIL = welcomeVideoWidget;
            this.LJLILLLLZI = 1;
            welcomeVideoWidget.getClass();
            C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
            if (TextUtils.isEmpty(welcomeVideoWidget.LJZ)) {
                Boolean bool = Boolean.FALSE;
                C3C5.m7constructorimpl(bool);
                c84654XKg.resumeWith(bool);
            } else {
                C37246Eja c37246Eja = C37247Ejb.LIZIZ;
                POB type = POB.MB;
                c37246Eja.getClass();
                o.LJIIIZ(type, "type");
                long LIZJ = C268513p.LIZJ(EF7.LIZIZ());
                int i2 = POC.LIZ[type.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 == 4) {
                                long j = 1024;
                                LIZJ = ((LIZJ / j) / j) / j;
                            } else {
                                throw new C162476Zf();
                            }
                        } else {
                            long j2 = 1024;
                            LIZJ = (LIZJ / j2) / j2;
                        }
                    } else {
                        LIZJ /= 1024;
                    }
                }
                if (LIZJ > welcomeVideoWidget.LJLLJ) {
                    XKX.LIZLLL(C780334l.LJLIL, null, null, new C36950Eeo(welcomeVideoWidget, c84654XKg, null), 3);
                } else {
                    Boolean bool2 = Boolean.FALSE;
                    C3C5.m7constructorimpl(bool2);
                    c84654XKg.resumeWith(bool2);
                }
            }
            obj = c84654XKg.LIZ();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        welcomeVideoWidget.LJZI = ((Boolean) obj).booleanValue();
        WelcomeVideoWidget welcomeVideoWidget2 = this.LJLJI;
        if (welcomeVideoWidget2.LJZI) {
            View findViewById = this.LJLJJI.findViewById(R.id.n4q);
            o.LJIIIIZZ(findViewById, "view.findViewById(R.id.video_container)");
            welcomeVideoWidget2.LJLLLL = findViewById;
            View view = welcomeVideoWidget2.LJLLLL;
            if (view != null) {
                C85493Xgv c85493Xgv = new C85493Xgv(view, welcomeVideoWidget2, welcomeVideoWidget2.LJLLILLLL);
                welcomeVideoWidget2.LJLLLLLL = c85493Xgv;
                String localVideoPath = welcomeVideoWidget2.LJZ;
                o.LJIIIZ(localVideoPath, "localVideoPath");
                Aweme aweme = new Aweme();
                Video video2 = new Video();
                LocalVideoUrlModel localVideoUrlModel = new LocalVideoUrlModel();
                localVideoUrlModel.setSourceId(localVideoPath);
                localVideoUrlModel.setUri(localVideoPath);
                localVideoUrlModel.setUrlList(new ArrayList());
                localVideoUrlModel.getUrlList().add(localVideoUrlModel.getUri());
                localVideoUrlModel.setUrlKey(localVideoPath);
                video2.setPlayAddr(localVideoUrlModel);
                video2.setPlayAddrBytevc1(video2.getPlayAddr());
                aweme.setVideo(video2);
                aweme.setAid(localVideoPath);
                IYB.LIZJ.add(localVideoPath);
                Integer num = welcomeVideoWidget2.LJLJLLL;
                boolean z = welcomeVideoWidget2.LJLL;
                float f = welcomeVideoWidget2.LJLLI;
                c85493Xgv.LJIIIIZZ = true;
                c85493Xgv.LJII = aweme;
                if (c85493Xgv.LJFF.LIZ == 2) {
                    C24060x0 c24060x0 = c85493Xgv.LJ;
                    if (c24060x0 != null) {
                        ((VideoViewComponent) c24060x0.LIZ).pause();
                    } else {
                        o.LJIJI("mPlayVideoHelper");
                        throw null;
                    }
                }
                c85493Xgv.LJFF.LIZ = 0;
                C24060x0 c24060x02 = c85493Xgv.LJ;
                if (c24060x02 != null) {
                    c24060x02.LIZJ = aweme;
                    Aweme aweme2 = c85493Xgv.LJII;
                    if (aweme2 != null && aweme2.getVideo() != null) {
                        VideoViewComponent videoViewComponent = c85493Xgv.LIZJ;
                        if (videoViewComponent != null) {
                            if (videoViewComponent.LJLJI.getView() instanceof TextureView) {
                                VideoViewComponent videoViewComponent2 = c85493Xgv.LIZJ;
                                if (videoViewComponent2 != null) {
                                    videoViewComponent2.LJLJI.N7(new C85495Xgx(z, c85493Xgv, f));
                                } else {
                                    o.LJIJI("mVideoView");
                                    throw null;
                                }
                            }
                            VideoViewComponent videoViewComponent3 = c85493Xgv.LIZJ;
                            if (videoViewComponent3 != null) {
                                if (videoViewComponent3.LJLJI.getView() instanceof SurfaceView) {
                                    VideoViewComponent videoViewComponent4 = c85493Xgv.LIZJ;
                                    if (videoViewComponent4 != null) {
                                        View view2 = videoViewComponent4.LJLJI.getView();
                                        o.LJII(view2, "null cannot be cast to non-null type android.view.SurfaceView");
                                        ((SurfaceView) view2).getHolder().addCallback(new SurfaceHolderCallbackC85497Xgz());
                                    } else {
                                        o.LJIJI("mVideoView");
                                        throw null;
                                    }
                                }
                            } else {
                                o.LJIJI("mVideoView");
                                throw null;
                            }
                        } else {
                            o.LJIJI("mVideoView");
                            throw null;
                        }
                    }
                    if (c85493Xgv.LJIIIIZZ) {
                        if (num != null) {
                            int intValue = num.intValue();
                            C62846OlW c62846OlW = c85493Xgv.LIZLLL;
                            if (c62846OlW != null) {
                                C78765Uvh.LIZ(c62846OlW, intValue);
                            } else {
                                o.LJIJI("mCoverView");
                                throw null;
                            }
                        }
                    } else {
                        C62846OlW c62846OlW2 = c85493Xgv.LIZLLL;
                        if (c62846OlW2 != null) {
                            Aweme aweme3 = c85493Xgv.LJII;
                            if (aweme3 != null && (video = aweme3.getVideo()) != null) {
                                urlModel = video.getOriginCover();
                            } else {
                                urlModel = null;
                            }
                            C78765Uvh.LJFF(c62846OlW2, urlModel);
                        } else {
                            o.LJIJI("mCoverView");
                            throw null;
                        }
                    }
                    C62846OlW c62846OlW3 = c85493Xgv.LIZLLL;
                    if (c62846OlW3 != null) {
                        c62846OlW3.setVisibility(0);
                        C85493Xgv c85493Xgv2 = welcomeVideoWidget2.LJLLLLLL;
                        if (c85493Xgv2 != null) {
                            c85493Xgv2.LIZJ();
                        } else {
                            o.LJIJI("mWelcomeVideoHolder");
                            throw null;
                        }
                    } else {
                        o.LJIJI("mCoverView");
                        throw null;
                    }
                } else {
                    o.LJIJI("mPlayVideoHelper");
                    throw null;
                }
            } else {
                o.LJIJI("mVideoContainer");
                throw null;
            }
        } else {
            View view3 = this.LJLJJI;
            Integer num2 = welcomeVideoWidget2.LJLJLLL;
            if (num2 != null) {
                int intValue2 = num2.intValue();
                View findViewById2 = view3.findViewById(R.id.keb);
                o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.static_cover)");
                C62846OlW c62846OlW4 = (C62846OlW) findViewById2;
                welcomeVideoWidget2.LJLLL = c62846OlW4;
                c62846OlW4.setVisibility(0);
                C62846OlW c62846OlW5 = welcomeVideoWidget2.LJLLL;
                if (c62846OlW5 != null) {
                    C78765Uvh.LIZ(c62846OlW5, intValue2);
                } else {
                    o.LJIJI("mStaticCover");
                    throw null;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
