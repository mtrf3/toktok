package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BTK extends BTV<C28826BTa> {
    public static final BTK LIZIZ = new BTK();

    @Override // X.BTV
    public final List<String> LIZLLL() {
        return C47261Igj.LJJIJ("webcast_subscribe");
    }

    @Override // X.BTZ
    public final boolean LIZJ(Context context, C28826BTa c28826BTa, java.util.Map<String, String> map) {
        FragmentManager supportFragmentManager;
        o.LJIIIZ(context, "context");
        android.net.Uri uri = c28826BTa.LIZ;
        if (uri == null) {
            return false;
        }
        String path = uri.getPath();
        if (path != null) {
            String str = "";
            switch (path.hashCode()) {
                case -1911349934:
                    if (path.equals("/settings")) {
                        Bundle bundle = new Bundle();
                        Iterator LIZ = C47117IeP.LIZ(uri, "uri.queryParameterNames");
                        while (LIZ.hasNext()) {
                            String str2 = (String) LIZ.next();
                            bundle.putString(str2, UriProtector.getQueryParameter(uri, str2));
                        }
                        if (map != null) {
                            for (Map.Entry<String, String> entry : map.entrySet()) {
                                bundle.putString(entry.getKey(), entry.getValue());
                            }
                        }
                        bundle.putString("fragment_type", "subscribe");
                        bundle.putString("origin_uri", uri.toString());
                        ((IHostAction) CN1.LIZ(IHostAction.class)).handleSchema(context, "aweme://live/container", bundle);
                        break;
                    }
                    break;
                case -1566158331:
                    if (path.equals("/spotlight")) {
                        Bundle bundle2 = new Bundle();
                        Iterator LIZ2 = C47117IeP.LIZ(uri, "uri.queryParameterNames");
                        while (LIZ2.hasNext()) {
                            String str3 = (String) LIZ2.next();
                            bundle2.putString(str3, UriProtector.getQueryParameter(uri, str3));
                        }
                        if (map != null) {
                            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                                bundle2.putString(entry2.getKey(), entry2.getValue());
                            }
                        }
                        bundle2.putString("fragment_type", "spotlight");
                        bundle2.putString("origin_uri", uri.toString());
                        bundle2.putString("enter_from", "notification");
                        ((IHostAction) CN1.LIZ(IHostAction.class)).handleSchema(context, "aweme://live/container", bundle2);
                        break;
                    }
                    break;
                case -929949763:
                    if (path.equals("/sub_only_videos")) {
                        if (uri.getBooleanQueryParameter("is_full_screen", true)) {
                            Bundle bundle3 = new Bundle();
                            Iterator LIZ3 = C47117IeP.LIZ(uri, "uri.queryParameterNames");
                            while (LIZ3.hasNext()) {
                                String str4 = (String) LIZ3.next();
                                bundle3.putString(str4, UriProtector.getQueryParameter(uri, str4));
                            }
                            if (map != null) {
                                for (Map.Entry<String, String> entry3 : map.entrySet()) {
                                    bundle3.putString(entry3.getKey(), entry3.getValue());
                                }
                            }
                            bundle3.putString("fragment_type", "sub_only_video_list");
                            ((IHostAction) CN1.LIZ(IHostAction.class)).handleSchema(context, "aweme://live/container", bundle3);
                            break;
                        } else {
                            C73943T0h LIZ4 = C73943T0h.LIZ();
                            EnumC28543BId enumC28543BId = EnumC28543BId.SUB_ONLY_VIDEO_POPUP;
                            EnumC28545BIf enumC28545BIf = EnumC28545BIf.OPEN;
                            String queryParameter = UriProtector.getQueryParameter(uri, "enter_from");
                            if (queryParameter != null) {
                                str = queryParameter;
                            }
                            LIZ4.LIZIZ(new C28546BIg(enumC28543BId, enumC28545BIf, str, 8));
                            break;
                        }
                    }
                    break;
                case 87043404:
                    if (path.equals("/privilege_page")) {
                        boolean LJ = o.LJ(UriProtector.getQueryParameter(uri, "is_anchor"), "1");
                        String queryParameter2 = UriProtector.getQueryParameter(uri, "page_type");
                        if (queryParameter2 == null) {
                            queryParameter2 = "";
                        }
                        String queryParameter3 = UriProtector.getQueryParameter(uri, "show_entrance");
                        if (queryParameter3 == null) {
                            queryParameter3 = "";
                        }
                        String queryParameter4 = UriProtector.getQueryParameter(uri, "sec_anchor_id");
                        if (queryParameter4 != null) {
                            str = queryParameter4;
                        }
                        ((ISubscribeService) CN1.LIZ(ISubscribeService.class)).Ze(context, LJ, queryParameter2, queryParameter3, str);
                        break;
                    }
                    break;
                case 1151966649:
                    if (path.equals("/send_gift_sub")) {
                        String queryParameter5 = UriProtector.getQueryParameter(uri, "show_entrance");
                        if (queryParameter5 == null) {
                            queryParameter5 = "";
                        }
                        String queryParameter6 = UriProtector.getQueryParameter(uri, "user_type");
                        if (queryParameter6 == null) {
                            queryParameter6 = "";
                        }
                        String queryParameter7 = UriProtector.getQueryParameter(uri, "subscribe_state");
                        if (queryParameter7 == null) {
                            queryParameter7 = "";
                        }
                        String queryParameter8 = UriProtector.getQueryParameter(uri, "anchor_id");
                        if (queryParameter8 == null) {
                            queryParameter8 = "";
                        }
                        String queryParameter9 = UriProtector.getQueryParameter(uri, "for_anchor_id");
                        if (queryParameter9 == null) {
                            queryParameter9 = "";
                        }
                        boolean z = !o.LJ(UriProtector.getQueryParameter(uri, "is_in_live_room"), CardStruct.IStatusCode.DEFAULT);
                        ActivityC45651qj LIZIZ2 = C29306Beo.LIZIZ(context);
                        if (LIZIZ2 != null && (supportFragmentManager = LIZIZ2.getSupportFragmentManager()) != null) {
                            ISubscribeService iSubscribeService = (ISubscribeService) CN1.LIZ(ISubscribeService.class);
                            String queryParameter10 = UriProtector.getQueryParameter(uri, "to_user_id");
                            if (queryParameter10 == null) {
                                queryParameter10 = "";
                            }
                            String queryParameter11 = UriProtector.getQueryParameter(uri, "room_id");
                            if (queryParameter11 != null) {
                                str = queryParameter11;
                            }
                            iSubscribeService.Re(supportFragmentManager, queryParameter10, str, z, new BTL(queryParameter5, queryParameter6, queryParameter7, queryParameter8, queryParameter9, z));
                            break;
                        }
                    }
                    break;
            }
        }
        return true;
    }
}
