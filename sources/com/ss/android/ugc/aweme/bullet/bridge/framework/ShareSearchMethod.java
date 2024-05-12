package com.ss.android.ugc.aweme.bullet.bridge.framework;

import X.C03880Dg;
import X.C27740Aue;
import X.C44498HdG;
import X.C4LD;
import X.C62374Odu;
import X.C62387Oe7;
import X.C62394OeE;
import X.C65300Pk0;
import X.C78609UtB;
import X.C78765Uvh;
import X.DialogC62475OfX;
import X.EnumC38014Evy;
import X.F3T;
import X.InterfaceC37146Ehy;
import X.InterfaceC40516FvE;
import X.InterfaceC62225ObV;
import X.NUX;
import X.OQA;
import X.OQC;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.share.improve.channel.CopyLinkChannel;
import com.ss.android.ugc.aweme.share.improve.pkg.SearchSharePackage;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class ShareSearchMethod extends BaseBridgeMethod {
    public final String LJLIL;
    public EnumC38014Evy LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.AbstractC37121EhZ, X.InterfaceC38217EzF
    public final EnumC38014Evy getAccess() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareSearchMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "shareSearch";
        this.LJLILLLLZI = EnumC38014Evy.PRIVATE;
    }

    @Override // X.AbstractC37121EhZ
    public final void setAccess(EnumC38014Evy enumC38014Evy) {
        o.LJIIIZ(enumC38014Evy, "<set-?>");
        this.LJLILLLLZI = enumC38014Evy;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        Activity LIZ;
        DialogC62475OfX LJI;
        NUX nux;
        WebView view;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        JSONObject jSONObject = new JSONObject();
        int i = 1;
        jSONObject.put("code", 1);
        WeakReference weakReference = new WeakReference(getContext());
        InterfaceC40516FvE kitContainerApi = getKitContainerApi();
        if (kitContainerApi != null && (kitContainerApi instanceof NUX) && (nux = (NUX) kitContainerApi) != null && (view = nux.getView()) != null) {
            view.getUrl();
        }
        String title = params.optString("title");
        String description = params.optString("desc");
        String image = params.optString("image");
        String url = params.optString("url");
        String schema = params.optString("schema");
        String trackInfo = params.optString("track_info");
        o.LJIIIIZZ(title, "title");
        o.LJIIIIZZ(description, "description");
        o.LJIIIIZZ(image, "image");
        o.LJIIIIZZ(url, "url");
        o.LJIIIIZZ(schema, "schema");
        o.LJIIIIZZ(trackInfo, "trackInfo");
        Context context = (Context) weakReference.get();
        boolean z = false;
        if (context != null && (LIZ = C27740Aue.LIZ(context)) != null) {
            SearchSharePackage.Companion.getClass();
            C62374Odu c62374Odu = new C62374Odu();
            c62374Odu.LIZ = "search";
            c62374Odu.LIZIZ = "search";
            c62374Odu.LJ(title);
            c62374Odu.LJ = description;
            String LJJI = C78609UtB.LJJI(C78609UtB.LJJ(url));
            if (LJJI == null) {
                LJJI = "";
            }
            c62374Odu.LJFF = LJJI;
            SearchSharePackage searchSharePackage = new SearchSharePackage(c62374Odu);
            Bundle bundle = searchSharePackage.extras;
            bundle.putString("app_name", LIZ.getString(R.string.bri));
            bundle.putString("thumb_url", image);
            bundle.putString("schema", schema);
            bundle.putString("track_info", trackInfo);
            C78765Uvh.LJIILLIIL(image);
            OQC oqc = new OQC(trackInfo);
            C62394OeE c62394OeE = new C62394OeE();
            ShareDependService.LIZ.getClass();
            InterfaceC62225ObV LIZ2 = OQA.LIZ(C44498HdG.LIZ(), searchSharePackage, "share_search", 4);
            if (LIZ2 != null) {
                c62394OeE.LIZIZ(LIZ2);
            }
            ShareService shareService = C4LD.LIZ;
            o.LJIIIIZZ(shareService, "shareService()");
            shareService.LJJJJ(c62394OeE, LIZ, true);
            c62394OeE.LIZIZ(new CopyLinkChannel(false));
            c62394OeE.LJIIZILJ = searchSharePackage;
            c62394OeE.LJJ = oqc;
            if (C4LD.LIZIZ.LJJL()) {
                OQA.LIZLLL(C44498HdG.LIZ(), LIZ, new C62387Oe7(c62394OeE), null, null, false, 28);
            } else {
                LJI = C44498HdG.LIZ().LJI(LIZ, new C62387Oe7(c62394OeE), R.style.a6u);
                if (!new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/sharer/ui/SkeletonShareDialog", "show", LJI, new Object[0], "void", new C65300Pk0(false, "()V", "3271349350961117504")).LIZ) {
                    LJI.show();
                }
            }
            z = true;
        }
        if (!jSONObject.has("tricky_flag")) {
            if (!z) {
                i = -1;
            }
            jSONObject.put("code", i);
            iReturn.LIZIZ(jSONObject);
        }
    }
}
