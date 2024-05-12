package com.ss.android.ugc.aweme.story.feed.common.newarch.sub.component;

import X.ActivityC45651qj;
import X.C212428Vi;
import X.C221108m2;
import X.C221138m5;
import X.C223008p6;
import X.C55096Ljo;
import X.C62822Ol8;
import X.EnumC223028p8;
import X.InterfaceC222998p5;
import X.InterfaceC55235Lm3;
import X.KR8;
import X.KTY;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.feed.common.newarch.sub.ability.StoryPinchAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryPinchComponent extends BaseCellContentComponent<StoryPinchComponent> implements InterfaceC222998p5, StoryPinchAbility {
    public final C62822Ol8 LL;
    public final C221138m5 LLD;
    public final C221138m5 LLF;
    public final C221138m5 LLFF;

    public StoryPinchComponent() {
        new LinkedHashMap();
        this.LL = C221108m2.LIZIZ(C223008p6.LJLIL);
        this.LLD = KR8.LJIIJJI(new AqS153S0100000_3(this, 939));
        this.LLF = KR8.LJIIJJI(new AqS153S0100000_3(this, 940));
        this.LLFF = KR8.LJIIJJI(new AqS153S0100000_3(this, 938));
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.sub.ability.StoryPinchAbility
    public final KTY JQ() {
        return (KTY) this.LL.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void W3() {
        InterfaceC55235Lm3 interfaceC55235Lm3 = (InterfaceC55235Lm3) this.LLFF.getValue();
        if (interfaceC55235Lm3 != null) {
            C55096Ljo.LJIILL(interfaceC55235Lm3, StoryPinchAbility.class, null);
        }
    }

    public final InterfaceC222998p5 b4() {
        return (InterfaceC222998p5) this.LLF.getValue();
    }

    @Override // X.InterfaceC222998p5
    public final void LLJLIL() {
        InterfaceC222998p5 b4 = b4();
        if (b4 != null) {
            b4.LLJLIL();
        }
    }

    @Override // X.InterfaceC222998p5
    public final void m() {
        InterfaceC222998p5 b4 = b4();
        if (b4 != null) {
            b4.m();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // X.InterfaceC222998p5
    public final void onScaleBegin() {
        InterfaceC222998p5 b4 = b4();
        if (b4 != null) {
            b4.onScaleBegin();
        }
    }

    @Override // X.InterfaceC222998p5
    public final void onScaleEnd() {
        InterfaceC222998p5 b4 = b4();
        if (b4 != null) {
            b4.onScaleEnd();
        }
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
    }

    @Override // X.InterfaceC222998p5
    public final void Y1(float f) {
        InterfaceC222998p5 b4 = b4();
        if (b4 != null) {
            b4.Y1(f);
        }
    }

    @Override // X.InterfaceC222998p5
    public final void onScale(float f) {
        InterfaceC222998p5 b4 = b4();
        if (b4 != null) {
            b4.onScale(f);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        View view2;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        Window window;
        o.LJIIIZ(view, "view");
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null && (window = LIZ.getWindow()) != null) {
            view2 = window.getDecorView();
        } else {
            view2 = null;
        }
        if (!(view2 instanceof ViewGroup) || (viewGroup = (ViewGroup) view2) == null || !(view instanceof ViewGroup) || (viewGroup2 = (ViewGroup) view) == null) {
            return;
        }
        ((KTY) this.LL.getValue()).LIZ(getContext(), viewGroup, viewGroup2, null, this, EnumC223028p8.IMAGE);
        InterfaceC55235Lm3 interfaceC55235Lm3 = (InterfaceC55235Lm3) this.LLFF.getValue();
        if (interfaceC55235Lm3 != null) {
            C55096Ljo.LJIIJJI(interfaceC55235Lm3, this, StoryPinchAbility.class, null);
        }
    }
}
