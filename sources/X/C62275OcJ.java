package X;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.channel.CopyLinkChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS176S0100000_10;

/* renamed from: X.OcJ */
/* loaded from: classes11.dex */
public final class C62275OcJ {
    public static List LIZIZ() {
        return (List) C45343Hqt.LIZ.getValue();
    }

    public static List LJ(Activity activity) {
        C62297Ocf c62297Ocf = new C62297Ocf(new C62279OcN(activity), C62113OZh.LJLIL);
        ArrayList arrayList = new ArrayList();
        LIZ("snapchat", c62297Ocf, arrayList);
        LIZ("instagram", c62297Ocf, arrayList);
        LIZ("instagram_story", c62297Ocf, arrayList);
        LIZ("whatsapp_status", c62297Ocf, arrayList);
        LIZ("zalo", c62297Ocf, arrayList);
        LIZ("kakaotalk", c62297Ocf, arrayList);
        if (activity != null && C224878s7.LIZ(activity, "com.facebook.katana")) {
            LIZ("facebook", c62297Ocf, arrayList);
        }
        LIZ("facebook_lite", c62297Ocf, arrayList);
        LIZ("facebook_group", c62297Ocf, arrayList);
        LIZ("messenger", c62297Ocf, arrayList);
        LIZ("messenger_lite", c62297Ocf, arrayList);
        LIZ("sms", c62297Ocf, arrayList);
        LIZ("twitter", c62297Ocf, arrayList);
        LIZ("viber", c62297Ocf, arrayList);
        LIZ("vk", c62297Ocf, arrayList);
        LIZ("whatsapp", c62297Ocf, arrayList);
        LIZ("line", c62297Ocf, arrayList);
        LIZ("email", c62297Ocf, arrayList);
        LIZ("imgur", c62297Ocf, arrayList);
        LIZ("kakao_story", c62297Ocf, arrayList);
        LIZ("more", c62297Ocf, arrayList);
        return arrayList;
    }

    public static void LIZ(String str, C62297Ocf c62297Ocf, List list) {
        if (TextUtils.equals(str, "copy")) {
            ((ArrayList) list).add(new CopyLinkChannel(false));
        } else {
            InterfaceC62225ObV LIZIZ = C62324Od6.LIZIZ(str, c62297Ocf);
            if (LIZIZ == null) {
                return;
            }
            ((ArrayList) list).add(LIZIZ);
        }
    }

    public static void LIZJ(C62394OeE c62394OeE, boolean z, Activity activity, boolean z2, boolean z3) {
        boolean z4;
        String str;
        Bundle bundle;
        C62278OcM c62278OcM = new C62278OcM(activity);
        ArrayList<String> arrayList = C62423Oeh.LIZIZ;
        C62297Ocf c62297Ocf = new C62297Ocf(c62278OcM, C62145OaD.LJLIL);
        if (z2) {
            C62324Od6.LIZ("snapchat", c62297Ocf, c62394OeE);
            C62324Od6.LIZ("instagram", c62297Ocf, c62394OeE);
            C62324Od6.LIZ("instagram_story", c62297Ocf, c62394OeE);
            C62324Od6.LIZ("whatsapp_status", c62297Ocf, c62394OeE);
            C62324Od6.LIZ("facebook", c62297Ocf, c62394OeE);
            C62324Od6.LIZ("facebook_lite", c62297Ocf, c62394OeE);
            C62324Od6.LIZ("facebook_group", c62297Ocf, c62394OeE);
            C62324Od6.LIZ("messenger", c62297Ocf, c62394OeE);
            C62324Od6.LIZ("messenger_lite", c62297Ocf, c62394OeE);
            C62324Od6.LIZ("sms", c62297Ocf, c62394OeE);
            C62324Od6.LIZ("twitter", c62297Ocf, c62394OeE);
            C62324Od6.LIZ("viber", c62297Ocf, c62394OeE);
            C62324Od6.LIZ("vk", c62297Ocf, c62394OeE);
            C62324Od6.LIZ("whatsapp", c62297Ocf, c62394OeE);
            C62324Od6.LIZ("line", c62297Ocf, c62394OeE);
            C62324Od6.LIZ("band", c62297Ocf, c62394OeE);
            C62324Od6.LIZ("email", c62297Ocf, c62394OeE);
            C62324Od6.LIZ("imgur", c62297Ocf, c62394OeE);
            C62324Od6.LIZ("kakao_story", c62297Ocf, c62394OeE);
            C62324Od6.LIZ("kakaotalk", c62297Ocf, c62394OeE);
            C62324Od6.LIZ("zalo", c62297Ocf, c62394OeE);
            C62324Od6.LIZ("telegram", c62297Ocf, c62394OeE);
            C62324Od6.LIZ("reddit", c62297Ocf, c62394OeE);
            C62324Od6.LIZ("discord", c62297Ocf, c62394OeE);
            List list = (List) HME.LIZJ.getValue();
            if (list != null && !list.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(C32I.LJJL(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Boolean.valueOf(C62324Od6.LIZ((String) it.next(), c62297Ocf, c62394OeE)));
                }
            }
        }
        c62394OeE.LJIJ = true;
        c62394OeE.LJIILIIL = R.string.r5i;
        c62394OeE.LJIILLIIL = R.string.cg_;
        c62394OeE.LJI = true;
        c62394OeE.LIZ(new C62442Of0());
        BaseSharePackage baseSharePackage = c62394OeE.LJIIZILJ;
        if (baseSharePackage != null && (bundle = baseSharePackage.extras) != null) {
            z4 = bundle.getBoolean("is_async_sort");
        } else {
            z4 = false;
        }
        BaseSharePackage baseSharePackage2 = c62394OeE.LJIIZILJ;
        if (baseSharePackage2 == null || (str = baseSharePackage2.itemType) == null) {
            str = "";
        }
        c62394OeE.LJFF(new C62355Odb(str, false, z4));
        c62394OeE.LJIIJJI = new AqS176S0100000_10((ArrayList) arrayList, (ArrayList<String>) 216);
        if (z) {
            c62394OeE.LIZLLL("instagram");
            c62394OeE.LIZLLL("instagram_story");
            c62394OeE.LIZLLL("snapchat");
            c62394OeE.LIZLLL("whatsapp_status");
        }
        if (z3) {
            c62394OeE.LIZLLL("copy");
            c62394OeE.LIZLLL("instagram_dm");
            c62394OeE.LIZLLL("snapchat_chats");
        }
        if (z2) {
            if (!z) {
                c62394OeE.LIZIZ(new CopyLinkChannel(false));
            }
            C62324Od6.LIZ("more", c62297Ocf, c62394OeE);
        }
    }

    public static /* synthetic */ void LIZLLL(C62394OeE c62394OeE, boolean z, Activity activity, boolean z2, int i) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            activity = C84763XOl.LJIIIIZZ();
        }
        if ((i & 8) != 0) {
            z2 = true;
        }
        LIZJ(c62394OeE, z, activity, z2, false);
    }
}
