package Y;

import X.C6ZS;
import X.E3X;
import X.H9C;
import X.HJ9;
import X.InterfaceC42232Gho;
import X.InterfaceC43690HCs;
import X.ORZ;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.commercialize.mission.CommerceMissionServiceImpl;
import com.ss.android.ugc.aweme.discover.model.HTCMissionModule;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class ACListenerS30S0400000_7 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS30S0400000_7 aCListenerS30S0400000_7, View view) {
        String str;
        InterfaceC43690HCs interfaceC43690HCs = (InterfaceC43690HCs) aCListenerS30S0400000_7.l0;
        CommerceMissionServiceImpl commerceMissionServiceImpl = (CommerceMissionServiceImpl) aCListenerS30S0400000_7.l1;
        HTCMissionModule hTCMissionModule = (HTCMissionModule) aCListenerS30S0400000_7.l2;
        commerceMissionServiceImpl.getClass();
        if (hTCMissionModule != null && (str = hTCMissionModule.getOpenUrl()) != null) {
            String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(str), "url");
            if (queryParameter != null) {
                Uri.Builder buildUpon = UriProtector.parse(queryParameter).buildUpon();
                buildUpon.appendQueryParameter("begin_open_timestamp", String.valueOf(System.currentTimeMillis()));
                Uri build = buildUpon.build();
                Uri parse = UriProtector.parse(str);
                o.LJIIIIZZ(parse, "parse(openUrl)");
                String uri = build.toString();
                o.LJIIIIZZ(uri, "newInnerUrl.toString()");
                Uri.Builder buildUpon2 = parse.buildUpon();
                buildUpon2.clearQuery();
                Set<String> queryParameterNames = UriProtector.getQueryParameterNames(parse);
                o.LJIIIIZZ(queryParameterNames, "queryParameterNames");
                for (String str2 : ORZ.LLIILII(queryParameterNames)) {
                    if (!o.LJ(str2, "url")) {
                        buildUpon2.appendQueryParameter(str2, UriProtector.getQueryParameter(parse, str2));
                    }
                }
                buildUpon2.appendQueryParameter("url", uri);
                Uri build2 = buildUpon2.build();
                o.LJIIIIZZ(build2, "with(buildUpon()) {\n    …        build()\n        }");
                str = build2.toString();
                o.LJIIIIZZ(str, "parse(openUrl).addOrRepl…rl.toString()).toString()");
            }
        } else {
            str = null;
        }
        interfaceC43690HCs.LIZ(str);
        if (((HTCMissionModule) aCListenerS30S0400000_7.l2) != null) {
            H9C h9c = new H9C();
            HTCMissionModule htcMissionModule = (HTCMissionModule) aCListenerS30S0400000_7.l2;
            E3X currentPage = (E3X) aCListenerS30S0400000_7.l3;
            o.LJIIIZ(htcMissionModule, "htcMissionModule");
            o.LJIIIZ(currentPage, "currentPage");
            int i = 0;
            Object[] objArr = {htcMissionModule, currentPage};
            do {
                h9c.LJIIIIZZ(objArr[i]);
                i++;
            } while (i < 2);
            h9c.LJII("mission_label_click", "mission_id", "eligibility", "status", "current_page", "creator_followers", "creator_type", "label_version");
        }
    }

    public static final void onClick$1(ACListenerS30S0400000_7 aCListenerS30S0400000_7, View view) {
        if (C6ZS.LIZ(view)) {
            return;
        }
        InterfaceC42232Gho interfaceC42232Gho = (InterfaceC42232Gho) aCListenerS30S0400000_7.l0;
        if (interfaceC42232Gho != null) {
            interfaceC42232Gho.LJJLIIIJJI();
        }
        Activity activity = (Activity) aCListenerS30S0400000_7.l1;
        Bundle bundle = new Bundle();
        ShortVideoContext shortVideoContext = (ShortVideoContext) aCListenerS30S0400000_7.l2;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aCListenerS30S0400000_7.l3;
        bundle.putInt("key_support_flag", 5);
        bundle.putLong("Key_min_duration", 1000L);
        bundle.putInt("key_photo_select_min_count", 1);
        bundle.putInt("key_photo_select_max_count", 1);
        bundle.putInt("key_video_select_min_count", 1);
        bundle.putInt("key_video_select_max_count", 1);
        bundle.putInt("key_choose_scene", 15);
        if (shortVideoContext != null) {
            bundle.putParcelable("key_short_video_context", shortVideoContext);
        }
        if (videoPublishEditModel != null) {
            bundle.putParcelable("key_video_publish_edit_model", videoPublishEditModel);
        }
        bundle.putInt("key_choose_request_code", 1);
        HJ9.LIZLLL(activity, bundle, 1);
    }

    public ACListenerS30S0400000_7(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj4;
        this.l1 = obj;
        this.l2 = obj2;
        this.l3 = obj3;
    }
}
