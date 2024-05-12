package com.ss.android.ugc.aweme.profile.widgets.cta.base;

import X.C221108m2;
import X.C252659vp;
import X.C55096Ljo;
import X.C5H3;
import X.C76800UCe;
import X.C9HL;
import X.C9IF;
import X.EnumC234329Ho;
import X.InterfaceC65784Pro;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.icon.TuxIconView;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public abstract class ProfileCTASingleComponent extends UIContentAssem {
    public Map<Integer, View> LJLJI = new LinkedHashMap();
    public final C5H3 LJLIL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 726));
    public final C5H3 LJLILLLLZI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 725));

    public void _$_clearFindViewByIdCache() {
        this.LJLJI.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLJI;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void componentClick() {
    }

    public Integer componentIcon() {
        return null;
    }

    public String componentText() {
        return null;
    }

    public abstract EnumC234329Ho v3();

    public abstract C9IF x3();

    private final View l0() {
        return (View) this.LJLIL.getValue();
    }

    public final TuxIconView C3() {
        return (TuxIconView) this.LJLILLLLZI.getValue();
    }

    private final void E3() {
        ProfileCTAAbility profileCTAAbility = (ProfileCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ProfileCTAAbility.class, null);
        if (profileCTAAbility != null) {
            profileCTAAbility.Lq(x3(), componentIcon(), componentText(), new AqS170S0100000_4(this, 680));
        }
    }

    public final C9HL A3() {
        ProfileCTAAbility profileCTAAbility = (ProfileCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ProfileCTAAbility.class, null);
        if (profileCTAAbility == null) {
            return null;
        }
        return profileCTAAbility.Hb0(x3());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onCreate() {
        super.onCreate();
        E3();
    }

    public final void requestHide() {
        ProfileCTAAbility profileCTAAbility = (ProfileCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ProfileCTAAbility.class, null);
        if (profileCTAAbility != null) {
            profileCTAAbility.Is(x3());
        }
    }

    public final void requestHideAlertBadge() {
        ProfileCTAAbility profileCTAAbility = (ProfileCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ProfileCTAAbility.class, null);
        if (profileCTAAbility != null) {
            profileCTAAbility.PQ(x3());
        }
    }

    public final void F3(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        ProfileCTAAbility profileCTAAbility = (ProfileCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ProfileCTAAbility.class, null);
        if (profileCTAAbility != null) {
            profileCTAAbility.gp0(x3(), interfaceC65784Pro);
        }
    }

    public final void I3(InterfaceC65784Pro<C76800UCe> clickFunc) {
        o.LJIIIZ(clickFunc, "clickFunc");
        ProfileCTAAbility profileCTAAbility = (ProfileCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ProfileCTAAbility.class, null);
        if (profileCTAAbility != null) {
            profileCTAAbility.a90(x3(), clickFunc);
        }
    }

    public final void K3(String str) {
        ProfileCTAAbility profileCTAAbility = (ProfileCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ProfileCTAAbility.class, null);
        if (profileCTAAbility != null) {
            profileCTAAbility.EY(x3(), str);
        }
    }

    public final void updateAccessibilityClassName(CharSequence className) {
        o.LJIIIZ(className, "className");
        ProfileCTAAbility profileCTAAbility = (ProfileCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ProfileCTAAbility.class, null);
        if (profileCTAAbility != null) {
            profileCTAAbility.MQ(x3(), className);
        }
    }

    public final void updateActionList(List<C252659vp> actionList) {
        o.LJIIIZ(actionList, "actionList");
        ProfileCTAAbility profileCTAAbility = (ProfileCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ProfileCTAAbility.class, null);
        if (profileCTAAbility != null) {
            profileCTAAbility.Fi0(x3(), actionList);
        }
    }

    public final void updateContentDescription(CharSequence value) {
        o.LJIIIZ(value, "value");
        ProfileCTAAbility profileCTAAbility = (ProfileCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ProfileCTAAbility.class, null);
        if (profileCTAAbility != null) {
            profileCTAAbility.Ow(x3(), value);
        }
    }

    public final void updateIcon(Integer num) {
        ProfileCTAAbility profileCTAAbility = (ProfileCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ProfileCTAAbility.class, null);
        if (profileCTAAbility != null) {
            profileCTAAbility.vI(x3(), num);
        }
    }

    public final void updateRoleDescription(CharSequence roleDescription) {
        o.LJIIIZ(roleDescription, "roleDescription");
        ProfileCTAAbility profileCTAAbility = (ProfileCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ProfileCTAAbility.class, null);
        if (profileCTAAbility != null) {
            profileCTAAbility.Zb0(x3(), roleDescription);
        }
    }

    public final void requestShowAlertBadge(int i, int i2) {
        ProfileCTAAbility profileCTAAbility = (ProfileCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ProfileCTAAbility.class, null);
        if (profileCTAAbility != null) {
            profileCTAAbility.jc0(x3(), i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void H3(ProfileCTASingleComponent profileCTASingleComponent, InterfaceC65784Pro interfaceC65784Pro, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                interfaceC65784Pro = null;
            }
            profileCTASingleComponent.F3(interfaceC65784Pro);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestShow");
    }
}
