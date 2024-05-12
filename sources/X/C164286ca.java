package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.ugc.effectplatform.model.EffectCategoryModel;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6ca, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C164286ca extends F9E {
    public final EnumC74493TLl LJLIL;
    public final EnumC74495TLn LJLILLLLZI;
    public final List<Effect> LJLJI;
    public final List<ProviderEffect> LJLJJI;
    public final List<InfoStickerEffect> LJLJJL;
    public final int LJLJJLL;
    public final EffectCategoryResponse LJLJL;
    public final Integer LJLJLJ;
    public final TEA LJLJLLL;
    public final String LJLL;
    public final EffectCategoryModel LJLLI;
    public final int LJLLILLLL;
    public final List<OSZ<Effect, Integer>> LJLLJ;
    public final O5L LJLLL;

    public C164286ca() {
        throw null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, Integer.valueOf(this.LJLJJLL), this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, this.LJLLI, Integer.valueOf(this.LJLLILLLL), this.LJLLJ, this.LJLLL};
    }

    public C164286ca(EnumC74493TLl eventType, EnumC74495TLn enumC74495TLn, List list, List list2, List list3, int i, EffectCategoryResponse effectCategoryResponse, Integer num, TEA tea, String str, List list4, O5L o5l, int i2) {
        List list5 = list;
        List list6 = list2;
        List list7 = list3;
        int i3 = i;
        EffectCategoryResponse effectCategoryResponse2 = effectCategoryResponse;
        Integer num2 = num;
        TEA tea2 = tea;
        String str2 = str;
        List list8 = list4;
        O5L o5l2 = o5l;
        EnumC74495TLn enumC74495TLn2 = (i2 & 2) != 0 ? null : enumC74495TLn;
        list5 = (i2 & 4) != 0 ? null : list5;
        list6 = (i2 & 8) != 0 ? null : list6;
        list7 = (i2 & 16) != 0 ? null : list7;
        i3 = (i2 & 32) != 0 ? 0 : i3;
        effectCategoryResponse2 = (i2 & 64) != 0 ? null : effectCategoryResponse2;
        num2 = (i2 & 128) != 0 ? null : num2;
        tea2 = (i2 & 256) != 0 ? null : tea2;
        str2 = (i2 & 512) != 0 ? null : str2;
        list8 = (i2 & 4096) != 0 ? null : list8;
        o5l2 = (i2 & FileUtils.BUFFER_SIZE) != 0 ? null : o5l2;
        o.LJIIIZ(eventType, "eventType");
        this.LJLIL = eventType;
        this.LJLILLLLZI = enumC74495TLn2;
        this.LJLJI = list5;
        this.LJLJJI = list6;
        this.LJLJJL = list7;
        this.LJLJJLL = i3;
        this.LJLJL = effectCategoryResponse2;
        this.LJLJLJ = num2;
        this.LJLJLLL = tea2;
        this.LJLL = str2;
        this.LJLLI = null;
        this.LJLLILLLL = 0;
        this.LJLLJ = list8;
        this.LJLLL = o5l2;
    }
}
