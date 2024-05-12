package com.bytedance.ies.xelement.reveal;

import X.C16230kN;
import X.C16880lQ;
import X.C270714l;
import X.C78996UzQ;
import X.C79705VPx;
import X.C79787VTb;
import X.EWS;
import X.InterpolatorC79786VTa;
import X.VNA;
import X.VNU;
import X.VPD;
import X.VRK;
import X.VTZ;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import java.lang.reflect.Field;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class LynxRevealView extends UISimpleView<C79787VTb> {
    public C79787VTb LJLIL;
    public boolean LJLILLLLZI;

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean needCustomLayout() {
        return true;
    }

    public LynxRevealView(VNU vnu) {
        super(vnu);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        if (context == null) {
            return null;
        }
        C79787VTb c79787VTb = new C79787VTb(context);
        this.LJLIL = c79787VTb;
        c79787VTb.LJLLLLLL = 2;
        c79787VTb.LJLLI = 300;
        c79787VTb.LJLLJ = 1;
        Context context2 = c79787VTb.getContext();
        o.LJFF(context2, "context");
        Resources resources = context2.getResources();
        o.LJFF(resources, "context.resources");
        c79787VTb.LJLJL = (int) ((1 * resources.getDisplayMetrics().density) + 0.5f);
        c79787VTb.LJZL = C270714l.LJIIJ(c79787VTb, c79787VTb.LLF);
        try {
            Field declaredField = C270714l.class.getDeclaredField("LJIIZILJ");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                declaredField.set(c79787VTb.LJZL, new VTZ(c79787VTb.getContext(), new InterpolatorC79786VTa()));
            }
        } catch (IllegalAccessException e) {
            C16880lQ.LLLLIIL(e);
        } catch (NoSuchFieldException e2) {
            C16880lQ.LLLLIIL(e2);
        }
        C270714l c270714l = c79787VTb.LJZL;
        if (c270714l != null) {
            c270714l.LJIILLIIL = 15;
        }
        c79787VTb.LL = new C16230kN(c79787VTb.getContext(), c79787VTb.LLFF);
        C79787VTb c79787VTb2 = this.LJLIL;
        if (c79787VTb2 != null) {
            c79787VTb2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            C79787VTb c79787VTb3 = this.LJLIL;
            if (c79787VTb3 != null) {
                c79787VTb3.setSwipeListener(new C79705VPx(this));
                C79787VTb c79787VTb4 = this.LJLIL;
                if (c79787VTb4 != null) {
                    return c79787VTb4;
                }
                o.LJIJI("mRevealLayout");
                throw null;
            }
            o.LJIJI("mRevealLayout");
            throw null;
        }
        o.LJIJI("mRevealLayout");
        throw null;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void removeChild(LynxBaseUI child) {
        o.LJIIJ(child, "child");
        if (child instanceof LynxUI) {
            this.mChildren.remove(child);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, VNA> map) {
        super.setEvents(map);
        if (map != null && map.containsKey("state")) {
            this.LJLILLLLZI = true;
        }
    }

    @VPD(defaultInt = 0, name = "mode")
    public final void setRevealLayoutMode(String mode) {
        o.LJIIJ(mode, "mode");
        Locale locale = Locale.ROOT;
        o.LJFF(locale, "Locale.ROOT");
        String lowerCase = mode.toLowerCase(locale);
        o.LJFF(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        int hashCode = lowerCase.hashCode();
        if (hashCode != -1394648469) {
            if (hashCode != -1039745817 || !lowerCase.equals("normal")) {
                return;
            }
            C79787VTb c79787VTb = this.LJLIL;
            if (c79787VTb != null) {
                c79787VTb.setMode$x_element_reveal_view_release(0);
                return;
            } else {
                o.LJIJI("mRevealLayout");
                throw null;
            }
        }
        if (!lowerCase.equals("same_level")) {
            return;
        }
        C79787VTb c79787VTb2 = this.LJLIL;
        if (c79787VTb2 != null) {
            c79787VTb2.setMode$x_element_reveal_view_release(1);
        } else {
            o.LJIJI("mRevealLayout");
            throw null;
        }
    }

    @EWS
    public final void toggleActive(ReadableMap params) {
        o.LJIIJ(params, "params");
        if (params.hasKey("state")) {
            String string = params.getString("state");
            if (string == null) {
                return;
            }
            int hashCode = string.hashCode();
            if (hashCode != 3417674) {
                if (hashCode != 94756344 || !string.equals("close")) {
                    return;
                }
                C79787VTb c79787VTb = this.LJLIL;
                if (c79787VTb != null) {
                    c79787VTb.LIZIZ(true);
                    return;
                } else {
                    o.LJIJI("mRevealLayout");
                    throw null;
                }
            }
            if (!string.equals("open")) {
                return;
            }
            C79787VTb c79787VTb2 = this.LJLIL;
            if (c79787VTb2 != null) {
                c79787VTb2.LIZJ(true);
                return;
            } else {
                o.LJIJI("mRevealLayout");
                throw null;
            }
        }
        C79787VTb c79787VTb3 = this.LJLIL;
        if (c79787VTb3 != null) {
            if (c79787VTb3.LJLLILLLL == 2) {
                c79787VTb3.LIZIZ(true);
                return;
            } else {
                c79787VTb3.LIZJ(true);
                return;
            }
        }
        o.LJIJI("mRevealLayout");
        throw null;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void insertChild(LynxBaseUI child, int i) {
        o.LJIIJ(child, "child");
        if (child instanceof LynxUI) {
            ListProtector.add(this.mChildren, i, child);
            LynxUI lynxUI = (LynxUI) child;
            lynxUI.setParent(this);
            if (child instanceof LynxRevealInnerLeft) {
                C79787VTb c79787VTb = this.LJLIL;
                if (c79787VTb != null) {
                    VRK vrk = (VRK) ((LynxUI) child).mView;
                    o.LJFF(vrk, "child.view");
                    c79787VTb.LIZ(vrk);
                    C79787VTb c79787VTb2 = this.LJLIL;
                    if (c79787VTb2 != null) {
                        c79787VTb2.setDragEdge(1);
                        return;
                    } else {
                        o.LJIJI("mRevealLayout");
                        throw null;
                    }
                }
                o.LJIJI("mRevealLayout");
                throw null;
            }
            if (child instanceof LynxRevealInnerRight) {
                C79787VTb c79787VTb3 = this.LJLIL;
                if (c79787VTb3 != null) {
                    VRK vrk2 = (VRK) ((LynxUI) child).mView;
                    o.LJFF(vrk2, "child.view");
                    c79787VTb3.LIZ(vrk2);
                    C79787VTb c79787VTb4 = this.LJLIL;
                    if (c79787VTb4 != null) {
                        c79787VTb4.setDragEdge(2);
                        return;
                    } else {
                        o.LJIJI("mRevealLayout");
                        throw null;
                    }
                }
                o.LJIJI("mRevealLayout");
                throw null;
            }
            if (child instanceof LynxRevealInnerTop) {
                C79787VTb c79787VTb5 = this.LJLIL;
                if (c79787VTb5 != null) {
                    VRK vrk3 = (VRK) ((LynxUI) child).mView;
                    o.LJFF(vrk3, "child.view");
                    c79787VTb5.LIZ(vrk3);
                    C79787VTb c79787VTb6 = this.LJLIL;
                    if (c79787VTb6 != null) {
                        c79787VTb6.setDragEdge(4);
                        return;
                    } else {
                        o.LJIJI("mRevealLayout");
                        throw null;
                    }
                }
                o.LJIJI("mRevealLayout");
                throw null;
            }
            if (child instanceof LynxRevealInnerBottom) {
                C79787VTb c79787VTb7 = this.LJLIL;
                if (c79787VTb7 != null) {
                    VRK vrk4 = (VRK) ((LynxUI) child).mView;
                    o.LJFF(vrk4, "child.view");
                    c79787VTb7.LIZ(vrk4);
                    C79787VTb c79787VTb8 = this.LJLIL;
                    if (c79787VTb8 != null) {
                        c79787VTb8.setDragEdge(8);
                        return;
                    } else {
                        o.LJIJI("mRevealLayout");
                        throw null;
                    }
                }
                o.LJIJI("mRevealLayout");
                throw null;
            }
            C79787VTb c79787VTb9 = this.LJLIL;
            if (c79787VTb9 != null) {
                View view = lynxUI.mView;
                o.LJFF(view, "child.view");
                View view2 = c79787VTb9.LJLIL;
                if (view2 != null) {
                    if (C78996UzQ.LJJIIJZLJL(view2)) {
                        C78996UzQ.LJI();
                    }
                    c79787VTb9.removeView(view2);
                }
                c79787VTb9.LJLIL = view;
                c79787VTb9.addView(view);
                return;
            }
            o.LJIJI("mRevealLayout");
            throw null;
        }
    }
}
