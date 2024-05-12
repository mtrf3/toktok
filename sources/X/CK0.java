package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CK0 implements InterfaceC29848BnY {
    public static final C5H3<CK0> LIZ = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, CK1.LJLIL);

    public static java.util.Map LJII(String str) {
        if (TextUtils.isEmpty(str)) {
            C36746EbW.LIZ(6, "schema is empty");
            return null;
        }
        android.net.Uri parse = UriProtector.parse(str);
        String queryParameter = UriProtector.getQueryParameter(parse, "room_id");
        if (queryParameter == null) {
            return null;
        }
        int i = 1;
        int i2 = !TextUtils.isEmpty(UriProtector.getQueryParameter(parse, "suggest_pin_id")) ? 1 : 0;
        String queryParameter2 = UriProtector.getQueryParameter(parse, "moderate_author_id");
        String queryParameter3 = UriProtector.getQueryParameter(parse, "remind_type");
        String str2 = "";
        if (queryParameter3 == null) {
            queryParameter3 = "";
        }
        if (TextUtils.isEmpty(queryParameter2)) {
            queryParameter2 = ((RBX) HG3.LJIILL()).getCurUserId();
            i = 0;
        }
        if (queryParameter2 != null) {
            str2 = queryParameter2;
        }
        HashMap LIZ2 = C45243HpH.LIZ("author_id", str2, "EVENT_ORIGIN_FEATURE", "TEMAI");
        C116484hg.LIZIZ(LIZ2, "room_id", queryParameter, i2, "pin_product");
        C116484hg.LIZIZ(LIZ2, "remind_type", queryParameter3, i, "is_moderate");
        return LIZ2;
    }

    @Override // X.InterfaceC29848BnY
    public final void LIZ(C29846BnW capsuleModel) {
        o.LJIIIZ(capsuleModel, "capsuleModel");
    }

    @Override // X.InterfaceC29848BnY
    public final boolean LIZJ(C29846BnW capsuleModel) {
        o.LJIIIZ(capsuleModel, "capsuleModel");
        String str = ((CapsuleMessage) capsuleModel.LJIJJLI).schema;
        if (str == null) {
            str = "";
        }
        java.util.Map LJII = LJII(str);
        if (LJII == null) {
            C36746EbW.LIZ(5, "handleClick but eventParams error");
            return false;
        }
        C48658J7u.LIZ("livesdk_tiktokec_pin_reminder_click", LJII);
        return false;
    }

    @Override // X.InterfaceC29848BnY
    public final void LIZLLL(C29846BnW capsuleModel) {
        o.LJIIIZ(capsuleModel, "capsuleModel");
    }

    @Override // X.InterfaceC29848BnY
    public final void LJ(C29846BnW capsuleModel) {
        o.LJIIIZ(capsuleModel, "capsuleModel");
        String str = ((CapsuleMessage) capsuleModel.LJIJJLI).schema;
        if (str == null) {
            str = "";
        }
        java.util.Map LJII = LJII(str);
        if (LJII == null) {
            C36746EbW.LIZ(5, "onFirstBind but eventParams error");
        } else {
            C48658J7u.LIZ("livesdk_tiktokec_pin_reminder_show", LJII);
        }
    }

    @Override // X.InterfaceC29848BnY
    public final void LIZIZ(C29846BnW capsuleModel, java.util.Map<String, String> map) {
        o.LJIIIZ(capsuleModel, "capsuleModel");
    }

    @Override // X.InterfaceC29848BnY
    public final boolean LJFF(CQQ cqq, CapsuleMessage capsuleMessage) {
        C29837BnN.LIZ(cqq, capsuleMessage);
        return false;
    }

    @Override // X.InterfaceC29848BnY
    public final void LJI(C29846BnW capsuleModel, java.util.Map<String, String> map) {
        o.LJIIIZ(capsuleModel, "capsuleModel");
    }
}
