package com.ss.android.ugc.aweme.vision;

import X.C16880lQ;
import X.C32151Nz;
import X.C34088DZk;
import X.C47135Ieh;
import X.C48658J7u;
import X.C51464KHs;
import X.C58096Mr6;
import X.C61184Nzo;
import X.C76800UCe;
import X.C78857UxB;
import X.C7MY;
import X.InterfaceC65784Pro;
import X.K65;
import X.K7K;
import X.K9Y;
import X.KHJ;
import X.KHN;
import X.KHQ;
import X.KHW;
import X.O6R;
import X.WM7;
import Y.ACListenerS34S0300000_8;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IDLCallbackS0S0300000_7;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS54S0400000_8;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class EComPhotoSearchServiceImpl implements IPhotoSearchService {
    public static final /* synthetic */ int LJFF = 0;
    public KHQ LIZ;
    public String LIZIZ;
    public String LIZJ;
    public long LIZLLL;
    public final KHJ LJ = new KHJ(this);

    public static IPhotoSearchService LJFF() {
        Object LIZ = C58096Mr6.LIZ(IPhotoSearchService.class, false);
        if (LIZ != null) {
            return (IPhotoSearchService) LIZ;
        }
        return new EComPhotoSearchServiceImpl();
    }

    @Override // com.ss.android.ugc.aweme.vision.IPhotoSearchService
    public final View LIZ(Context context) {
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.ap7, C16880lQ.LLZIL(context), null);
        o.LJIIIIZZ(LLLZIIL, "from(context)\n          …earch_similar_view, null)");
        return LLLZIIL;
    }

    @Override // com.ss.android.ugc.aweme.vision.IPhotoSearchService
    public final View LIZIZ(View view) {
        return view.findViewById(R.id.hoi);
    }

    @Override // com.ss.android.ugc.aweme.vision.IPhotoSearchService
    public final void LIZLLL(Context context, Intent intent) {
        o.LJIIIZ(context, "context");
        LJI(context, new K9Y(intent));
    }

    @Override // com.ss.android.ugc.aweme.vision.IPhotoSearchService
    public final void LJ(Context context, PhotoSearchEnterParams photoSearchEnterParams) {
        o.LJIIIZ(context, "context");
        Bundle bundle = new Bundle();
        bundle.putSerializable("photo_search_enter_param", photoSearchEnterParams);
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//search/photo_result");
        buildRoute.withParam(bundle);
        buildRoute.open();
    }

    public final void LJI(Context context, KHW khw) {
        String str;
        String str2;
        int i;
        PhotoSearchBusinessEnterParams LIZ;
        o.LJIIIZ(context, "context");
        String str3 = null;
        if (khw != null && (LIZ = khw.LIZ()) != null) {
            str = LIZ.getEnterFrom();
        } else {
            str = null;
        }
        KHQ khq = new KHQ(khw, str);
        this.LIZ = khq;
        PhotoSearchLogEnterParams LIZIZ = khq.LIZIZ();
        if (LIZIZ != null) {
            str2 = LIZIZ.getCurrentPage();
        } else {
            str2 = null;
        }
        this.LIZIZ = str2;
        if (LIZIZ != null) {
            str3 = LIZIZ.getSearchType();
        }
        this.LIZJ = str3;
        JSONObject LJ = C47135Ieh.LJ("step", "click_entrance", WM7.SCENE_SERVICE, "schema");
        LJ.put("search_entrance", "mall");
        LJ.put("source_page_name", this.LIZIZ);
        LJ.put("search_type", this.LIZJ);
        if (C61184Nzo.LIZ(context) == 0) {
            i = 1;
        } else {
            i = 0;
        }
        LJ.put("camera_authorized", i);
        C48658J7u.LIZIZ("rd_tiktokec_photo_search_trace", LJ);
        this.LIZLLL = System.currentTimeMillis();
        AVExternalServiceImpl.LIZ().asyncService("photo_search", new IDLCallbackS0S0300000_7(this, context, LIZIZ, 3));
    }

    @Override // com.ss.android.ugc.aweme.vision.IPhotoSearchService
    public final View LIZJ(Context context, int i, K7K photoSearchSource, ViewGroup viewGroup, KHW khw, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(photoSearchSource, "photoSearchSource");
        K65.LIZ.getClass();
        if (!K65.LIZ()) {
            return null;
        }
        if (photoSearchSource == K7K.MALL) {
            C78857UxB.LJJJJZ("homepage", "");
            TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
            tuxIconView.setPadding(C7MY.LIZIZ(2), C7MY.LIZIZ(2), C7MY.LIZIZ(2), O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)));
            tuxIconView.setIconRes(R.raw.icon_camera);
            tuxIconView.setTintColorRes(R.attr.gu);
            C16880lQ.LJJJ(tuxIconView, new ACListenerS34S0300000_8(this, context, khw, 1));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C7MY.LIZIZ(24), C7MY.LIZIZ(24));
            layoutParams.gravity = 16;
            if (K65.LIZIZ() && i >= 0 && viewGroup != null) {
                viewGroup.addView(tuxIconView, i, layoutParams);
            }
            return tuxIconView;
        }
        View view = C16880lQ.LLLZIIL(R.layout.aop, C16880lQ.LLZIL(context), null);
        if (((Boolean) C34088DZk.LIZ.getValue()).booleanValue()) {
            o.LJIIIIZZ(view, "view");
            view.setOnTouchListener(new C51464KHs(new AqS54S0400000_8((InterfaceC65784Pro) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) this, (EComPhotoSearchServiceImpl) context, (Context) khw, (KHW) 1)));
        } else if (view != null) {
            C16880lQ.LJIIJ(new KHN(interfaceC65784Pro, this, context, khw), view);
        }
        return view;
    }
}
