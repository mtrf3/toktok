package com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget;

import X.ActivityC45651qj;
import X.AnonymousClass309;
import X.C0A2;
import X.C100023wE;
import X.C101243yC;
import X.C107114Ih;
import X.C107124Ii;
import X.C107184Io;
import X.C107234It;
import X.C107814Kz;
import X.C108484No;
import X.C108534Nt;
import X.C109004Po;
import X.C16880lQ;
import X.C1DH;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C26045AKb;
import X.C32151Nz;
import X.C32I;
import X.C33Q;
import X.C34B;
import X.C3C8;
import X.C3UE;
import X.C3Y4;
import X.C3YB;
import X.C45804HyK;
import X.C4JW;
import X.C4KY;
import X.C4KZ;
import X.C4OH;
import X.C4OI;
import X.C4OO;
import X.C4ZZ;
import X.C56412MCa;
import X.C57428MgK;
import X.C58314Muc;
import X.C62846OlW;
import X.C67532kv;
import X.C70512pj;
import X.C73340SqO;
import X.C76800UCe;
import X.C77876UhM;
import X.C79045V0n;
import X.C84683Ua;
import X.C84943Va;
import X.C85773Yf;
import X.C86944YAi;
import X.C87693cL;
import X.C8YZ;
import X.FMX;
import X.InterfaceC100173wT;
import X.InterfaceC108504Nq;
import X.InterfaceC108594Nz;
import X.InterfaceC108744Oo;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC83893Qz;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.O6R;
import X.ORZ;
import X.OSK;
import X.OSL;
import X.OSM;
import X.SY4;
import X.TBW;
import X.X1D;
import Y.ACListenerS21S0100000_1;
import Y.ARunnableS20S0200000_1;
import Y.IDrS11S0200000_1;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.common.ui.base.Widget;
import com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.SharePanelWidget;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelAndroidViewModel;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.social.model.MAFIMUser;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS58S0110000_1;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class SharePanelWidget extends Widget implements InterfaceC83893Qz, InterfaceC108594Nz, KPL {
    public final C4OO LJLILLLLZI;
    public final InterfaceC108744Oo LJLJI;
    public final Context LJLJJI;
    public SharePanelViewModel LJLJJL;
    public RecyclerView LJLJJLL;
    public TuxIconView LJLJL;
    public C109004Po LJLJLJ;
    public View LJLJLLL;
    public EditText LJLL;
    public C62846OlW LJLLI;
    public TuxIconView LJLLILLLL;
    public SY4 LJLLJ;
    public LinearLayout LJLLL;
    public LinearLayout LJLLLL;
    public C4ZZ LJLLLLLL;
    public ViewGroup LJLZ;
    public C108484No LJZ;
    public C107124Ii LJZI;
    public C107114Ih LJZL;
    public InterfaceC108504Nq LL;
    public boolean LLD;
    public final boolean LLF;
    public final boolean LLFF;
    public final int LLFFF;
    public boolean LLFII;
    public final C3YB LLFZ;
    public InterfaceC100173wT LLI;
    public C86944YAi LLIFFJFJJ;
    public boolean LLII;

    @Override // X.InterfaceC108594Nz
    public final void Hq0(boolean z) {
    }

    @Override // X.InterfaceC83893Qz
    public final void Ql(int i, int i2, boolean z) {
    }

    @Override // X.InterfaceC108594Nz
    public final void YX(boolean z) {
    }

    @Override // X.KPL, X.C8YZ
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public final C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.InterfaceC83893Qz
    public final void nG(IMContact iMContact) {
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.base.Widget
    public final void onPause() {
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.base.Widget
    public final void onResume() {
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC83893Qz
    public final void sz(long j, boolean z, int i, boolean z2, int i2) {
    }

    @Override // X.InterfaceC108594Nz
    public final void ua(boolean z) {
    }

    public final int LIZJ() {
        C100023wE LJ;
        if (C85773Yf.LJLJI != null && (LJ = C77876UhM.LJ()) != null) {
            return LJ.LIZ;
        }
        return 10;
    }

    public final void LJIIIIZZ() {
        String string = this.LJLJJI.getString(R.string.h_7, Integer.valueOf(LIZJ()));
        o.LJIIIIZZ(string, "context.getString(toastResId, multiSelectLimit)");
        Activity LJIJJ = C45804HyK.LJIJJ(this.LJLJJI);
        o.LJI(LJIJJ);
        C26045AKb c26045AKb = new C26045AKb(LJIJJ);
        c26045AKb.LJIIIZ(string);
        c26045AKb.LJIIJ();
    }

    public final void LJIIIZ() {
        ViewModel viewModel;
        LiveData liveData;
        SharePanelViewModel sharePanelViewModel = this.LJLJJL;
        if (sharePanelViewModel != null) {
            boolean z = false;
            if (sharePanelViewModel.LJIIIIZZ().isEmpty() && !this.LLF) {
                View view = this.LJLJLLL;
                if (view != null) {
                    view.setVisibility(8);
                    C107114Ih c107114Ih = this.LJZL;
                    if (c107114Ih != null && c107114Ih.getVisibility() != 8) {
                        c107114Ih.setVisibility(8);
                    }
                    ViewGroup viewGroup = this.LJLZ;
                    if (viewGroup != null) {
                        viewGroup.setVisibility(8);
                    }
                    EditText editText = this.LJLL;
                    if (editText != null) {
                        KeyboardUtils.LIZIZ(editText);
                        if (!this.LJLILLLLZI.LIZIZ.LJIIJ()) {
                            ColorDrawable colorDrawable = new ColorDrawable(0);
                            this.LJLILLLLZI.LIZLLL.setBackground(colorDrawable);
                            this.LJLILLLLZI.LJ.setBackground(colorDrawable);
                            View view2 = this.LJLJLLL;
                            if (view2 != null) {
                                view2.setPadding(0, 0, 0, 0);
                            } else {
                                o.LJIJI("editLayout");
                                throw null;
                            }
                        }
                    } else {
                        o.LJIJI("editText");
                        throw null;
                    }
                } else {
                    o.LJIJI("editLayout");
                    throw null;
                }
            } else {
                LinearLayout linearLayout = this.LJLLLL;
                if (linearLayout != null) {
                    if (linearLayout.getMinimumHeight() <= 0) {
                        LinearLayout linearLayout2 = this.LJLLLL;
                        if (linearLayout2 != null) {
                            int height = linearLayout2.getHeight();
                            LinearLayout linearLayout3 = this.LJLLLL;
                            if (linearLayout3 != null) {
                                linearLayout3.setMinimumHeight(height);
                            } else {
                                o.LJIJI("shareRootLayout");
                                throw null;
                            }
                        } else {
                            o.LJIJI("shareRootLayout");
                            throw null;
                        }
                    }
                    C107114Ih c107114Ih2 = this.LJZL;
                    if (c107114Ih2 != null) {
                        c107114Ih2.LIZIZ();
                    }
                    ViewGroup viewGroup2 = this.LJLZ;
                    if (viewGroup2 != null) {
                        viewGroup2.setVisibility(0);
                    }
                    C4ZZ c4zz = this.LJLLLLLL;
                    if (c4zz != null) {
                        C107234It.LJFF(this.LJLILLLLZI.LIZIZ, c4zz.LJFF);
                    }
                    C62846OlW c62846OlW = this.LJLLI;
                    if (c62846OlW != null) {
                        TuxIconView tuxIconView = this.LJLLILLLL;
                        if (tuxIconView != null) {
                            C4JW.LJIJJ(c62846OlW, tuxIconView, this.LJLILLLLZI.LIZIZ, Boolean.FALSE);
                            SharePackage sharePackage = this.LJLILLLLZI.LIZIZ;
                            View view3 = this.LJLJLLL;
                            if (view3 != null) {
                                C4OI.LIZ(sharePackage, view3);
                                if (!this.LJLILLLLZI.LIZIZ.LJIIJ()) {
                                    ColorDrawable colorDrawable2 = new ColorDrawable(536870911);
                                    this.LJLILLLLZI.LIZLLL.setBackground(colorDrawable2);
                                    this.LJLILLLLZI.LJ.setBackground(colorDrawable2);
                                    View view4 = this.LJLJLLL;
                                    if (view4 != null) {
                                        view4.setPadding(0, 0, 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(40)));
                                    } else {
                                        o.LJIJI("editLayout");
                                        throw null;
                                    }
                                }
                            } else {
                                o.LJIJI("editLayout");
                                throw null;
                            }
                        } else {
                            o.LJIJI("shareIcon");
                            throw null;
                        }
                    } else {
                        o.LJIJI("shareCover");
                        throw null;
                    }
                } else {
                    o.LJIJI("shareRootLayout");
                    throw null;
                }
            }
            Context context = this.LJLJJI;
            if (!(context instanceof ActivityC45651qj)) {
                viewModel = null;
            } else {
                viewModel = ViewModelProviders.of((ActivityC45651qj) context).get(SharePanelAndroidViewModel.class);
            }
            SharePanelAndroidViewModel sharePanelAndroidViewModel = (SharePanelAndroidViewModel) viewModel;
            if (sharePanelAndroidViewModel == null || (liveData = (LiveData) sharePanelAndroidViewModel.LJLIL.getValue()) == null) {
                return;
            }
            View view5 = this.LJLJLLL;
            if (view5 != null) {
                if (view5.getVisibility() == 0) {
                    z = true;
                }
                liveData.setValue(Boolean.valueOf(z));
                return;
            }
            o.LJIJI("editLayout");
            throw null;
        }
        o.LJIJI("viewModel");
        throw null;
    }

    public final void LJIIJJI() {
        boolean z;
        String LIZIZ;
        SharePanelViewModel sharePanelViewModel = this.LJLJJL;
        if (sharePanelViewModel != null) {
            if (sharePanelViewModel.LLFF) {
                return;
            }
            View findViewById = this.LJLILLLLZI.LJI.findViewById(R.id.jua);
            SharePanelViewModel sharePanelViewModel2 = this.LJLJJL;
            if (sharePanelViewModel2 != null) {
                if (sharePanelViewModel2.LJIIIIZZ().isEmpty() && !this.LLF) {
                    findViewById.setVisibility(0);
                    SY4 sy4 = this.LJLLJ;
                    if (sy4 != null) {
                        sy4.setVisibility(8);
                        this.LJLILLLLZI.LJ.setVisibility(this.LLFFF);
                        return;
                    } else {
                        o.LJIJI("sendTv");
                        throw null;
                    }
                }
                findViewById.setVisibility(8);
                SY4 sy42 = this.LJLLJ;
                if (sy42 != null) {
                    sy42.setVisibility(0);
                    SY4 sy43 = this.LJLLJ;
                    if (sy43 != null) {
                        SharePanelViewModel sharePanelViewModel3 = this.LJLJJL;
                        if (sharePanelViewModel3 != null) {
                            if (sharePanelViewModel3.LJIIIIZZ().size() != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            sy43.setEnabled(z);
                            SY4 sy44 = this.LJLLJ;
                            if (sy44 != null) {
                                SharePanelViewModel sharePanelViewModel4 = this.LJLJJL;
                                if (sharePanelViewModel4 != null) {
                                    if (sharePanelViewModel4.LJIIIIZZ().size() <= 1) {
                                        SY4 sy45 = this.LJLLJ;
                                        if (sy45 != null) {
                                            LIZIZ = sy45.getResources().getString(R.string.h96);
                                        } else {
                                            o.LJIJI("sendTv");
                                            throw null;
                                        }
                                    } else {
                                        C108484No c108484No = this.LJZ;
                                        if (c108484No != null && c108484No.LJIIIZ) {
                                            LIZIZ = this.LJLJJI.getString(R.string.gvb);
                                        } else {
                                            StringBuilder LIZ = X1D.LIZ();
                                            SY4 sy46 = this.LJLLJ;
                                            if (sy46 != null) {
                                                LIZ.append(sy46.getResources().getString(R.string.qib));
                                                LIZ.append('(');
                                                SharePanelViewModel sharePanelViewModel5 = this.LJLJJL;
                                                if (sharePanelViewModel5 != null) {
                                                    LIZ.append(sharePanelViewModel5.LJIIIIZZ().size());
                                                    LIZ.append(')');
                                                    LIZIZ = X1D.LIZIZ(LIZ);
                                                } else {
                                                    o.LJIJI("viewModel");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("sendTv");
                                                throw null;
                                            }
                                        }
                                    }
                                    sy44.setText(LIZIZ);
                                    return;
                                }
                                o.LJIJI("viewModel");
                                throw null;
                            }
                            o.LJIJI("sendTv");
                            throw null;
                        }
                        o.LJIJI("viewModel");
                        throw null;
                    }
                    o.LJIJI("sendTv");
                    throw null;
                }
                o.LJIJI("sendTv");
                throw null;
            }
            o.LJIJI("viewModel");
            throw null;
        }
        o.LJIJI("viewModel");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.base.Widget
    public final void onDestroy() {
        InterfaceC108504Nq interfaceC108504Nq = this.LL;
        if (interfaceC108504Nq != null && interfaceC108504Nq.isShowing()) {
            interfaceC108504Nq.destroy();
        }
    }

    public final void LIZIZ(List<IMContact> list) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        SharePackage sharePackage = this.LJLILLLLZI.LIZIZ;
        sharePackage.extras.putInt("friends_shared_cnt", C1DH.LJIILLIIL(list));
        C107234It.LJIIL(sharePackage, null, list.size(), null, null, 56);
        EditText editText = this.LJLL;
        if (editText != null) {
            KeyboardUtils.LIZIZ(editText);
            ArrayList arrayList = new ArrayList();
            for (IMContact iMContact : list) {
                if (iMContact instanceof IMUser) {
                    arrayList.add(iMContact);
                }
            }
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((IMUser) it.next()).getUid());
            }
            String LIZIZ = C58314Muc.LIZIZ(arrayList2.toString(), 1, 1, "this as java.lang.String…ing(startIndex, endIndex)");
            ArrayList arrayList3 = new ArrayList();
            for (IMContact iMContact2 : list) {
                if (iMContact2 instanceof IMConversation) {
                    arrayList3.add(iMContact2);
                }
            }
            ArrayList arrayList4 = new ArrayList(C32I.LJJL(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((IMConversation) it2.next()).getConversationId());
            }
            String LIZIZ2 = C58314Muc.LIZIZ(arrayList4.toString(), 1, 1, "this as java.lang.String…ing(startIndex, endIndex)");
            int size = arrayList.size();
            int size2 = list.size() - size;
            Bundle bundle = this.LJLILLLLZI.LIZIZ.extras;
            bundle.putString("shareIdList", LIZIZ);
            bundle.putStringArray("shared_users_id_list", (String[]) arrayList2.toArray(new String[0]));
            bundle.putString("conversationIdList", LIZIZ2);
            bundle.putStringArray("shared_conversation_id_list", (String[]) arrayList4.toArray(new String[0]));
            bundle.putInt("chat_cnt", size);
            bundle.putInt("group_chat_cnt", size2);
            this.LLD = true;
            if (C3UE.LIZ()) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    for (IMContact iMContact3 : list) {
                        if (iMContact3 instanceof MAFIMUser) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("relation_tag", String.valueOf(((MAFIMUser) iMContact3).getFollowStatus()));
                            jSONObject2.put("rec_type", ((MAFIMUser) iMContact3).getRecType());
                            jSONObject.put(((MAFIMUser) iMContact3).getUid(), jSONObject2);
                        }
                    }
                    str = jSONObject.toString();
                    o.LJIIIIZZ(str, "jsonObject.toString()");
                } catch (Exception unused) {
                    str = "";
                }
                if (str.length() > 0) {
                    this.LJLILLLLZI.LIZIZ.extras.putString("rec_map", str);
                }
            }
            EditText editText2 = this.LJLL;
            if (editText2 != null) {
                Editable text = editText2.getText();
                if (text != null) {
                    str2 = text.toString();
                } else {
                    str2 = null;
                }
                C101243yC.LIZJ(sharePackage, str2, list, this.LJLJI, null, null, null, 112);
                EditText editText3 = this.LJLL;
                if (editText3 != null) {
                    Editable text2 = editText3.getText();
                    if (text2 != null) {
                        str3 = text2.toString();
                    } else {
                        str3 = null;
                    }
                    LJFF(sharePackage, str3, list);
                    if (o.LJ("live_event", sharePackage.itemType)) {
                        Iterator<IMContact> it3 = list.iterator();
                        while (it3.hasNext()) {
                            C4KZ.LJI(sharePackage, it3.next());
                        }
                    }
                    if (o.LJ(sharePackage.itemType, "comment")) {
                        C3Y4.LJ("enter_from", "comment_panel");
                    } else if (o.LJ(sharePackage.itemType, "live")) {
                        C3Y4.LJ("enter_from", "live");
                    } else if (o.LJ(sharePackage.itemType, "product")) {
                        EditText editText4 = this.LJLL;
                        if (editText4 != null) {
                            Editable text3 = editText4.getText();
                            if (text3 != null) {
                                str5 = text3.toString();
                            } else {
                                str5 = null;
                            }
                            C107184Io.LJIIIZ(sharePackage, str5, list);
                        } else {
                            o.LJIJI("editText");
                            throw null;
                        }
                    } else if (o.LJ(sharePackage.itemType, "paid_series")) {
                        EditText editText5 = this.LJLL;
                        if (editText5 != null) {
                            String comment = editText5.getText().toString();
                            o.LJIIIZ(comment, "comment");
                            if (o.LJ(sharePackage.itemType, "paid_series")) {
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                C4KY.LIZ(linkedHashMap, sharePackage, list);
                                if (comment.length() > 0) {
                                    str4 = "1";
                                } else {
                                    str4 = CardStruct.IStatusCode.DEFAULT;
                                }
                                linkedHashMap.put("if_with_comment", str4);
                                FMX.LJIIL("share_series_to_chat", linkedHashMap);
                            }
                        } else {
                            o.LJIJI("editText");
                            throw null;
                        }
                    }
                    if (this.LJLJJL != null) {
                        C84943Va.LIZ().LIZIZ(list);
                        return;
                    } else {
                        o.LJIJI("viewModel");
                        throw null;
                    }
                }
                o.LJIJI("editText");
                throw null;
            }
            o.LJIJI("editText");
            throw null;
        }
        o.LJIJI("editText");
        throw null;
    }

    public final void LJI(boolean z) {
        SharePanelViewModel sharePanelViewModel = this.LJLJJL;
        if (sharePanelViewModel != null) {
            sharePanelViewModel.LLFF = z;
            C109004Po c109004Po = this.LJLJLJ;
            if (c109004Po != null) {
                c109004Po.notifyDataSetChanged();
                SY4 sy4 = this.LJLLJ;
                if (sy4 != null) {
                    sy4.setLoading(z);
                    if (z) {
                        Integer LJI = C79045V0n.LJI(R.attr.eb, this.LJLJJI);
                        if (LJI != null) {
                            int intValue = LJI.intValue();
                            SY4 sy42 = this.LJLLJ;
                            if (sy42 != null) {
                                sy42.setBackgroundColor(intValue);
                                return;
                            } else {
                                o.LJIJI("sendTv");
                                throw null;
                            }
                        }
                        return;
                    }
                    C108484No c108484No = this.LJZ;
                    if (c108484No != null) {
                        c108484No.LJIIJ = false;
                    }
                    SY4 sy43 = this.LJLLJ;
                    if (sy43 != null) {
                        sy43.setBackgroundResource(R.drawable.bh9);
                        LJIIJJI();
                        return;
                    } else {
                        o.LJIJI("sendTv");
                        throw null;
                    }
                }
                o.LJIJI("sendTv");
                throw null;
            }
            o.LJIJI("headAdapter");
            throw null;
        }
        o.LJIJI("viewModel");
        throw null;
    }

    public final void LJIIJ(List<? extends IMContact> list) {
        Integer num;
        final LinearLayoutManager linearLayoutManager;
        if (this.LLFF) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updatePanelHead: ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        C34B.LJI("SharePanelWidget", X1D.LIZIZ(LIZ));
        if (list == null || list.isEmpty()) {
            C70512pj.LIZ(false);
            this.LJLILLLLZI.LIZJ.setVisibility(8);
        } else {
            C70512pj.LIZ(true);
            C109004Po c109004Po = this.LJLJLJ;
            if (c109004Po != null) {
                c109004Po.LJZ(null, this, list);
                C107234It.LJIIJJI(this.LJLILLLLZI.LIZIZ);
            } else {
                o.LJIJI("headAdapter");
                throw null;
            }
        }
        SharePanelViewModel sharePanelViewModel = this.LJLJJL;
        if (sharePanelViewModel != null) {
            C107814Kz.LIZ.getClass();
            if (C107814Kz.LIZIZ() != 3 || sharePanelViewModel.LJ().size() <= 5 || this.LLII) {
                return;
            }
            TuxIconView tuxIconView = this.LJLJL;
            if (tuxIconView != null) {
                this.LLIFFJFJJ = new C86944YAi(tuxIconView, new AqS151S0100000_1(this, 1061));
                this.LLII = true;
                TuxIconView tuxIconView2 = this.LJLJL;
                if (tuxIconView2 != null) {
                    C16880lQ.LJJJ(tuxIconView2, new ACListenerS21S0100000_1(this, 277));
                    RecyclerView recyclerView = this.LJLJJLL;
                    if (recyclerView != null) {
                        C0A2 layoutManager = recyclerView.getLayoutManager();
                        if (layoutManager instanceof LinearLayoutManager) {
                            linearLayoutManager = (LinearLayoutManager) layoutManager;
                        } else {
                            linearLayoutManager = null;
                        }
                        if (Build.VERSION.SDK_INT >= 23) {
                            RecyclerView recyclerView2 = this.LJLJJLL;
                            if (recyclerView2 != null) {
                                recyclerView2.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: X.4Oj
                                    @Override // android.view.View.OnScrollChangeListener
                                    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
                                        SharePanelWidget.this.LIZLLL(i - i3, linearLayoutManager);
                                    }
                                });
                                return;
                            } else {
                                o.LJIJI("headRecyclerView");
                                throw null;
                            }
                        }
                        RecyclerView recyclerView3 = this.LJLJJLL;
                        if (recyclerView3 != null) {
                            recyclerView3.setOnScrollListener(new IDrS11S0200000_1(this, linearLayoutManager, 3));
                            return;
                        } else {
                            o.LJIJI("headRecyclerView");
                            throw null;
                        }
                    }
                    o.LJIJI("headRecyclerView");
                    throw null;
                }
                o.LJIJI("floatingButton");
                throw null;
            }
            o.LJIJI("floatingButton");
            throw null;
        }
        o.LJIJI("viewModel");
        throw null;
    }

    @Override // X.InterfaceC108594Nz
    public final void gD(boolean z) {
        SharePanelViewModel sharePanelViewModel = this.LJLJJL;
        if (sharePanelViewModel != null) {
            sharePanelViewModel.LLD = z;
            C109004Po c109004Po = this.LJLJLJ;
            if (c109004Po != null) {
                c109004Po.notifyDataSetChanged();
                LJIIJJI();
                return;
            } else {
                o.LJIJI("headAdapter");
                throw null;
            }
        }
        o.LJIJI("viewModel");
        throw null;
    }

    @Override // X.InterfaceC83893Qz
    public final void ks(List<? extends IMContact> list) {
        o.LJIIIZ(list, "list");
        C3YB c3yb = this.LLFZ;
        if (c3yb != null) {
            C84683Ua.LJFF.LIZ(c3yb, new AnonymousClass309(list.size()));
        }
        C34B.LJI("SharePanelWidget", "onLoadComplete");
        LJIIJ(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:220:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0285  */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r9v14, types: [android.view.View, X.4OG] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SharePanelWidget(X.C4OO r33, X.InterfaceC108744Oo r34) {
        /*
            Method dump skipped, instructions count: 1510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.SharePanelWidget.<init>(X.4OO, X.4Oo):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x02c1, code lost:
    
        if (r29 != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0398, code lost:
    
        if (r1 != false) goto L162;
     */
    /* JADX WARN: Removed duplicated region for block: B:159:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x041f  */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    @Override // X.InterfaceC83893Qz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean HY(com.ss.android.ugc.aweme.im.service.model.IMContact r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 1131
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.SharePanelWidget.HY(com.ss.android.ugc.aweme.im.service.model.IMContact, boolean):boolean");
    }

    public final void LIZLLL(int i, LinearLayoutManager linearLayoutManager) {
        C86944YAi c86944YAi;
        C86944YAi c86944YAi2;
        if (i > 2) {
            if ((linearLayoutManager == null || linearLayoutManager.LLILL() != 0) && (c86944YAi2 = this.LLIFFJFJJ) != null) {
                c86944YAi2.LIZ(true);
                return;
            }
            return;
        }
        if (i >= -2 || (c86944YAi = this.LLIFFJFJJ) == null) {
            return;
        }
        c86944YAi.LIZ(false);
    }

    public final void LJII(List<? extends User> list, boolean z) {
        InterfaceC108504Nq interfaceC108504Nq = this.LL;
        AqS58S0110000_1 aqS58S0110000_1 = new AqS58S0110000_1(z, this, 10);
        if (interfaceC108504Nq != null) {
            interfaceC108504Nq.LIZJ(list);
            interfaceC108504Nq.LIZIZ(aqS58S0110000_1);
        } else {
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(this.LJLJJI);
            String string = this.LJLILLLLZI.LIZIZ.extras.getString("enter_from");
            if (string == null) {
                string = "";
            }
            interfaceC108504Nq = C108534Nt.LIZIZ.LIZ.LIZ(new C87693cL(LJJIFFI, string));
            interfaceC108504Nq.LIZJ(list);
            interfaceC108504Nq.LIZIZ(aqS58S0110000_1);
            interfaceC108504Nq.LIZ(new C4OH(this, interfaceC108504Nq));
            this.LL = interfaceC108504Nq;
        }
        interfaceC108504Nq.show();
    }

    @Override // X.InterfaceC83893Qz
    public final void xN(Throwable e, List list) {
        o.LJIIIZ(list, "list");
        o.LJIIIZ(e, "e");
        C3YB c3yb = this.LLFZ;
        if (c3yb != null) {
            C84683Ua.LJFF.LIZ(c3yb, new AnonymousClass309(list.size()));
        }
        if (C73340SqO.LJJIJ(this.LJLJJI)) {
            Activity LJIJJ = C45804HyK.LJIJJ(this.LJLJJI);
            o.LJI(LJIJJ);
            LJIJJ.runOnUiThread(new ARunnableS20S0200000_1(this, list, 65));
        }
    }

    public final void LJFF(SharePackage sharePackage, String str, List<? extends IMContact> list) {
        String uid;
        if (o.LJ(sharePackage.itemType, "aweme") || o.LJ(sharePackage.itemType, "aweme_photo") || o.LJ(sharePackage.itemType, "now_post") || o.LJ(sharePackage.itemType, "now_video") || o.LJ(sharePackage.itemType, "now_post_memory") || o.LJ(sharePackage.itemType, "now_video_memory")) {
            C57428MgK.LJFF(sharePackage, str, ORZ.LLJILJILJ(list), 0, 56);
            ArrayList arrayList = new ArrayList();
            for (IMContact iMContact : list) {
                if (iMContact instanceof IMUser) {
                    IMUser iMUser = (IMUser) iMContact;
                    if (!iMUser.isBlock() && iMUser.getFollowStatus() == 2 && (uid = iMUser.getUid()) != null) {
                        arrayList.add(uid);
                    }
                }
            }
            C67532kv.LIZ(arrayList);
        }
    }

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}
