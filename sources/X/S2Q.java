package X;

import android.content.Context;
import android.util.AttributeSet;
import com.ss.android.ugc.aweme.ecommercelive.business.common.data.AtmosphereTag;
import com.ss.android.ugc.aweme.ecommercelive.common.popcard.vo.PopupCardVO;
import defpackage.a1;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes13.dex */
public abstract class S2Q extends AbstractC71212RxA {
    public boolean LJLJJI;
    public final java.util.Map<String, String> LJLJJL;
    public PopupCardVO LJLJJLL;

    @Override // X.AbstractC71212RxA
    public abstract /* synthetic */ void setAtmosphereTags(List<AtmosphereTag> list);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S2Q(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LJLJJL = new LinkedHashMap();
    }
}
