package com.ss.android.ugc.aweme.story.feed.common.newarch.component;

import X.C211388Ri;
import X.C221138m5;
import X.C222588oQ;
import X.C47245IgT;
import X.C55096Ljo;
import X.InterfaceC222698ob;
import X.InterfaceC47667InH;
import X.InterfaceC55235Lm3;
import X.KR8;
import android.graphics.SurfaceTexture;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.CommonCellAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryPlayerViewComponent extends BaseCellContentComponent<StoryPlayerViewComponent> implements StoryPlayerViewAbility {
    public final C221138m5 LL;
    public final C221138m5 LLD;
    public C47245IgT LLF;
    public final C211388Ri LLFF;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.8Ri] */
    public StoryPlayerViewComponent() {
        new LinkedHashMap();
        this.LL = KR8.LJIIJJI(new AqS153S0100000_3(this, 910));
        this.LLD = KR8.LJIIJJI(new AqS153S0100000_3(this, 911));
        this.LLFF = new InterfaceC47667InH() { // from class: X.8Ri
            @Override // X.InterfaceC47667InH
            public final void LIZ() {
            }

            @Override // X.InterfaceC47667InH
            public final /* synthetic */ void LJJJJ(int i, int i2) {
            }

            @Override // X.InterfaceC47667InH
            public final void LJJL(int i, int i2) {
            }

            @Override // X.InterfaceC47667InH
            public final /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }
        };
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void W3() {
        InterfaceC55235Lm3 interfaceC55235Lm3 = (InterfaceC55235Lm3) this.LL.getValue();
        if (interfaceC55235Lm3 != null) {
            C55096Ljo.LJIILL(interfaceC55235Lm3, StoryPlayerViewAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.component.StoryPlayerViewAbility
    public final InterfaceC222698ob LLJJIJIL() {
        return this.LLF;
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        if (!(view instanceof ViewGroup)) {
            return;
        }
        InterfaceC55235Lm3 interfaceC55235Lm3 = (InterfaceC55235Lm3) this.LL.getValue();
        if (interfaceC55235Lm3 != null) {
            C55096Ljo.LJIIJJI(interfaceC55235Lm3, this, StoryPlayerViewAbility.class, null);
        }
        C222588oQ c222588oQ = a1().LIZLLL;
        if (c222588oQ == null) {
            return;
        }
        C47245IgT c47245IgT = new C47245IgT((ViewGroup) view, this.LLFF, c222588oQ);
        CommonCellAbility commonCellAbility = (CommonCellAbility) this.LLD.getValue();
        if (commonCellAbility != null) {
            commonCellAbility.t70(c47245IgT);
        }
        this.LLF = c47245IgT;
    }
}
