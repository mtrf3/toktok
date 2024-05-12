package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.m;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.ecommerce.usercard.ISearchShowcaseEntranceProvider;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.vesdk.VEEditorModel;
import com.zhiliaoapp.musically.R;
import dmt.av.video.VEPreviewParams;
import java.lang.reflect.Type;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.UyJ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78927UyJ implements InterfaceC32195CkJ, ISearchShowcaseEntranceProvider, InterfaceC73592SuS, InterfaceC38133Ext {
    public static final C78927UyJ LJLIL = new C78927UyJ();
    public static final C78927UyJ LJLILLLLZI = new C78927UyJ();

    @Override // com.ss.android.ugc.aweme.search.ecommerce.usercard.ISearchShowcaseEntranceProvider
    public boolean shouldShow() {
        C49410JaI.LIZ.getClass();
        return C49410JaI.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.usercard.ISearchShowcaseEntranceProvider
    public Integer getLayoutResId() {
        return Integer.valueOf(R.layout.chk);
    }

    public static boolean LIZ(Context context) {
        if (context != null) {
            return AnonymousClass636.LJIILJJIL(context);
        }
        return false;
    }

    public static final String LIZIZ(Aweme aweme) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("");
        LIZ.append(aweme.getAid());
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC38133Ext
    public String LIZJ(Object obj) {
        if (obj instanceof m) {
            return obj.toString();
        }
        if (obj instanceof String) {
            return obj.toString();
        }
        return GsonProtectorUtils.toJson(C09650Zl.LIZIZ, obj);
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.usercard.ISearchShowcaseEntranceProvider
    public InterfaceC49419JaR getSearchShowcaseEntranceView(ViewGroup view) {
        o.LJIIIZ(view, "view");
        return new C49430Jac(view);
    }

    @Override // X.InterfaceC73592SuS
    public boolean test(Object it) {
        o.LJIIIZ(it, "it");
        if (it == EnumC74492TLk.PRE_SHOW || it == EnumC74492TLk.HIDDEN) {
            return true;
        }
        return false;
    }

    public static final VEPreviewParams LIZLLL(VideoPublishEditModel videoPublishEditModel, C82622Wbi diContainer) {
        int i;
        int i2;
        o.LJIIIZ(diContainer, "diContainer");
        if (videoPublishEditModel.isUploadVideo()) {
            i = C1XY.LJIILLIIL(videoPublishEditModel.videoFps(false));
        } else {
            i = 30;
        }
        if (H7R.LJJIL(videoPublishEditModel)) {
            i2 = C78929UyL.LJIIJ(videoPublishEditModel.canvasVideoData);
        } else {
            i2 = -1;
        }
        VEPreviewParams LJJJJLL = C78926UyI.LJJJJLL(videoPublishEditModel, 1, i, i2);
        VEEditorModel vEEditorModel = null;
        Activity activity = (Activity) diContainer.LJ(ActivityC45651qj.class, null);
        if (activity instanceof SAAActivity) {
            Bundle bundle = ((WM7) diContainer.LJ(AbstractC42651GoZ.class, null)).mArguments;
            if (bundle != null) {
                vEEditorModel = (VEEditorModel) bundle.getParcelable("extra_editor_model");
            }
            LJJJJLL.setEditorModel(vEEditorModel);
        } else {
            Intent intent = activity.getIntent();
            if (intent != null) {
                vEEditorModel = (VEEditorModel) intent.getParcelableExtra("extra_editor_model");
            }
            LJJJJLL.setEditorModel(vEEditorModel);
        }
        LJJJJLL.setEditorHandler(-1L);
        AbstractC143185je LIZIZ = C47192Ifc.LIZIZ(videoPublishEditModel);
        LJJJJLL.mCanvasWidth = LIZIZ.LIZLLL();
        LJJJJLL.mCanvasHeight = LIZIZ.LJI();
        LJJJJLL.setVeAudioRecordParam(videoPublishEditModel.veAudioRecorderParam);
        AudioEffectParam audioEffectParam = videoPublishEditModel.veAudioEffectParam;
        if (audioEffectParam != null) {
            LJJJJLL.setVeAudioEffectParam(audioEffectParam);
        }
        C5RM.LIZ(LJJJJLL);
        LJJJJLL.mPageMode = 100;
        return LJJJJLL;
    }

    @Override // X.InterfaceC38133Ext
    public Object LJIIIZ(String str, Type type) {
        return GsonProtectorUtils.fromJson(C09650Zl.LIZIZ, str, type);
    }

    public static final W48 LJ(int i, WMH parentScene, C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        return new W48(diContainer, parentScene, i, new AqS180S0100000_14(diContainer, 373));
    }

    public static final void LJFF(View view, Integer num, Integer num2) {
        if (view.getLayoutParams() == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (num != null) {
            layoutParams.width = num.intValue();
        }
        if (num2 != null) {
            layoutParams.height = num2.intValue();
        }
        view.setLayoutParams(layoutParams);
    }
}
