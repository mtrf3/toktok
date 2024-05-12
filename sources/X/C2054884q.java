package X;

import android.content.Context;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.qna.services.QnaService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.84q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2054884q extends AbstractC65781Prl implements InterfaceC88472Yns<AnonymousClass850, AnonymousClass850> {
    public final /* synthetic */ Aweme LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;
    public final /* synthetic */ float LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2054884q(Aweme aweme, int i, Context context, float f, String str) {
        super(1);
        this.LJLIL = aweme;
        this.LJLILLLLZI = i;
        this.LJLJI = context;
        this.LJLJJI = f;
        this.LJLJJL = str;
    }

    @Override // X.InterfaceC88472Yns
    public final AnonymousClass850 invoke(AnonymousClass850 anonymousClass850) {
        boolean z;
        int i;
        String str;
        boolean z2;
        AnonymousClass850 it = anonymousClass850;
        o.LJIIIZ(it, "it");
        if (it.LIZJ == AnonymousClass853.HASHTAG) {
            List<Object> list = it.LIZIZ;
            int i2 = this.LJLILLLLZI;
            for (Object obj : list) {
                if (obj instanceof C2055484w) {
                    ((C2055484w) obj).LJLIL = i2;
                }
            }
            Object obj2 = it.LIZLLL;
            if (obj2 instanceof TextExtraStruct) {
                o.LJII(obj2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.model.TextExtraStruct");
                TextExtraStruct textExtraStruct = (TextExtraStruct) obj2;
                String str2 = it.LIZ;
                if (str2.length() == 0 || ((textExtraStruct.getType() != 0 || ((TextUtils.isEmpty(textExtraStruct.getAwemeId()) && 2 != textExtraStruct.getSubtype() && ((5 != textExtraStruct.getSubtype() && 7 != textExtraStruct.getSubtype()) || !QnaService.LIZ().enablePublicQna())) || str2.charAt(0) != '@')) && !C42053Gev.LIZIZ.LIZ.LJFF(textExtraStruct))) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    List<Object> list2 = it.LIZIZ;
                    Context context = this.LJLJI;
                    float f = this.LJLJJI;
                    String str3 = this.LJLJJL;
                    Aweme aweme = this.LJLIL;
                    list2.clear();
                    list2.add(new C2055484w(0.0f, 0, textExtraStruct));
                    if (aweme != null && aweme.isAd()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    list2.add(C2054984r.LIZLLL(context, f, textExtraStruct, str3, z2));
                }
                if (textExtraStruct.getType() == 1 && textExtraStruct.getSubtype() == 15) {
                    List<Object> list3 = it.LIZIZ;
                    Context context2 = this.LJLJI;
                    list3.clear();
                    list3.add(new C2055484w(0.0f, 0, textExtraStruct));
                    Integer LJI = C79045V0n.LJI(R.attr.dm, context2);
                    if (LJI != null) {
                        i = LJI.intValue();
                    } else {
                        i = -1;
                    }
                    list3.add(new ForegroundColorSpan(i));
                    Aweme aweme2 = this.LJLIL;
                    if (aweme2 == null || (str = aweme2.getAid()) == null) {
                        str = "";
                    }
                    C187847Yu.LIZ(textExtraStruct, str);
                }
            }
        }
        return it;
    }
}
