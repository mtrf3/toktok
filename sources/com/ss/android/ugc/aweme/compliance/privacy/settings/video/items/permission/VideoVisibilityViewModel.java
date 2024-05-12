package com.ss.android.ugc.aweme.compliance.privacy.settings.video.items.permission;

import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C113554cx;
import X.C187227Wk;
import X.C26048AKe;
import X.C2U8;
import X.C47261Igj;
import X.C51029K0z;
import X.C52227Ked;
import X.C71945SLl;
import X.C72818Shy;
import X.C73969T1h;
import X.C76052yf;
import X.C77119UOl;
import X.C78983UzD;
import X.EF7;
import X.EnumC42934Gt8;
import X.F15;
import X.InterfaceC64592gB;
import X.OSZ;
import X.SPF;
import X.T16;
import Y.AfS64S0100000_12;
import android.app.Activity;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.api.RemoveTemplateApi;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.api.VideoPrivacySettingApi;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.PrivateUrlModel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AqS67S0110000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class VideoVisibilityViewModel extends BaseVisibilityViewModel {
    public boolean LJLL;

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.video.base.BaseVideoPrivacySettingViewModel
    public final int ov0() {
        if (nv0().isSubOnlyVideo()) {
            return -1000;
        }
        AwemeStatus status = nv0().getStatus();
        if (status != null) {
            return status.getPrivateStatus();
        }
        return 1;
    }

    @Override // com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel
    public final AbstractC73672Svk<PrivateUrlModel> jv0(int i) {
        int i2 = 1;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    i2 = 3;
                }
            } else {
                i2 = 2;
            }
        }
        return C77119UOl.LJIJ(((VideoPrivacySettingApi) SPF.LIZ.getValue()).setVideoVisibility(nv0().getAid(), i2), "/aweme/v1/aweme/modify/visibility/");
    }

    @Override // com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel
    public final void lv0(int i) {
        Integer value = this.LJLJI.getValue();
        if (value == null || value.intValue() != i) {
            super.lv0(i);
        } else {
            this.LJLJLLL.postValue(Integer.valueOf(i));
            rv0(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.video.base.BaseVideoPrivacySettingViewModel
    public final void pv0(int i) {
        Aweme nv0 = nv0();
        if (i != 0 && nv0.playlist_info != null) {
            nv0.playlist_info = null;
        }
        nv0.getStatus().setPrivateStatus(i);
        nv0.setSubOnlyVideo(false);
    }

    public final void qv0(boolean z) {
        String aid = String.valueOf(EF7.LJIIIZ);
        List<AnchorCommonStruct> anchors = nv0().getAnchors();
        o.LJIIIIZZ(anchors, "aweme.anchors");
        for (AnchorCommonStruct anchorCommonStruct : anchors) {
            int i = 1;
            if (anchorCommonStruct.getType() == EnumC42934Gt8.ANCHOR_PUGC_TEMPLATE.getTYPE()) {
                String templateId = anchorCommonStruct.getId();
                if (!z) {
                    i = 2;
                }
                AqS67S0110000_12 aqS67S0110000_12 = new AqS67S0110000_12(this, z, 1);
                o.LJIIIZ(aid, "aid");
                o.LJIIIZ(templateId, "templateId");
                RemoveTemplateApi.LIZ.postTemplateRemove(aid, templateId, i).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS64S0100000_12(aqS67S0110000_12, 158), new InterfaceC64592gB() { // from class: X.9EU
                    @Override // X.InterfaceC64592gB
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    }
                });
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final void rv0(int i) {
        Activity activity;
        int i2;
        if (this.LJLJL) {
            int i3 = C52227Ked.LIZ;
            if (i3 != 2 && i3 != 1) {
                return;
            }
        } else {
            int i4 = C52227Ked.LIZ;
            if (i4 != 2 && i4 != 3) {
                return;
            }
        }
        WeakReference<Activity> weakReference = this.LJLJLJ;
        Integer num = null;
        if (weakReference != null) {
            activity = weakReference.get();
        } else {
            activity = null;
        }
        if (!(activity instanceof ActivityC45651qj)) {
            activity = null;
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    num = Integer.valueOf(R.string.p5u);
                }
            } else {
                num = Integer.valueOf(R.string.p5v);
            }
        } else {
            if (C71945SLl.LIZLLL()) {
                i2 = R.string.p5t;
            } else {
                i2 = R.string.p5s;
            }
            num = Integer.valueOf(i2);
        }
        if (activity != null && num != null) {
            C26048AKe c26048AKe = new C26048AKe(activity);
            c26048AKe.LJFF(num.intValue());
            c26048AKe.LJII();
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.video.base.BaseVideoPrivacySettingViewModel, com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel
    public final void iv0(int i, BaseResponse response) {
        PrivateUrlModel privateUrlModel;
        o.LJIIIZ(response, "response");
        int ov0 = ov0();
        pv0(i);
        this.LJLJLLL.postValue(Integer.valueOf(i));
        AwemeService.LIZ().R1(nv0());
        rv0(i);
        Aweme nv0 = nv0();
        if (response instanceof PrivateUrlModel) {
            privateUrlModel = (PrivateUrlModel) response;
        } else {
            privateUrlModel = null;
        }
        C2U8.LIZ(new C187227Wk(nv0, privateUrlModel));
        long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        new F15();
        C72818Shy.LIZ(new C76052yf(currentThreadTimeMillis, F15.LIZLLL(C51029K0z.LJJIIZI(new OSZ("changeset", C47261Igj.LJJIJ(C113554cx.LJJL(new OSZ("aweme_id", nv0().getAid()), new OSZ("private_status", C113554cx.LJJL(new OSZ("from", Integer.valueOf(ov0)), new OSZ("to", Integer.valueOf(i))))))))), "aweme_struct_field_change"));
        if (C78983UzD.LJJIZ(nv0())) {
            if (i != 0) {
                if (!C78983UzD.LJJJJI(nv0())) {
                    qv0(true);
                }
            } else {
                if (!C78983UzD.LJJJJI(nv0())) {
                    return;
                }
                qv0(false);
            }
        }
    }
}
