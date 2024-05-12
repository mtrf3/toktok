package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.actionbar;

import X.C1046648w;
import X.C212428Vi;
import X.C2K0;
import X.C47261Igj;
import X.C47704Ins;
import X.C55096Ljo;
import X.C55749LuL;
import X.C62814Ol0;
import X.C89333ez;
import X.InterfaceC1032343j;
import X.InterfaceC36571c5;
import X.InterfaceC55102Lju;
import X.InterfaceC55235Lm3;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.ui.ActionBarComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.common.ChatBackgroundColorProtocol;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ActionBarWrapperAssem extends UIContentAssem implements ActionBarAbility, ChatBackgroundColorProtocol, InterfaceC55102Lju {
    public ActionBarComponent LJLIL;
    public final C55749LuL LJLILLLLZI;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -1244493789) {
            return null;
        }
        return this;
    }

    public ActionBarWrapperAssem() {
        new LinkedHashMap();
        this.LJLILLLLZI = new C55749LuL(C47704Ins.LIZJ(this, C89333ez.class, null), checkSupervisorPrepared());
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.common.ChatBackgroundColorProtocol
    public final void LLIL() {
        InterfaceC1032343j interfaceC1032343j;
        C1046648w actionBarDisplayManager;
        ValueAnimator valueAnimator;
        InterfaceC36571c5 LIZLLL = C212428Vi.LIZLLL(this);
        if ((LIZLLL instanceof InterfaceC1032343j) && (interfaceC1032343j = (InterfaceC1032343j) LIZLLL) != null && (actionBarDisplayManager = interfaceC1032343j.getActionBarDisplayManager()) != null && (valueAnimator = (ValueAnimator) actionBarDisplayManager.LJII.getValue()) != null) {
            valueAnimator.start();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.common.ChatBackgroundColorProtocol
    public final void LLLLLLZZ() {
        InterfaceC1032343j interfaceC1032343j;
        C1046648w actionBarDisplayManager;
        Integer num;
        InterfaceC36571c5 LIZLLL = C212428Vi.LIZLLL(this);
        if ((LIZLLL instanceof InterfaceC1032343j) && (interfaceC1032343j = (InterfaceC1032343j) LIZLLL) != null && (actionBarDisplayManager = interfaceC1032343j.getActionBarDisplayManager()) != null && (num = (Integer) actionBarDisplayManager.LJ.getValue()) != null) {
            int intValue = num.intValue();
            FrameLayout frameLayout = actionBarDisplayManager.LIZ;
            if (frameLayout != null) {
                frameLayout.setBackgroundColor(intValue);
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        ActionBarComponent actionBarComponent = this.LJLIL;
        if (actionBarComponent != null) {
            getLifecycle().removeObserver(actionBarComponent);
        }
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ActionBarComponent actionBarComponent;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            actionBarComponent = new ActionBarComponent(LIZLLL, view, ((C89333ez) this.LJLILLLLZI.getValue()).LJLIL);
        } else {
            actionBarComponent = null;
        }
        this.LJLIL = actionBarComponent;
        if (actionBarComponent != null) {
            getLifecycle().addObserver(actionBarComponent);
        }
        final InterfaceC55235Lm3 LJIIZILJ = C55096Ljo.LJIIZILJ(this);
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, ChatBackgroundColorProtocol.class, C47261Igj.LJJIJIL(this));
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.actionbar.ActionBarWrapperAssem$onViewCreated$$inlined$registerProtocol$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                    o.LJIIIZ(source, "source");
                    o.LJIIIZ(event, "event");
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C62814Ol0.LJJIJL(InterfaceC55235Lm3.this, ChatBackgroundColorProtocol.class, this);
                    }
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.actionbar.ActionBarAbility
    public final void GC(String str, boolean z) {
        InterfaceC1032343j interfaceC1032343j;
        C1046648w actionBarDisplayManager;
        boolean z2;
        InterfaceC36571c5 LIZLLL = C212428Vi.LIZLLL(this);
        if ((LIZLLL instanceof InterfaceC1032343j) && (interfaceC1032343j = (InterfaceC1032343j) LIZLLL) != null && (actionBarDisplayManager = interfaceC1032343j.getActionBarDisplayManager()) != null) {
            ActionBarComponent actionBarComponent = actionBarDisplayManager.LIZJ;
            if (actionBarComponent != null) {
                z2 = actionBarComponent.LIZ();
            } else {
                z2 = true;
            }
            actionBarDisplayManager.LIZ(str, z, z2);
        }
    }
}
