package com.ss.android.ugc.aweme.relation.monitor;

import X.AbstractC57828Mmm;
import X.AbstractC72932td;
import X.AbstractC78640Utg;
import X.ActivityC45651qj;
import X.C223208pQ;
import X.C3C1;
import X.C45804HyK;
import X.C47261Igj;
import X.C57778Mly;
import X.C57789Mm9;
import X.C57819Mmd;
import X.C72912tb;
import X.C76800UCe;
import X.C78630UtW;
import X.C78631UtX;
import X.C78632UtY;
import X.C78633UtZ;
import X.C78634Uta;
import X.C78638Ute;
import X.C78639Utf;
import X.C78641Uth;
import X.C78646Utm;
import X.EnumC41264GHk;
import X.EnumC78629UtV;
import X.InterfaceC78626UtS;
import X.InterfaceC88471Ynr;
import X.ORZ;
import Y.IDComparatorS37S0000000_9;
import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class RecUserPopupMonImpl implements InterfaceC78626UtS {
    public final C57819Mmd LJLIL;
    public final EnumC78629UtV LJLILLLLZI;
    public final InterfaceC88471Ynr<String, JSONObject, C76800UCe> LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public final List<AbstractC78640Utg> LJLJJLL;
    public int LJLJL;

    public RecUserPopupMonImpl() {
        throw null;
    }

    @Override // X.InterfaceC78626UtS
    public final void cancel() {
        this.LJLJJL = true;
        this.LJLJJI = false;
        ((ArrayList) this.LJLJJLL).clear();
    }

    @Override // X.InterfaceC78626UtS
    public final void Hs0(AbstractC78640Utg abstractC78640Utg) {
        if (!this.LJLJJI || this.LJLJJL) {
            return;
        }
        AbstractC78640Utg abstractC78640Utg2 = (AbstractC78640Utg) ORZ.LLFII(this.LJLJJLL);
        ((ArrayList) this.LJLJJLL).add(abstractC78640Utg);
        if (abstractC78640Utg2 == null || abstractC78640Utg2.LIZ - abstractC78640Utg.LIZ <= 0) {
            if (!(abstractC78640Utg instanceof C78632UtY) && !(abstractC78640Utg instanceof C78631UtX)) {
                return;
            }
            this.LJLJJL = true;
            C78646Utm c78646Utm = C78646Utm.LIZ;
            AqS163S0100000_13 aqS163S0100000_13 = new AqS163S0100000_13(this, 254);
            c78646Utm.getClass();
            C78646Utm.LIZLLL(aqS163S0100000_13);
            return;
        }
        this.LJLJJI = false;
        this.LJLJJL = true;
        C78646Utm c78646Utm2 = C78646Utm.LIZ;
        AqS163S0100000_13 aqS163S0100000_132 = new AqS163S0100000_13(this, 253);
        c78646Utm2.getClass();
        C78646Utm.LIZLLL(aqS163S0100000_132);
    }

    public final void LIZ(List<? extends AbstractC78640Utg> list) {
        C78639Utf c78639Utf;
        Integer num;
        String str;
        long j;
        Object obj;
        long j2;
        long j3;
        long j4;
        EnumC41264GHk enumC41264GHk;
        List LLILII = ORZ.LLILII(new IDComparatorS37S0000000_9(2), list);
        if (LLILII.isEmpty()) {
            return;
        }
        Object LJLLLL = ORZ.LJLLLL(LLILII);
        if (LJLLLL instanceof C78639Utf) {
            c78639Utf = (C78639Utf) LJLLLL;
        } else {
            c78639Utf = null;
        }
        AbstractC78640Utg abstractC78640Utg = (AbstractC78640Utg) ORZ.LLFII(LLILII);
        JSONObject jSONObject = new JSONObject();
        C78646Utm c78646Utm = C78646Utm.LIZ;
        JSONObject put = jSONObject.put("type", this.LJLILLLLZI.getMobName()).put("show_cnt", this.LJLJL);
        if (c78639Utf != null && (enumC41264GHk = c78639Utf.LJFF) != null) {
            c78646Utm.getClass();
            num = Integer.valueOf(C78646Utm.LJ(enumC41264GHk));
        } else {
            num = null;
        }
        JSONObject putOpt = put.putOpt("net_status", num);
        if (abstractC78640Utg != null) {
            str = abstractC78640Utg.LIZIZ;
        } else {
            str = null;
        }
        JSONObject putOpt2 = putOpt.putOpt("current_step", str);
        o.LJIIIIZZ(putOpt2, "category\n            .pu…_step\", curStep?.mobName)");
        Map<String, String> LIZLLL = this.LJLIL.LIZLLL();
        c78646Utm.getClass();
        C78646Utm.LIZ(LIZLLL, putOpt2);
        if (!this.LJLJJI || c78639Utf == null) {
            jSONObject.put("is_valid", 0);
        } else {
            Iterator it = LLILII.iterator();
            long j5 = -1;
            long j6 = -1;
            int i = 0;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i >= 0) {
                        AbstractC78640Utg abstractC78640Utg2 = (AbstractC78640Utg) next;
                        if (i > 0) {
                            j = C78646Utm.LIZIZ(C78646Utm.LIZ, abstractC78640Utg2.LIZJ - j6);
                            if (j == j5) {
                                jSONObject.put("is_valid", 0);
                                break;
                            }
                        } else {
                            j = -1;
                        }
                        if (abstractC78640Utg2 instanceof C78639Utf) {
                            jSONObject.put("p_uid", ((C78639Utf) abstractC78640Utg2).LJ);
                        } else if (abstractC78640Utg2 instanceof C78630UtW) {
                            jSONObject.put("waiting_cost", j);
                        } else if (abstractC78640Utg2 instanceof C78634Uta) {
                            jSONObject.put("count", ((C78634Uta) abstractC78640Utg2).LJ).put("prepare_cost", j);
                        } else if (abstractC78640Utg2 instanceof C78633UtZ) {
                            jSONObject.put("pending_cost", j);
                        } else if (abstractC78640Utg2 instanceof C78638Ute) {
                            if (this.LJLILLLLZI == EnumC78629UtV.FYP) {
                                j3 = abstractC78640Utg2.LIZJ;
                                j4 = c78639Utf.LIZJ;
                            } else {
                                Iterator it2 = ((ArrayList) list).iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj = it2.next();
                                        if (obj instanceof C78634Uta) {
                                            break;
                                        }
                                    } else {
                                        obj = null;
                                        break;
                                    }
                                }
                                AbstractC78640Utg abstractC78640Utg3 = (AbstractC78640Utg) obj;
                                if (abstractC78640Utg3 != null) {
                                    j3 = abstractC78640Utg2.LIZJ;
                                    j4 = abstractC78640Utg3.LIZJ;
                                } else {
                                    j2 = -1;
                                    C78638Ute c78638Ute = (C78638Ute) abstractC78640Utg2;
                                    jSONObject.put("v_uid", c78638Ute.LJFF).put("v_tab", c78638Ute.LJ).put("inflate_cost", j).put("visible_cost", j2);
                                }
                            }
                            j2 = j3 - j4;
                            C78638Ute c78638Ute2 = (C78638Ute) abstractC78640Utg2;
                            jSONObject.put("v_uid", c78638Ute2.LJFF).put("v_tab", c78638Ute2.LJ).put("inflate_cost", j).put("visible_cost", j2);
                        } else if (abstractC78640Utg2 instanceof C78632UtY) {
                            jSONObject.put("show_cost", j);
                        } else if (abstractC78640Utg2 instanceof C78631UtX) {
                            jSONObject.put("fail_reason", ((C78631UtX) abstractC78640Utg2).LJ);
                        }
                        j6 = abstractC78640Utg2.LIZJ;
                        j5 = -1;
                        i = i2;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                } else {
                    jSONObject.put("is_valid", 1);
                    break;
                }
            }
        }
        this.LJLJI.invoke("rec_user_popup_pref", jSONObject);
    }

    @Override // X.InterfaceC78626UtS
    public final void XR(String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        C57819Mmd c57819Mmd = this.LJLIL;
        c57819Mmd.getClass();
        c57819Mmd.LIZ = enterFrom;
    }

    @Override // X.InterfaceC57910Mo6
    public final void kR(AbstractC57828Mmm<?> abstractC57828Mmm) {
        ActivityC45651qj LJJIFFI;
        if (abstractC57828Mmm instanceof C57789Mm9) {
            this.LJLJL++;
            if (!(ORZ.LLFII(this.LJLJJLL) instanceof C78638Ute)) {
                C78646Utm.LIZ.getClass();
                Activity topActivity = ActivityStack.getTopActivity();
                String str = null;
                if (topActivity != null && (LJJIFFI = C45804HyK.LJJIFFI(topActivity)) != null) {
                    str = Hox.LJLLI.LIZ(LJJIFFI).lv0();
                }
                if (str == null) {
                    str = "";
                }
                Hs0(new C78638Ute(str));
            }
        }
    }

    @Override // X.InterfaceC57910Mo6
    public final void ww(C57778Mly state) {
        o.LJIIIZ(state, "state");
        AbstractC72932td<C223208pQ> abstractC72932td = state.LIZ;
        if (abstractC72932td instanceof C72912tb) {
            if ((state.LIZJ instanceof C72912tb) && state.LIZJ()) {
                Hs0(new C78631UtX(0));
                return;
            }
            return;
        }
        if (abstractC72932td instanceof C3C1) {
            Hs0(new C78631UtX(-1));
        }
    }

    public RecUserPopupMonImpl(C57819Mmd c57819Mmd, EnumC78629UtV type) {
        C78641Uth c78641Uth = new C78641Uth(C78646Utm.LIZ);
        o.LJIIIZ(type, "type");
        this.LJLIL = c57819Mmd;
        this.LJLILLLLZI = type;
        this.LJLJI = c78641Uth;
        this.LJLJJI = true;
        this.LJLJJLL = new ArrayList();
    }

    @Override // X.InterfaceC57910Mo6
    public final void LJLZ(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        if (!this.LJLJJL && event == Lifecycle.Event.ON_DESTROY) {
            this.LJLJJL = true;
            LIZ(this.LJLJJLL);
        }
        if (this.LJLJJL) {
            source.getLifecycle().removeObserver(this);
        }
    }
}
