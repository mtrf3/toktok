package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.s;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.WikipediaExtra;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.ATq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26294ATq extends HSS {
    @Override // X.S1E
    public final S1E clone() {
        return new C26294ATq();
    }

    @Override // X.HSS, X.S1E
    public final int type() {
        return EnumC42934Gt8.WIKIPEDIA.getTYPE();
    }

    @Override // X.HSS, X.S1E
    public final void LJ(C188727au eventMapBuilder) {
        String str;
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        String optString = LJJIJLIJ().optString("request_id");
        String str2 = "";
        if (optString == null) {
            optString = "";
        }
        String LIZIZ = C227768wm.LIZIZ(LJJII());
        LogPbBean logPbBean = new LogPbBean();
        logPbBean.setImprId(optString);
        C76W c76w = new C76W();
        c76w.LIZ("log_pb", C3A5.LIZ.LIZ(logPbBean));
        Aweme LJJII = LJJII();
        if (LJJII != null) {
            str = LJJII.getAuthorUid();
        } else {
            str = null;
        }
        c76w.LIZ("author_id", str);
        c76w.LIZ("group_id", LIZIZ);
        c76w.LIZ("impr_type", C227768wm.LJFF(LJJII()));
        String LJJIIZI = LJJIIZI();
        if (LJJIIZI != null) {
            str2 = LJJIIZI;
        }
        c76w.LIZ("enter_from", str2);
        HSS.LJJIFFI(eventMapBuilder, c76w.LIZIZ());
        C211648Si.LIZ(eventMapBuilder, LJJII(), LJJIIZI(), true);
        FMX.LJIIL("multi_anchor_entrance_show", eventMapBuilder.LIZ);
    }

    @Override // X.HSS, X.S1E
    public final EnumC26289ATl LJFF(List<AnchorCommonStruct> list) {
        Integer status;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) list;
        Iterator it = arrayList2.iterator();
        String str = "";
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) next;
            WikipediaExtra wikipediaExtra = null;
            try {
                Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), anchorCommonStruct.getExtra(), C65330PkU.LIZJ(C65352Pkq.LJI(WikipediaExtra.class)));
                if (!(fromJson instanceof WikipediaExtra)) {
                    fromJson = null;
                }
                wikipediaExtra = (WikipediaExtra) fromJson;
            } catch (s unused) {
            }
            if (wikipediaExtra != null) {
                Integer status2 = wikipediaExtra.getStatus();
                if (status2 != null && status2.intValue() == 2 && o.LJ(LJJII().getAuthorUid(), ((RBX) HG3.LJIILL()).getCurUserId()) && !LJJIIJ(anchorCommonStruct.getId())) {
                    LJJJIL(anchorCommonStruct.getId());
                    str = wikipediaExtra.getWarningMsg();
                    z = true;
                }
                if (anchorCommonStruct.getType() == type() && ((status = wikipediaExtra.getStatus()) == null || status.intValue() != 2)) {
                    arrayList.add(next);
                }
            }
        }
        if (z) {
            Aweme LJJII = LJJII();
            if (TextUtils.isEmpty(str)) {
                str = EF7.LIZIZ().getString(R.string.txg);
            }
            LJJII.setAnchorWikiOfflineText(str);
        }
        if (arrayList.size() == 0) {
            return EnumC26289ATl.NOT_FOUND;
        }
        AnchorCommonStruct anchorCommonStruct2 = (AnchorCommonStruct) ListProtector.get(arrayList, 0);
        arrayList2.remove(anchorCommonStruct2);
        LJJIJL(anchorCommonStruct2);
        LJJ(anchorCommonStruct2);
        this.LJLJJL = anchorCommonStruct2;
        if (arrayList.size() == 1) {
            return EnumC26289ATl.DONE;
        }
        return EnumC26289ATl.PROCEED;
    }

    @Override // X.S1E
    public final void LJIIIIZZ(C188727au eventMapBuilder) {
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        LJJJJIZL(new AqS135S0200000_4(this, eventMapBuilder, 153));
    }
}
