package X;

import android.content.Context;
import android.util.AttributeSet;
import com.ss.android.ugc.aweme.ecommercelive.business.common.data.AtmosphereTag;
import com.ss.android.ugc.aweme.ecommercelive.common.popcard.vo.PopupCardVO;
import defpackage.a1;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.RyH, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC71281RyH extends AbstractC71212RxA {
    public final java.util.Map<String, String> LJLJJI;
    public PopupCardVO LJLJJL;

    @Override // X.AbstractC71212RxA
    public abstract /* synthetic */ void setAtmosphereTags(List<AtmosphereTag> list);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC71281RyH(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LJLJJI = new LinkedHashMap();
    }
}
