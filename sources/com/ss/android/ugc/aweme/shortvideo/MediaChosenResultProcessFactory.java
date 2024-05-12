package com.ss.android.ugc.aweme.shortvideo;

import X.ActivityC45651qj;
import X.C173096qn;
import X.C41988Gds;
import X.C41996Ge0;
import X.C42118Gfy;
import X.C42268GiO;
import X.C42271GiR;
import X.C42294Gio;
import X.C43615H9v;
import X.C58096Mr6;
import X.C82622Wbi;
import X.H7O;
import X.H9O;
import X.H9P;
import X.H9Q;
import X.H9U;
import X.InterfaceC45242HpG;
import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.ShortVideoCommonParams;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.IMediaChosenResultProcessFactory;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class MediaChosenResultProcessFactory implements IMediaChosenResultProcessFactory {
    public static IMediaChosenResultProcessFactory LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IMediaChosenResultProcessFactory.class, false);
        if (LIZ != null) {
            return (IMediaChosenResultProcessFactory) LIZ;
        }
        if (C58096Mr6.V6 == null) {
            synchronized (IMediaChosenResultProcessFactory.class) {
                if (C58096Mr6.V6 == null) {
                    C58096Mr6.V6 = new MediaChosenResultProcessFactory();
                }
            }
        }
        return C58096Mr6.V6;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.IMediaChosenResultProcessFactory
    public final C173096qn LIZ(Activity activity) {
        o.LJIIIZ(activity, "activity");
        return new C173096qn(activity);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.IMediaChosenResultProcessFactory
    public final InterfaceC45242HpG LIZIZ(final ActivityC45651qj activityC45651qj, C82622Wbi c82622Wbi, int i, long j, long j2) {
        if (i != 1) {
            if (i != 2) {
                if (i != 7) {
                    if (i != 8) {
                        if (i != 15) {
                            if (i != 21) {
                                if (i != 23) {
                                    if (i != 25) {
                                        if (i != 28) {
                                            if (i != 29) {
                                                if (i != 33) {
                                                    if (i != 34) {
                                                        switch (i) {
                                                            case 10:
                                                                return new InterfaceC45242HpG(activityC45651qj) { // from class: X.6r9
                                                                    public final ActivityC45651qj LIZ;
                                                                    public ShortVideoContext LIZIZ;

                                                                    @Override // X.InterfaceC45242HpG
                                                                    public final void LIZ() {
                                                                    }

                                                                    @Override // X.InterfaceC45242HpG
                                                                    public final void LIZIZ(int i2) {
                                                                    }

                                                                    @Override // X.InterfaceC45242HpG
                                                                    public final void LJIJJLI() {
                                                                    }

                                                                    @Override // X.InterfaceC45242HpG
                                                                    public final void dismissDialog() {
                                                                    }

                                                                    {
                                                                        this.LIZ = activityC45651qj;
                                                                    }

                                                                    /* JADX WARN: Code restructure failed: missing block: B:49:0x0147, code lost:
                                                                    
                                                                        if (r6 >= 1) goto L49;
                                                                     */
                                                                    /* JADX WARN: Removed duplicated region for block: B:52:0x014f  */
                                                                    /* JADX WARN: Removed duplicated region for block: B:69:0x01a9  */
                                                                    /* JADX WARN: Type inference failed for: r4v3, types: [X.6oi] */
                                                                    @Override // X.InterfaceC45242HpG
                                                                    /*
                                                                        Code decompiled incorrectly, please refer to instructions dump.
                                                                        To view partially-correct add '--show-bad-code' argument
                                                                    */
                                                                    public final void LIZLLL(int r47, android.content.Intent r48) {
                                                                        /*
                                                                            Method dump skipped, instructions count: 432
                                                                            To view this dump add '--comments-level debug' option
                                                                        */
                                                                        throw new UnsupportedOperationException("Method not decompiled: X.C173316r9.LIZLLL(int, android.content.Intent):void");
                                                                    }

                                                                    @Override // X.InterfaceC45242HpG
                                                                    public final int LIZJ(List<? extends MediaModel> list, CreativeInfo creativeInfo, boolean z) {
                                                                        C41993Gdx.LIZ(list, creativeInfo);
                                                                        return 0;
                                                                    }
                                                                };
                                                            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                                                return new C42271GiR(activityC45651qj);
                                                            case 12:
                                                                return new C41988Gds(activityC45651qj, j, j2);
                                                            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                                                                break;
                                                            default:
                                                                switch (i) {
                                                                    case 17:
                                                                        break;
                                                                    case 18:
                                                                        return new C42118Gfy(activityC45651qj, j, j2);
                                                                    case 19:
                                                                        return new C41996Ge0(activityC45651qj);
                                                                    default:
                                                                        return new C43615H9v(activityC45651qj);
                                                                }
                                                        }
                                                    } else {
                                                        return new H9Q(activityC45651qj);
                                                    }
                                                } else {
                                                    return new H9P(activityC45651qj);
                                                }
                                            } else {
                                                return new H7O(activityC45651qj, c82622Wbi);
                                            }
                                        } else {
                                            return new C42268GiO(activityC45651qj);
                                        }
                                    } else {
                                        return new H9U(activityC45651qj, c82622Wbi);
                                    }
                                }
                            } else {
                                return new C42294Gio(activityC45651qj);
                            }
                        } else {
                            return new InterfaceC45242HpG(activityC45651qj) { // from class: X.6rq
                                public final ActivityC45651qj LIZ;

                                @Override // X.InterfaceC45242HpG
                                public final void LIZ() {
                                }

                                @Override // X.InterfaceC45242HpG
                                public final void LIZIZ(int i2) {
                                }

                                @Override // X.InterfaceC45242HpG
                                public final void LJIJJLI() {
                                }

                                @Override // X.InterfaceC45242HpG
                                public final void dismissDialog() {
                                }

                                {
                                    this.LIZ = activityC45651qj;
                                }

                                @Override // X.InterfaceC45242HpG
                                public final void LIZLLL(int i2, Intent data) {
                                    o.LJIIIZ(data, "data");
                                    ArrayList parcelableArrayListExtra = data.getParcelableArrayListExtra("key_choose_media_data");
                                    if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty() || TextUtils.isEmpty(((MediaModel) ListProtector.get(parcelableArrayListExtra, 0)).fileLocalUriPath)) {
                                        return;
                                    }
                                    C45685HwP.LJFF.LIZ();
                                    MediaModel mediaModel = (MediaModel) ListProtector.get(parcelableArrayListExtra, 0);
                                    Effect effect = (Effect) data.getParcelableExtra("key_custom_effect_sticker");
                                    String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(data, "shoot_way");
                                    String str = "";
                                    if (LLJJIJIIJIL == null) {
                                        LLJJIJIIJIL = "";
                                    }
                                    String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(data, "content_source");
                                    if (LLJJIJIIJIL2 == null) {
                                        LLJJIJIIJIL2 = "";
                                    }
                                    String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(data, "content_type");
                                    if (LLJJIJIIJIL3 != null) {
                                        str = LLJJIJIIJIL3;
                                    }
                                    CreativeInfo LJIJI = C77412UZs.LJIJI(data);
                                    HZV.LIZ().LJIJJLI(this.LIZ, mediaModel, LJIJI, effect, new ShortVideoCommonParams(LLJJIJIIJIL, LLJJIJIIJIL2, str, LJIJI.getCreationId()));
                                }

                                @Override // X.InterfaceC45242HpG
                                public final int LIZJ(List<? extends MediaModel> list, CreativeInfo creativeInfo, boolean z) {
                                    C41993Gdx.LIZ(list, creativeInfo);
                                    return 0;
                                }
                            };
                        }
                    } else {
                        return new H9P((Activity) activityC45651qj);
                    }
                }
                return new InterfaceC45242HpG(activityC45651qj) { // from class: X.6rr
                    public final Activity LIZ;

                    @Override // X.InterfaceC45242HpG
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC45242HpG
                    public final void LIZIZ(int i2) {
                    }

                    @Override // X.InterfaceC45242HpG
                    public final void LJIJJLI() {
                    }

                    @Override // X.InterfaceC45242HpG
                    public final void dismissDialog() {
                    }

                    {
                        this.LIZ = activityC45651qj;
                    }

                    @Override // X.InterfaceC45242HpG
                    public final void LIZLLL(int i2, Intent data) {
                        o.LJIIIZ(data, "data");
                        Activity activity = this.LIZ;
                        if (activity != null) {
                            activity.setResult(-1, data);
                            this.LIZ.finish();
                            this.LIZ.overridePendingTransition(0, R.anim.y);
                        }
                    }

                    @Override // X.InterfaceC45242HpG
                    public final int LIZJ(List<? extends MediaModel> list, CreativeInfo creativeInfo, boolean z) {
                        C41993Gdx.LIZ(list, creativeInfo);
                        return 0;
                    }
                };
            }
            return new H9O(activityC45651qj, j, j2);
        }
        return new C43615H9v(activityC45651qj);
    }
}
