package com.ss.android.ugc.aweme.detail.prefab;

import X.AbstractC73672Svk;
import X.C16880lQ;
import X.C212428Vi;
import X.C2K0;
import X.C34K;
import X.C55096Ljo;
import X.C55230Lly;
import X.C73411SrX;
import X.C73969T1h;
import X.C7MY;
import X.EV9;
import X.InterfaceC187177Wf;
import X.InterfaceC55235Lm3;
import X.InterfaceC64592gB;
import Y.ACListenerS23S0100000_3;
import Y.ARunnableS39S0100000_3;
import Y.AfS55S0100000_3;
import Y.IDObjectS176S0100000_3;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.detail.prefab.SearchBarAssem;
import com.ss.android.ugc.aweme.detail.prefab.ability.PageContentScrollAbility;
import com.ss.android.ugc.aweme.utils.KeyBoardMonitor;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class SearchBarAssem extends DynamicAssem {
    public EditText LJLJLLL;
    public View LJLL;
    public boolean LJLLI;
    public C73411SrX LJLLILLLL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.c2l;
    }

    public SearchBarAssem() {
        new LinkedHashMap();
        this.LJLLI = true;
    }

    @Override // X.C8W0
    public final void onPause() {
        super.onPause();
        EditText editText = this.LJLJLLL;
        if (editText != null) {
            KeyboardUtils.LIZIZ(editText);
        } else {
            o.LJIJI("input");
            throw null;
        }
    }

    public final void L3(String str) {
        View view = this.LJLL;
        if (view != null) {
            int i = 0;
            if (str == null || str.length() == 0) {
                i = 8;
            }
            view.setVisibility(i);
            C73411SrX c73411SrX = this.LJLLILLLL;
            if (c73411SrX != null) {
                c73411SrX.dispose();
            }
            this.LJLLILLLL = (C73411SrX) AbstractC73672Svk.LJJIJIL(str).LJIIL(50L, TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS55S0100000_3(this, 10), new InterfaceC64592gB() { // from class: X.7U7
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            });
            return;
        }
        o.LJIJI("clear");
        throw null;
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        this.LJLJLLL = (EditText) C7MY.LIZLLL(view, "view", R.id.czq, "view.findViewById(R.id.et_input)");
        View findViewById = view.findViewById(R.id.be6);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.clear)");
        this.LJLL = findViewById;
        final C34K c34k = new C34K();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(LIZLLL, null);
            PageContentScrollAbility pageContentScrollAbility = new PageContentScrollAbility() { // from class: com.ss.android.ugc.aweme.detail.prefab.SearchBarAssem$onViewCreated$1
                @Override // com.ss.android.ugc.aweme.detail.prefab.ability.PageContentScrollAbility
                public final void pS(int i) {
                    SearchBarAssem searchBarAssem = SearchBarAssem.this;
                    if (!searchBarAssem.LJLLI) {
                        C34K c34k2 = c34k;
                        if (c34k2.element) {
                            c34k2.element = false;
                            EditText editText = searchBarAssem.LJLJLLL;
                            if (editText != null) {
                                KeyboardUtils.LIZIZ(editText);
                            } else {
                                o.LJIJI("input");
                                throw null;
                            }
                        }
                    }
                    SearchBarAssem.this.LJLLI = false;
                }
            };
            C2K0 LIZ = C55096Ljo.LIZ(LIZJ, PageContentScrollAbility.class, null);
            if (LIZ == null) {
                C55096Ljo.LJIIJJI(LIZJ, pageContentScrollAbility, PageContentScrollAbility.class, null);
            } else {
                try {
                    InvocationHandler invocationHandler = Proxy.getInvocationHandler(LIZ);
                    if (invocationHandler instanceof EV9) {
                        ((EV9) invocationHandler).LIZ.add(pageContentScrollAbility);
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException unused) {
                    EV9 ev9 = new EV9();
                    ev9.LIZ.add(pageContentScrollAbility);
                    ev9.LIZ.add(LIZ);
                    Object newProxyInstance = Proxy.newProxyInstance(PageContentScrollAbility.class.getClassLoader(), new Class[]{PageContentScrollAbility.class}, ev9);
                    if (newProxyInstance != null) {
                        C55096Ljo.LJIIJJI(LIZJ, (C2K0) newProxyInstance, PageContentScrollAbility.class, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.detail.prefab.ability.PageContentScrollAbility");
                    }
                }
            }
        }
        KeyBoardMonitor keyBoardMonitor = new KeyBoardMonitor(this);
        EditText editText = this.LJLJLLL;
        if (editText != null) {
            keyBoardMonitor.LIZ(editText, new InterfaceC187177Wf(this) { // from class: X.7Uj
                public final /* synthetic */ SearchBarAssem LJLILLLLZI;

                @Override // X.InterfaceC187177Wf
                public final void LLLLLILLIL() {
                    c34k.element = true;
                    EditText editText2 = this.LJLILLLLZI.LJLJLLL;
                    if (editText2 != null) {
                        editText2.setCursorVisible(true);
                    } else {
                        o.LJIJI("input");
                        throw null;
                    }
                }

                @Override // X.InterfaceC187177Wf
                public final void S2() {
                    c34k.element = false;
                    EditText editText2 = this.LJLILLLLZI.LJLJLLL;
                    if (editText2 != null) {
                        editText2.setCursorVisible(false);
                    } else {
                        o.LJIJI("input");
                        throw null;
                    }
                }

                {
                    this.LJLILLLLZI = this;
                }
            });
            EditText editText2 = this.LJLJLLL;
            if (editText2 != null) {
                editText2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.7Uk
                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                        if (i == 3) {
                            SearchBarAssem.this.L3(textView.getText().toString());
                            return true;
                        }
                        return false;
                    }
                });
                EditText editText3 = this.LJLJLLL;
                if (editText3 != null) {
                    editText3.addTextChangedListener(new IDObjectS176S0100000_3(this, 3));
                    if (!o.LJ(getConfig().LJ.get("prop_show_keyboard"), Boolean.FALSE)) {
                        EditText editText4 = this.LJLJLLL;
                        if (editText4 != null) {
                            editText4.postDelayed(new ARunnableS39S0100000_3(this, 38), 1000L);
                        } else {
                            o.LJIJI("input");
                            throw null;
                        }
                    }
                    View view2 = this.LJLL;
                    if (view2 != null) {
                        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 37), view2);
                        Object obj = getConfig().LJ.get("prop_hint_text");
                        if ((obj instanceof String) && (str = (String) obj) != null) {
                            EditText editText5 = this.LJLJLLL;
                            if (editText5 != null) {
                                editText5.setHint(str);
                                return;
                            } else {
                                o.LJIJI("input");
                                throw null;
                            }
                        }
                        return;
                    }
                    o.LJIJI("clear");
                    throw null;
                }
                o.LJIJI("input");
                throw null;
            }
            o.LJIJI("input");
            throw null;
        }
        o.LJIJI("input");
        throw null;
    }
}
