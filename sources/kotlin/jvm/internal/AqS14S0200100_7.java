package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C43712HDo;
import X.C43882HKc;
import X.C43966HNi;
import X.C44847Hit;
import X.C45495HtL;
import X.C45705Hwj;
import X.C45706Hwk;
import X.C45709Hwn;
import X.C46104I7o;
import X.C6BK;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.TM0;
import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class AqS14S0200100_7 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS14S0200100_7 aqS14S0200100_7, Object obj) {
        String preview;
        UrlModel cover;
        String uri;
        LibraryMaterialInfoSv libraryMaterialInfoSv;
        String preview2;
        UrlModel cover2;
        C45705Hwj it = (C45705Hwj) obj;
        o.LJIIIZ(it, "it");
        String str = "";
        if (it.LIZIZ) {
            if (!it.LIZ) {
                ProviderEffect providerEffect = it.LIZLLL;
                if (providerEffect != null) {
                    VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aqS14S0200100_7.l0;
                    long j = aqS14S0200100_7.j2;
                    Activity activity = (Activity) aqS14S0200100_7.l1;
                    C6BK c6bk = new C6BK();
                    LibraryMaterialInfoSv libraryMaterialInfoSv2 = videoPublishEditModel.libraryMaterialInfo;
                    if ((libraryMaterialInfoSv2 != null && (cover2 = libraryMaterialInfoSv2.getCover()) != null && (preview2 = cover2.getUri()) != null) || ((libraryMaterialInfoSv = videoPublishEditModel.libraryMaterialInfo) != null && (preview2 = libraryMaterialInfoSv.getPreview()) != null)) {
                        str = preview2;
                    }
                    c6bk.LIZ.put("url", str);
                    C43882HKc.LIZLLL(0, "library_download_error_rate", c6bk.LJ(), true);
                    C6BK c6bk2 = new C6BK();
                    c6bk2.LIZ.put("duration", C44847Hit.LIZ(j));
                    JSONObject LJ = c6bk2.LJ();
                    o.LJIIIIZZ(LJ, "newBuilder()\n           …is() - startTime).build()");
                    C43882HKc.LIZ.LJIILIIL("library_resource_download_takes_time", LJ, null);
                    videoPublishEditModel.creativeFlowData.setEnterMethod("click_add");
                    C43712HDo.LIZIZ(activity, C46104I7o.LJIILJJIL(providerEffect, null), null, videoPublishEditModel, false, 52);
                }
            } else if (it.LIZ) {
                C6BK c6bk3 = new C6BK();
                LibraryMaterialInfoSv libraryMaterialInfoSv3 = ((VideoPublishEditModel) aqS14S0200100_7.l0).libraryMaterialInfo;
                if (libraryMaterialInfoSv3 == null || (cover = libraryMaterialInfoSv3.getCover()) == null || (uri = cover.getUri()) == null) {
                    LibraryMaterialInfoSv libraryMaterialInfoSv4 = ((VideoPublishEditModel) aqS14S0200100_7.l0).libraryMaterialInfo;
                    if (libraryMaterialInfoSv4 != null && (preview = libraryMaterialInfoSv4.getPreview()) != null) {
                        str = preview;
                    }
                } else {
                    str = uri;
                }
                c6bk3.LIZ.put("url", str);
                C43882HKc.LIZLLL(1, "library_download_error_rate", c6bk3.LJ(), true);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS14S0200100_7 aqS14S0200100_7, Object obj) {
        boolean z;
        C45705Hwj it = (C45705Hwj) obj;
        o.LJIIIZ(it, "it");
        if (it.LIZIZ) {
            if (!it.LIZ) {
                ProviderEffect providerEffect = it.LIZLLL;
                if (providerEffect != null) {
                    com.ss.android.ugc.effectmanager.effect.model.ProviderEffect providerEffect2 = (com.ss.android.ugc.effectmanager.effect.model.ProviderEffect) aqS14S0200100_7.l0;
                    long j = aqS14S0200100_7.j2;
                    C45709Hwn c45709Hwn = (C45709Hwn) aqS14S0200100_7.l1;
                    MediaModel LJIILJJIL = C46104I7o.LJIILJJIL(providerEffect, null);
                    if (LJIILJJIL != null) {
                        C45706Hwk.LIZIZ(providerEffect2.getPreview_webp(), true, false);
                        C45706Hwk.LIZJ(j, false);
                        Context context = c45709Hwn.LJLLILLLL;
                        if (context != null) {
                            ShortVideoContext shortVideoContext = c45709Hwn.LJLJI;
                            VideoPublishEditModel videoPublishEditModel = c45709Hwn.LJLJJI;
                            TM0 tm0 = c45709Hwn.LJLLJ;
                            if (tm0 != null && tm0.LJLJLLL) {
                                z = true;
                            } else {
                                z = false;
                            }
                            C43712HDo.LIZIZ(context, LJIILJJIL, shortVideoContext, videoPublishEditModel, z, 32);
                        } else {
                            o.LJIJI("mContext");
                            throw null;
                        }
                    }
                }
            } else if (it.LIZ) {
                C45706Hwk.LIZIZ(((com.ss.android.ugc.effectmanager.effect.model.ProviderEffect) aqS14S0200100_7.l0).getPreview_webp(), false, false);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS14S0200100_7 aqS14S0200100_7, Object obj) {
        MediaModel LJIILJJIL;
        C45705Hwj it = (C45705Hwj) obj;
        o.LJIIIZ(it, "it");
        if (!it.LIZIZ) {
            if (it.LIZJ - ((MyMediaModel) aqS14S0200100_7.l0).libraryState.getProgress() >= 5 || it.LIZJ == 100) {
                ((MyMediaModel) aqS14S0200100_7.l0).libraryState.setProgress(it.LIZJ);
                ChooseMediaViewModel chooseMediaViewModel = ((TM0) aqS14S0200100_7.l1).LLFF;
                if (chooseMediaViewModel != null) {
                    MyMediaModel media = (MyMediaModel) aqS14S0200100_7.l0;
                    o.LJIIIZ(media, "media");
                    chooseMediaViewModel.setState(new AqS173S0100000_7(media, 257));
                }
            }
        } else {
            C45706Hwk.LIZIZ(((MyMediaModel) aqS14S0200100_7.l0).thumbnail, !it.LIZ, true);
            MyMediaModel media2 = (MyMediaModel) aqS14S0200100_7.l0;
            boolean z = it.LIZ;
            if (!z) {
                C45706Hwk.LIZJ(aqS14S0200100_7.j2, true);
                ProviderEffect providerEffect = it.LIZLLL;
                if (providerEffect != null && (LJIILJJIL = C46104I7o.LJIILJJIL(providerEffect, new C45495HtL(it.LIZIZ, it.LIZ, it.LIZJ, false, 8, null))) != null) {
                    MyMediaModel.Companion.getClass();
                    media2 = C43966HNi.LIZIZ(LJIILJJIL);
                }
            } else {
                media2.libraryState = new C45495HtL(it.LIZIZ, z, it.LIZJ, false, 8, null);
            }
            ChooseMediaViewModel chooseMediaViewModel2 = ((TM0) aqS14S0200100_7.l1).LLFF;
            if (chooseMediaViewModel2 != null) {
                o.LJIIIZ(media2, "media");
                chooseMediaViewModel2.setState(new AqS173S0100000_7(media2, 259));
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS14S0200100_7 aqS14S0200100_7, Object obj) {
        C45705Hwj it = (C45705Hwj) obj;
        o.LJIIIZ(it, "it");
        String str = null;
        if (it.LIZIZ) {
            if (!it.LIZ) {
                ProviderEffect providerEffect = it.LIZLLL;
                if (providerEffect != null) {
                    long j = aqS14S0200100_7.j2;
                    C45709Hwn c45709Hwn = (C45709Hwn) aqS14S0200100_7.l1;
                    LibraryMaterialInfoSv libraryMaterialInfoSv = (LibraryMaterialInfoSv) aqS14S0200100_7.l0;
                    MediaModel LJIILJJIL = C46104I7o.LJIILJJIL(new com.ss.android.ugc.effectmanager.effect.model.ProviderEffect(providerEffect), null);
                    C45706Hwk.LIZIZ(providerEffect.getPreview_webp(), true, false);
                    C45706Hwk.LIZJ(j, false);
                    Context context = c45709Hwn.LJLLILLLL;
                    if (context != null) {
                        C43712HDo.LIZIZ(context, LJIILJJIL, c45709Hwn.LJLJI, c45709Hwn.LJLJJI, libraryMaterialInfoSv.isFromSearch(), 32);
                    } else {
                        o.LJIJI("mContext");
                        throw null;
                    }
                }
            } else if (it.LIZ) {
                UrlModel cover = ((LibraryMaterialInfoSv) aqS14S0200100_7.l0).getCover();
                if (cover != null) {
                    str = cover.getUri();
                }
                C45706Hwk.LIZIZ(str, false, false);
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS14S0200100_7(VideoPublishEditModel videoPublishEditModel, long j, Activity activity, int i) {
        super(1);
        this.$t = i;
        this.l0 = videoPublishEditModel;
        this.j2 = j;
        this.l1 = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS14S0200100_7(LibraryMaterialInfoSv libraryMaterialInfoSv, long j, C45709Hwn c45709Hwn, int i) {
        super(1);
        this.$t = i;
        this.l0 = libraryMaterialInfoSv;
        this.j2 = j;
        this.l1 = c45709Hwn;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS14S0200100_7(MyMediaModel myMediaModel, TM0 tm0, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = myMediaModel;
        this.l1 = tm0;
        this.j2 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS14S0200100_7(com.ss.android.ugc.effectmanager.effect.model.ProviderEffect providerEffect, long j, C45709Hwn c45709Hwn, int i) {
        super(1);
        this.$t = i;
        this.l0 = providerEffect;
        this.j2 = j;
        this.l1 = c45709Hwn;
    }
}
