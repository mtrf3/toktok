package com.ss.android.ugc.aweme.commerce.tools.tcm.service;

import X.AI8;
import X.C41457GOv;
import X.C42905Gsf;
import X.C42906Gsg;
import X.GF4;
import X.GNU;
import X.InterfaceC67352kd;
import android.app.Activity;
import android.content.Context;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceTcmPublishModule;
import com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel;
import com.ss.android.ugc.aweme.commerce.tools.tcm.model.BCPageModel;
import com.ss.android.ugc.aweme.commerce.tools.tcm.model.BrandedContentSwitchStatus;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.jvm.internal.AqS173S0100000_7;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public interface ICommerceToolsTcmService {
    CommerceTcmPublishModule LIZ(GF4 gf4);

    void LIZIZ(JSONObject jSONObject);

    void LIZJ(Context context, CommerceToolsTcmModel commerceToolsTcmModel, AqS173S0100000_7 aqS173S0100000_7);

    boolean LIZLLL(boolean z, boolean z2);

    void LJ(Context context, C42905Gsf c42905Gsf, C42906Gsg c42906Gsg);

    Object LJFF(Activity activity, AwemeDraft awemeDraft, String str, GNU gnu);

    void LJI(AI8 ai8, Fragment fragment, VideoPublishEditModel videoPublishEditModel);

    void LJII(Fragment fragment, ViewStub viewStub, CommerceToolsTcmModel commerceToolsTcmModel, boolean z, boolean z2, boolean z3, int i);

    void LJIIIIZZ(Context context, String str);

    boolean LJIIIZ(Context context, boolean z, boolean z2, boolean z3, List list, CommerceToolsTcmModel commerceToolsTcmModel, BrandedContentSwitchStatus brandedContentSwitchStatus, int i);

    boolean LJIIJ();

    Object LJIIJJI(Fragment fragment, Aweme aweme, boolean z, boolean z2, boolean z3, InterfaceC67352kd<? super Integer> interfaceC67352kd);

    void LJIIL(Activity activity, boolean z, CommerceToolsTcmModel commerceToolsTcmModel, boolean z2, int i);

    void LJIILIIL(CommerceToolsTcmModel commerceToolsTcmModel);

    void LJIILJJIL(ViewStub viewStub, boolean z, boolean z2);

    boolean LJIILL();

    void LJIILLIIL(CommerceToolsTcmModel commerceToolsTcmModel, C41457GOv c41457GOv);

    boolean LJIIZILJ();

    boolean LJIJ();

    void LJIJI(BCPageModel bCPageModel);

    void clear();

    boolean isTcm();
}
