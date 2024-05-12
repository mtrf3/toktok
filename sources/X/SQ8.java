package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PrivateUrlModel;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SQ8 extends SQ9 {
    public static final Type LJLJJL = new C69884Rbk().getType();
    public static final Type LJLJJLL = new C69885Rbl().getType();

    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        o.LJIIIZ(type, "type");
        IAwemeService LIZ = AwemeService.LIZ();
        for (SQA sqa : ((SQB) xBaseParamModel).getChangeset()) {
            Aweme i6 = LIZ.i6(sqa.getAwemeId());
            if (i6 != null) {
                SQC privateStatus = sqa.getPrivateStatus();
                if (privateStatus != null) {
                    Number to = privateStatus.getTo();
                    if (to != null) {
                        int intValue = to.intValue();
                        if (intValue != 0 && i6.playlist_info != null) {
                            i6.playlist_info = null;
                        }
                        i6.getStatus().setPrivateStatus(intValue);
                        i6.setSubOnlyVideo(false);
                        try {
                            Number from = privateStatus.getFrom();
                            if (from != null) {
                                from.intValue();
                                OSJ osj = new OSJ(sqa.getHybridLabel(), sqa.getLabelPrivate(), sqa.getVideoText());
                                String str = (String) osj.getFirst();
                                String str2 = (String) osj.getSecond();
                                String str3 = (String) osj.getThird();
                                PrivateUrlModel privateUrlModel = new PrivateUrlModel();
                                privateUrlModel.labelPrivate = (UrlModel) GsonProtectorUtils.fromJson(C79146V4k.LJJIIZ(), str2, UrlModel.class);
                                privateUrlModel.hybridLabels = (List) C79146V4k.LJJIIZ().LJII(str, LJLJJL);
                                privateUrlModel.textVideoLabels = (List) C79146V4k.LJJIIZ().LJII(str3, LJLJJLL);
                                C2U8.LIZ(new C187227Wk(i6, privateUrlModel));
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
                LIZ.R1(i6);
            }
        }
        c37356ElM.onSuccess((XBaseResultModel) ED5.LIZJ(SQD.class, null), "");
    }
}
