package com.bytedance.android.live.liveinteract.multimatch.business.dialog;

import X.AbstractC76222Tvm;
import X.ActivityC45651qj;
import X.C05170If;
import X.C0NB;
import X.C10A;
import X.C141335gf;
import X.C15380j0;
import X.C15490jB;
import X.C15640jQ;
import X.C16880lQ;
import X.C221108m2;
import X.C29306Beo;
import X.C29701Eo;
import X.C29S;
import X.C2A7;
import X.C30868C9o;
import X.C3C5;
import X.C47061t0;
import X.C47121t6;
import X.C47151t9;
import X.C51029K0z;
import X.C62822Ol8;
import X.C75768ToS;
import X.C75832TpU;
import X.C75883TqJ;
import X.C76029Tsf;
import X.C76185TvB;
import X.C76217Tvh;
import X.C76223Tvn;
import X.C76224Tvo;
import X.C76225Tvp;
import X.C76226Tvq;
import X.C76227Tvr;
import X.C76244Tw8;
import X.C76265TwT;
import X.C76280Twi;
import X.C76800UCe;
import X.C8E;
import X.C90903hW;
import X.CFX;
import X.EnumC76178Tv4;
import X.FT5;
import X.X1D;
import Y.AObserverS76S0200000_13;
import Y.AObserverS81S0100000_13;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.match.business.event.BattleInvitingTimeLeftChannel;
import com.bytedance.android.live.liveinteract.multimatch.business.dialog.contract.MultiMatchBeInvitedContract$AbsView;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class MultiMatchBeInvitedFragmentV2 extends MultiMatchBeInvitedContract$AbsView {
    public static final /* synthetic */ int LLIIL = 0;
    public C76223Tvn LJLJJL;
    public C47121t6 LJLJJLL;
    public LiveIconView LJLJLJ;
    public C47061t0 LJLJLLL;
    public C47121t6 LJLL;
    public LiveIconView LJLLI;
    public C47061t0 LJLLILLLL;
    public C47121t6 LJLLJ;
    public C76217Tvh LJLLL;
    public C47061t0 LJLLLL;
    public C47061t0 LJLLLLLL;
    public LiveIconView LJLZ;
    public C47061t0 LJZ;
    public C47121t6 LJZI;
    public LiveIconView LJZL;
    public C47061t0 LL;
    public C47121t6 LLD;
    public C2A7 LLF;
    public C2A7 LLFF;
    public C47121t6 LLFFF;
    public C47121t6 LLFII;
    public C47121t6 LLFZ;
    public C47121t6 LLI;
    public C29701Eo LLIFFJFJJ;
    public C29701Eo LLII;
    public C29701Eo LLIIII;
    public C29701Eo LLIIIILZ;
    public C2A7 LLIIIJ;
    public C76029Tsf LLIIJI;
    public final Map<Integer, View> LLIIJLIL = new LinkedHashMap();
    public boolean LJLJL = true;
    public final C62822Ol8 LLIIIL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 151));
    public final C76185TvB LLIIIZ = new C76185TvB(this);

    @Override // com.bytedance.android.live.liveinteract.multimatch.business.dialog.contract.MultiMatchBeInvitedContract$AbsView
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIIJLIL).clear();
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.business.dialog.contract.MultiMatchBeInvitedContract$AbsView, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public static boolean Al() {
        EnumC76178Tv4 LJ = C76265TwT.LIZ.LJ();
        EnumC76178Tv4 enumC76178Tv4 = EnumC76178Tv4.ACCEPTED;
        if (LJ == enumC76178Tv4 || C76265TwT.LIZIZ.LJ() == enumC76178Tv4) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00dd, code lost:
    
        if (r7 != null) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void initView() {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multimatch.business.dialog.MultiMatchBeInvitedFragmentV2.initView():void");
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C76029Tsf vl() {
        C76029Tsf c76029Tsf = new C76029Tsf();
        this.LLIIJI = c76029Tsf;
        c76029Tsf.LJFF = Al();
        C76185TvB c76185TvB = this.LLIIIZ;
        boolean z = true;
        if (wl() != 1) {
            z = false;
        }
        c76185TvB.getClass();
        c76029Tsf.LIZIZ = C76185TvB.LIZ(z) + 246;
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.my7);
        o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_match_invite_panel_title)");
        c76029Tsf.LIZ = LJIILJJIL;
        c76029Tsf.LJI = new AqS163S0100000_13(this, 149);
        c76029Tsf.LJII = new AqS163S0100000_13(this, 150);
        return c76029Tsf;
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.business.dialog.contract.MultiMatchBeInvitedContract$AbsView
    public final int wl() {
        C76223Tvn c76223Tvn = this.LJLJJL;
        if (c76223Tvn != null) {
            return c76223Tvn.LIZLLL;
        }
        o.LJIJI("fragmentParams");
        throw null;
    }

    public final int xl() {
        return ((Number) this.LLIIIL.getValue()).intValue();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        AbstractC76222Tvm abstractC76222Tvm = (AbstractC76222Tvm) this.LJLILLLLZI;
        if (abstractC76222Tvm != null) {
            abstractC76222Tvm.LJ();
        }
    }

    public final void Hl(boolean z) {
        C76244Tw8 LJFF;
        MutableLiveData<Map<Long, Boolean>> mutableLiveData;
        long j;
        AbstractC76222Tvm abstractC76222Tvm = (AbstractC76222Tvm) this.LJLILLLLZI;
        if (abstractC76222Tvm != null && (LJFF = abstractC76222Tvm.LJFF()) != null && (mutableLiveData = LJFF.LJI) != null) {
            Map<Long, Boolean> value = mutableLiveData.getValue();
            if (value == null) {
                value = new HashMap<>();
            }
            if (!C8E.LIZLLL().LJIILJJIL().isEmpty()) {
                j = ((C75883TqJ) ListProtector.get(C8E.LIZLLL().LJIILJJIL(), 0)).LIZ;
            } else {
                j = 0;
            }
            value.put(Long.valueOf(j), Boolean.valueOf(z));
            mutableLiveData.setValue(value);
        }
    }

    public final void Dl(List<C75883TqJ> list, Map<Long, Boolean> map) {
        ImageModel imageModel;
        int i;
        int i2;
        String str;
        ImageModel imageModel2;
        int i3;
        int i4;
        String str2;
        String str3;
        if (list == null || list.size() != 2) {
            return;
        }
        C75883TqJ c75883TqJ = (C75883TqJ) ListProtector.get(list, 0);
        if (c75883TqJ != null) {
            LiveIconView liveIconView = this.LJLZ;
            C75768ToS c75768ToS = c75883TqJ.LJIIZILJ;
            if (c75768ToS != null) {
                imageModel2 = c75768ToS.LIZJ;
            } else {
                imageModel2 = null;
            }
            if (liveIconView != null) {
                i3 = liveIconView.getWidth();
            } else {
                i3 = 0;
            }
            LiveIconView liveIconView2 = this.LJLZ;
            if (liveIconView2 != null) {
                i4 = liveIconView2.getHeight();
            } else {
                i4 = 0;
            }
            C15640jQ.LJIIIZ(liveIconView, imageModel2, i3, i4, xl(), null);
            C47121t6 c47121t6 = this.LJZI;
            if (c47121t6 != null) {
                C75768ToS c75768ToS2 = c75883TqJ.LJIIZILJ;
                if (c75768ToS2 != null) {
                    str2 = c75768ToS2.LIZ;
                    str3 = c75768ToS2.LIZIZ;
                } else {
                    str2 = null;
                    str3 = null;
                }
                c47121t6.setText(C05170If.LIZIZ(str2, str3));
            }
            if (map != null && o.LJ(map.get(Long.valueOf(c75883TqJ.LIZ)), Boolean.TRUE)) {
                C47061t0 c47061t0 = this.LJZ;
                if (c47061t0 != null) {
                    c47061t0.setVisibility(0);
                }
                C47121t6 c47121t62 = this.LLFZ;
                if (c47121t62 != null) {
                    C29306Beo.LJI(c47121t62);
                }
                C29701Eo c29701Eo = this.LLIIII;
                if (c29701Eo != null) {
                    C29306Beo.LJIIIZ(c29701Eo);
                }
            } else {
                C47061t0 c47061t02 = this.LJZ;
                if (c47061t02 != null) {
                    c47061t02.setVisibility(8);
                }
            }
        }
        C75883TqJ c75883TqJ2 = (C75883TqJ) ListProtector.get(list, 1);
        if (c75883TqJ2 == null) {
            return;
        }
        LiveIconView liveIconView3 = this.LJZL;
        C75768ToS c75768ToS3 = c75883TqJ2.LJIIZILJ;
        if (c75768ToS3 != null) {
            imageModel = c75768ToS3.LIZJ;
        } else {
            imageModel = null;
        }
        if (liveIconView3 != null) {
            i = liveIconView3.getWidth();
        } else {
            i = 0;
        }
        LiveIconView liveIconView4 = this.LJZL;
        if (liveIconView4 != null) {
            i2 = liveIconView4.getHeight();
        } else {
            i2 = 0;
        }
        String str4 = null;
        C15640jQ.LJIIIZ(liveIconView3, imageModel, i, i2, xl(), null);
        C47121t6 c47121t63 = this.LLD;
        if (c47121t63 != null) {
            C75768ToS c75768ToS4 = c75883TqJ2.LJIIZILJ;
            if (c75768ToS4 != null) {
                str = c75768ToS4.LIZ;
                str4 = c75768ToS4.LIZIZ;
            } else {
                str = null;
            }
            c47121t63.setText(C05170If.LIZIZ(str, str4));
        }
        if (map != null && o.LJ(map.get(Long.valueOf(c75883TqJ2.LIZ)), Boolean.TRUE)) {
            C47061t0 c47061t03 = this.LL;
            if (c47061t03 != null) {
                c47061t03.setVisibility(0);
            }
            C47121t6 c47121t64 = this.LLI;
            if (c47121t64 != null) {
                C29306Beo.LJI(c47121t64);
            }
            C29701Eo c29701Eo2 = this.LLIIIILZ;
            if (c29701Eo2 == null) {
                return;
            }
            C29306Beo.LJIIIZ(c29701Eo2);
            return;
        }
        C47061t0 c47061t04 = this.LL;
        if (c47061t04 == null) {
            return;
        }
        c47061t04.setVisibility(8);
    }

    public final void Gl(List<C75883TqJ> list, Map<Long, Boolean> map) {
        ImageModel imageModel;
        int i;
        int i2;
        String str;
        boolean z;
        C76217Tvh c76217Tvh;
        ImageModel imageModel2;
        int i3;
        int i4;
        String str2;
        String str3;
        if (list == null || list.size() != 2) {
            return;
        }
        C76217Tvh c76217Tvh2 = this.LJLLL;
        if (c76217Tvh2 != null) {
            c76217Tvh2.LIZIZ(14.0f);
        }
        C75883TqJ c75883TqJ = (C75883TqJ) ListProtector.get(list, 0);
        String str4 = null;
        if (c75883TqJ != null) {
            LiveIconView liveIconView = this.LJLJLJ;
            C75768ToS c75768ToS = c75883TqJ.LJIIZILJ;
            if (c75768ToS != null) {
                imageModel2 = c75768ToS.LIZJ;
            } else {
                imageModel2 = null;
            }
            if (liveIconView != null) {
                i3 = liveIconView.getWidth();
            } else {
                i3 = 0;
            }
            LiveIconView liveIconView2 = this.LJLJLJ;
            if (liveIconView2 != null) {
                i4 = liveIconView2.getHeight();
            } else {
                i4 = 0;
            }
            C15640jQ.LJIIIZ(liveIconView, imageModel2, i3, i4, xl(), null);
            C47121t6 c47121t6 = this.LJLL;
            if (c47121t6 != null) {
                C75768ToS c75768ToS2 = c75883TqJ.LJIIZILJ;
                if (c75768ToS2 != null) {
                    str2 = c75768ToS2.LIZ;
                    str3 = c75768ToS2.LIZIZ;
                } else {
                    str2 = null;
                    str3 = null;
                }
                c47121t6.setText(C05170If.LIZIZ(str2, str3));
            }
            if (map != null && o.LJ(map.get(Long.valueOf(c75883TqJ.LIZ)), Boolean.TRUE)) {
                C47061t0 c47061t0 = this.LJLJLLL;
                if (c47061t0 != null) {
                    c47061t0.setVisibility(0);
                }
                C47121t6 c47121t62 = this.LLFFF;
                if (c47121t62 != null) {
                    C29306Beo.LJI(c47121t62);
                }
                C29701Eo c29701Eo = this.LLIFFJFJJ;
                if (c29701Eo != null) {
                    C29306Beo.LJIIIZ(c29701Eo);
                }
            } else {
                C47061t0 c47061t02 = this.LJLJLLL;
                if (c47061t02 != null) {
                    c47061t02.setVisibility(8);
                }
            }
        }
        C75883TqJ c75883TqJ2 = (C75883TqJ) ListProtector.get(list, 1);
        if (c75883TqJ2 == null) {
            return;
        }
        LiveIconView liveIconView3 = this.LJLLI;
        C75768ToS c75768ToS3 = c75883TqJ2.LJIIZILJ;
        if (c75768ToS3 != null) {
            imageModel = c75768ToS3.LIZJ;
        } else {
            imageModel = null;
        }
        if (liveIconView3 != null) {
            i = liveIconView3.getWidth();
        } else {
            i = 0;
        }
        LiveIconView liveIconView4 = this.LJLLI;
        if (liveIconView4 != null) {
            i2 = liveIconView4.getHeight();
        } else {
            i2 = 0;
        }
        C15640jQ.LJIIIZ(liveIconView3, imageModel, i, i2, xl(), null);
        C47121t6 c47121t63 = this.LJLLJ;
        if (c47121t63 != null) {
            C75768ToS c75768ToS4 = c75883TqJ2.LJIIZILJ;
            if (c75768ToS4 != null) {
                str = c75768ToS4.LIZ;
                str4 = c75768ToS4.LIZIZ;
            } else {
                str = null;
            }
            c47121t63.setText(C05170If.LIZIZ(str, str4));
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("visible? = ");
        C76217Tvh c76217Tvh3 = this.LJLLL;
        if (c76217Tvh3 != null && c76217Tvh3.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        FT5.LJ(LIZ, !z, LIZ, "MultiMatchBeInvitedFrag");
        if (C76265TwT.LIZ.LJIIIIZZ == c75883TqJ2.LIZ && ((c76217Tvh = this.LJLLL) == null || c76217Tvh.getVisibility() != 0)) {
            C76217Tvh c76217Tvh4 = this.LJLLL;
            if (c76217Tvh4 != null) {
                c76217Tvh4.setVisibility(0);
            }
            C0NB.LJIIIZ("MultiMatchBeInvitedFrag", "show");
            C76217Tvh c76217Tvh5 = this.LJLLL;
            if (c76217Tvh5 != null) {
                c76217Tvh5.LJLJJI = false;
            }
        }
        if (map != null && o.LJ(map.get(Long.valueOf(c75883TqJ2.LIZ)), Boolean.TRUE)) {
            C47061t0 c47061t03 = this.LJLLILLLL;
            if (c47061t03 != null) {
                c47061t03.setVisibility(0);
            }
            C47121t6 c47121t64 = this.LLFII;
            if (c47121t64 != null) {
                C29306Beo.LJI(c47121t64);
            }
            C29701Eo c29701Eo2 = this.LLII;
            if (c29701Eo2 == null) {
                return;
            }
            C29306Beo.LJIIIZ(c29701Eo2);
            return;
        }
        C47061t0 c47061t04 = this.LJLLILLLL;
        if (c47061t04 == null) {
            return;
        }
        c47061t04.setVisibility(8);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Long l;
        List<TeamUsersInfo> list;
        C76280Twi c76280Twi;
        boolean z;
        Long l2;
        C76244Tw8 LJFF;
        C76244Tw8 LJFF2;
        C76244Tw8 LJFF3;
        C76244Tw8 LJFF4;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C75832TpU c75832TpU = C75832TpU.LIZ;
        AbstractC76222Tvm abstractC76222Tvm = (AbstractC76222Tvm) this.LJLILLLLZI;
        String str = null;
        if (abstractC76222Tvm != null && (LJFF4 = abstractC76222Tvm.LJFF()) != null) {
            l = Long.valueOf(LJFF4.LJIIIIZZ);
        } else {
            l = null;
        }
        AbstractC76222Tvm abstractC76222Tvm2 = (AbstractC76222Tvm) this.LJLILLLLZI;
        if (abstractC76222Tvm2 != null && (LJFF3 = abstractC76222Tvm2.LJFF()) != null) {
            list = LJFF3.LJIIIZ;
        } else {
            list = null;
        }
        if (wl() == 1) {
            c76280Twi = C76265TwT.LIZIZ;
        } else {
            c76280Twi = C76265TwT.LIZ;
        }
        long LIZIZ = c76280Twi.LIZIZ();
        if (wl() == 1) {
            z = true;
        } else {
            z = false;
        }
        C76223Tvn c76223Tvn = this.LJLJJL;
        if (c76223Tvn != null) {
            c75832TpU.LJIJJ(l, true, list, LIZIZ, z, c76223Tvn.LJ);
            AbstractC76222Tvm abstractC76222Tvm3 = (AbstractC76222Tvm) this.LJLILLLLZI;
            if (abstractC76222Tvm3 != null && (LJFF2 = abstractC76222Tvm3.LJFF()) != null) {
                LJFF2.LIZIZ.setValue(C8E.LIZLLL().LJIILJJIL());
                LJFF2.LJ.observe(this, new AObserverS76S0200000_13(this, LJFF2, 10));
                Gl(LJFF2.LJ.getValue(), LJFF2.LJI.getValue());
                LJFF2.LJFF.observe(this, new AObserverS76S0200000_13(this, LJFF2, 11));
                Dl(LJFF2.LJFF.getValue(), LJFF2.LJI.getValue());
                LJFF2.LJI.observe(this, new AObserverS76S0200000_13(this, LJFF2, 12));
                LJFF2.LIZIZ.observe(this, new AObserverS81S0100000_13(this, 73));
            }
            AbstractC76222Tvm abstractC76222Tvm4 = (AbstractC76222Tvm) this.LJLILLLLZI;
            if (abstractC76222Tvm4 != null) {
                abstractC76222Tvm4.LIZLLL();
            }
            DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
            if (LJIILIIL != null) {
                LJIILIIL.lv0(this, BattleInvitingTimeLeftChannel.class, new AqS179S0100000_13(this, 208));
            }
            initView();
            C76223Tvn c76223Tvn2 = this.LJLJJL;
            if (c76223Tvn2 != null) {
                if (c76223Tvn2.LIZJ) {
                    Hl(true);
                    C2A7 c2a7 = this.LLIIIJ;
                    if (c2a7 != null) {
                        c2a7.setVisibility(0);
                    }
                    C2A7 c2a72 = this.LLF;
                    if (c2a72 != null) {
                        c2a72.setVisibility(8);
                    }
                    C2A7 c2a73 = this.LLFF;
                    if (c2a73 != null) {
                        c2a73.setVisibility(8);
                    }
                    C2A7 c2a74 = this.LLIIIJ;
                    if (c2a74 != null) {
                        c2a74.setText(C15380j0.LJIILJJIL(R.string.my8));
                    }
                    C76029Tsf c76029Tsf = this.LLIIJI;
                    if (c76029Tsf != null) {
                        c76029Tsf.LJFF = true;
                    }
                    Object[] objArr = new Object[1];
                    AbstractC76222Tvm abstractC76222Tvm5 = (AbstractC76222Tvm) this.LJLILLLLZI;
                    if (abstractC76222Tvm5 != null && (LJFF = abstractC76222Tvm5.LJFF()) != null) {
                        l2 = Long.valueOf(LJFF.LJIIIIZZ);
                    } else {
                        l2 = null;
                    }
                    Iterator<C75883TqJ> it = C8E.LIZLLL().LJIILJJIL().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            C75883TqJ next = it.next();
                            long j = next.LIZ;
                            if (l2 != null && j == l2.longValue()) {
                                C75768ToS c75768ToS = next.LJIIZILJ;
                                if (c75768ToS != null) {
                                    str = c75768ToS.LIZIZ;
                                }
                            }
                        } else {
                            str = "";
                            break;
                        }
                    }
                    objArr[0] = str;
                    C30868C9o.LJI(C15380j0.LJIILL(R.string.ot4, objArr));
                    C2A7 c2a75 = this.LLFF;
                    if (c2a75 != null) {
                        c2a75.performClick();
                        return;
                    }
                    return;
                }
                return;
            }
            o.LJIJI("fragmentParams");
            throw null;
        }
        o.LJIJI("fragmentParams");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.czi, viewGroup, false);
        this.LJLJJLL = (C47121t6) LLLLIILL.findViewById(R.id.eri);
        this.LJLJLJ = (LiveIconView) LLLLIILL.findViewById(R.id.jmz);
        this.LJLJLLL = (C47061t0) LLLLIILL.findViewById(R.id.jmx);
        this.LJLL = (C47121t6) LLLLIILL.findViewById(R.id.jnb);
        this.LJLLI = (LiveIconView) LLLLIILL.findViewById(R.id.l1x);
        this.LJLLILLLL = (C47061t0) LLLLIILL.findViewById(R.id.l1w);
        this.LJLLJ = (C47121t6) LLLLIILL.findViewById(R.id.l21);
        this.LJLLL = (C76217Tvh) LLLLIILL.findViewById(R.id.ez6);
        this.LJLZ = (LiveIconView) LLLLIILL.findViewById(R.id.j3n);
        this.LJZ = (C47061t0) LLLLIILL.findViewById(R.id.j3o);
        this.LJZI = (C47121t6) LLLLIILL.findViewById(R.id.j3s);
        this.LJZL = (LiveIconView) LLLLIILL.findViewById(R.id.j3t);
        this.LL = (C47061t0) LLLLIILL.findViewById(R.id.j3u);
        this.LLD = (C47121t6) LLLLIILL.findViewById(R.id.j3y);
        this.LLF = (C2A7) LLLLIILL.findViewById(R.id.c4h);
        this.LLFF = (C2A7) LLLLIILL.findViewById(R.id.lx);
        this.LLFFF = (C47121t6) LLLLIILL.findViewById(R.id.jn5);
        this.LLFII = (C47121t6) LLLLIILL.findViewById(R.id.l1z);
        this.LLFZ = (C47121t6) LLLLIILL.findViewById(R.id.j3q);
        this.LLI = (C47121t6) LLLLIILL.findViewById(R.id.j3w);
        this.LLIFFJFJJ = (C29701Eo) LLLLIILL.findViewById(R.id.jn_);
        this.LLII = (C29701Eo) LLLLIILL.findViewById(R.id.l20);
        this.LLIIII = (C29701Eo) LLLLIILL.findViewById(R.id.j3r);
        this.LLIIIILZ = (C29701Eo) LLLLIILL.findViewById(R.id.j3x);
        C76185TvB c76185TvB = this.LLIIIZ;
        c76185TvB.getClass();
        c76185TvB.LIZ = (C47151t9) LLLLIILL.findViewById(R.id.dtu);
        c76185TvB.LIZIZ = (C47121t6) LLLLIILL.findViewById(R.id.dtt);
        this.LLIIIJ = (C2A7) LLLLIILL.findViewById(R.id.ngm);
        this.LJLLLL = (C47061t0) LLLLIILL.findViewById(R.id.f5r);
        this.LJLLLLLL = (C47061t0) LLLLIILL.findViewById(R.id.f5q);
        C15490jB.LJIIL(this.LLIFFJFJJ, CFX.LIZ("tiktok_live_link_mic", "tiktok_live_interaction_demand_1"), "live_match_wave_red.zip", "", true, null, C76224Tvo.LJLIL, 32);
        C15490jB.LJIIL(this.LLII, CFX.LIZ("tiktok_live_link_mic", "tiktok_live_interaction_demand_1"), "live_match_wave_red.zip", "", true, null, C76225Tvp.LJLIL, 32);
        C15490jB.LJIIL(this.LLIIII, CFX.LIZ("tiktok_live_link_mic", "tiktok_live_interaction_demand_1"), "live_match_wave_blue.zip", "", true, null, C76226Tvq.LJLIL, 32);
        C15490jB.LJIIL(this.LLIIIILZ, CFX.LIZ("tiktok_live_link_mic", "tiktok_live_interaction_demand_1"), "live_match_wave_blue.zip", "", true, null, C76227Tvr.LJLIL, 32);
        C15490jB.LJ(this.LJLLLL, CFX.LIZ("tiktok_live_link_mic", "tiktok_live_interaction_demand_1"), "ttlive_multi_match_beinvited_red_group_bg.png");
        C15490jB.LJ(this.LJLLLLLL, CFX.LIZ("tiktok_live_link_mic", "tiktok_live_interaction_demand_1"), "ttlive_multi_match_beinvited_blue_group_bg.png");
        try {
            ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
            C10A.LIZIZ(LLLLIILL, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LLLLIILL;
    }
}
