package X;

import Y.ACListenerS21S0100000_1;
import Y.ARunnableS37S0100000_1;
import Y.IDObjectS174S0100000_1;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.relations.ui.fragment.RelationSelectFragment;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3lJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class ViewOnTouchListenerC93253lJ implements View.OnTouchListener {
    public final Activity LJLIL;
    public final View LJLILLLLZI;
    public SharePackage LJLJI;
    public BaseContent LJLJJI;
    public java.util.Map<String, String> LJLJJL;
    public boolean LJLJJLL;
    public EditText LJLJL;
    public ImageView LJLJLJ;
    public C73305Spp LJLJLLL;
    public RecyclerView LJLL;
    public C101043xs LJLLI;
    public IDObjectS174S0100000_1 LJLLILLLL;
    public AbstractC93453ld LJLLJ;
    public ACListenerS21S0100000_1 LJLLL;
    public C93293lN LJLLLL;
    public String LJLLLLLL;
    public String LJLZ = "";
    public RelationSelectFragment LJZ;

    public void LJI(List<Integer> list, List<String> list2) {
    }

    public void LIZJ() {
        this.LJLLI = (C101043xs) this.LJLILLLLZI.findViewById(R.id.l_2);
        this.LJLJLLL = (C73305Spp) this.LJLILLLLZI.findViewById(R.id.kf_);
        EditText editText = (EditText) this.LJLILLLLZI.findViewById(R.id.jf9);
        this.LJLJL = editText;
        if (editText != null) {
            editText.setTag("relation_search_tag");
        }
        EditText editText2 = this.LJLJL;
        if (editText2 != null) {
            editText2.setHint(R.string.h1b);
        }
        this.LJLJLJ = (ImageView) this.LJLILLLLZI.findViewById(R.id.avg);
        RecyclerView recyclerView = (RecyclerView) this.LJLILLLLZI.findViewById(R.id.isd);
        this.LJLL = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager());
        }
        RecyclerView recyclerView2 = this.LJLL;
        if (recyclerView2 != null) {
            final Activity activity = this.LJLIL;
            recyclerView2.LJIIJJI(new C73379Sr1(activity) { // from class: X.3lL
                @Override // X.C73379Sr1, X.C0A6
                public final void LJIILJJIL(int i, RecyclerView rv) {
                    o.LJIIIZ(rv, "rv");
                    super.LJIILJJIL(i, rv);
                    ViewOnTouchListenerC93253lJ viewOnTouchListenerC93253lJ = ViewOnTouchListenerC93253lJ.this;
                    EditText editText3 = viewOnTouchListenerC93253lJ.LJLJL;
                    if (editText3 != null) {
                        AYA.LIZ(viewOnTouchListenerC93253lJ.LJLIL, editText3);
                    }
                }
            });
        }
    }

    public final void LJIIIIZZ() {
        C101043xs c101043xs = this.LJLLI;
        if (c101043xs != null) {
            c101043xs.setRightTuxFont(41);
            c101043xs.setLeftText(R.string.cg_);
            c101043xs.setRightText(R.string.h5t);
            c101043xs.setTitle(R.string.h93);
            Context context = c101043xs.getContext();
            o.LJIIIIZZ(context, "context");
            Integer LJI = C79045V0n.LJI(R.attr.d0, context);
            if (LJI != null) {
                c101043xs.setRightTextColor(LJI.intValue());
            }
            View rightView = c101043xs.getRightView();
            if (rightView != null) {
                rightView.setEnabled(false);
            }
        }
        AbstractC93453ld abstractC93453ld = this.LJLLJ;
        if (abstractC93453ld != null) {
            abstractC93453ld.LLFF(true);
        }
        C101043xs c101043xs2 = this.LJLLI;
        if (c101043xs2 != null) {
            c101043xs2.setOnTitlebarClickListener(new InterfaceC101063xu() { // from class: X.3lP
                @Override // X.InterfaceC101063xu
                public final void LIZ() {
                }

                @Override // X.InterfaceC101063xu
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC101063xu
                public final void LIZLLL() {
                }

                @Override // X.InterfaceC101063xu
                public final void LJ() {
                    ViewOnTouchListenerC93253lJ.this.LJIIIZ();
                }

                @Override // X.InterfaceC101063xu
                public final void LIZJ(int i) {
                    final ViewOnTouchListenerC93253lJ viewOnTouchListenerC93253lJ = ViewOnTouchListenerC93253lJ.this;
                    AbstractC93453ld abstractC93453ld2 = viewOnTouchListenerC93253lJ.LJLLJ;
                    if (abstractC93453ld2 == null || abstractC93453ld2.LJLJJLL.size() <= 0) {
                        return;
                    }
                    C107274Ix.LJIIIIZZ(viewOnTouchListenerC93253lJ.LJLIL, viewOnTouchListenerC93253lJ.LJLJI, (IMContact[]) abstractC93453ld2.LJLJJLL.toArray(new IMContact[0]), viewOnTouchListenerC93253lJ.LJLLLLLL, new C4JZ() { // from class: X.3lQ
                        @Override // X.C4JZ
                        public final void LIZ(String str) {
                            List list;
                            Object[] array;
                            AbstractC93453ld abstractC93453ld3 = ViewOnTouchListenerC93253lJ.this.LJLLJ;
                            if (abstractC93453ld3 == null || (array = abstractC93453ld3.LJLJJLL.toArray(new IMContact[0])) == null || (list = ORY.LJJZZIII(array)) == null) {
                                list = C61878OQg.INSTANCE;
                            }
                            ViewOnTouchListenerC93253lJ.this.LJIIJ(str, list);
                            ViewOnTouchListenerC93253lJ viewOnTouchListenerC93253lJ2 = ViewOnTouchListenerC93253lJ.this;
                            SharePackage sharePackage = viewOnTouchListenerC93253lJ2.LJLJI;
                            if (sharePackage != null) {
                                C107234It.LJIIL(sharePackage, viewOnTouchListenerC93253lJ2.LJLJJI, list.size(), null, null, 56);
                                C57428MgK.LJFF(sharePackage, "", list, 0, 56);
                                C3VT.LIZIZ(sharePackage, C3Y4.LIZJ, C65777Prh.LIZIZ(list));
                            }
                        }
                    }, new C4JZ() { // from class: X.3lS
                        @Override // X.C4JZ
                        public final void LIZ(String str) {
                        }
                    });
                }
            });
        }
    }

    public final void LJIIIZ() {
        C101043xs c101043xs = this.LJLLI;
        if (c101043xs != null) {
            c101043xs.setRightTuxFont(41);
            c101043xs.setLeftText(R.string.h4t);
            c101043xs.setTitle(R.string.h95);
            c101043xs.setRightText(R.string.h92);
            Context context = c101043xs.getContext();
            o.LJIIIIZZ(context, "context");
            Integer LJI = C79045V0n.LJI(R.attr.go, context);
            if (LJI != null) {
                c101043xs.setRightTextColor(LJI.intValue());
            }
            View rightView = c101043xs.getRightView();
            if (rightView != null) {
                rightView.setEnabled(true);
            }
            c101043xs.setOnTitlebarClickListener(new InterfaceC101063xu() { // from class: X.3lI
                @Override // X.InterfaceC101063xu
                public final void LIZ() {
                }

                @Override // X.InterfaceC101063xu
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC101063xu
                public final void LIZLLL() {
                }

                @Override // X.InterfaceC101063xu
                public final void LJ() {
                    ViewOnTouchListenerC93253lJ viewOnTouchListenerC93253lJ = ViewOnTouchListenerC93253lJ.this;
                    EditText editText = viewOnTouchListenerC93253lJ.LJLJL;
                    if (editText != null) {
                        AYA.LIZ(viewOnTouchListenerC93253lJ.LJLIL, editText);
                    }
                    ViewOnTouchListenerC93253lJ.this.LJLIL.finish();
                }

                @Override // X.InterfaceC101063xu
                public final void LIZJ(int i) {
                    C85323Wm eventSender = C772831o.LIZ();
                    o.LJIIIZ(eventSender, "eventSender");
                    C1HQ c1hq = new C1HQ();
                    c1hq.put("enter_from", "contact_list");
                    c1hq.put("enter_method", "click_multi_choose_button");
                    eventSender.LIZIZ("enter_multi_choose_contact", c1hq);
                    ViewOnTouchListenerC93253lJ.this.LJIIIIZZ();
                }
            });
        }
        AbstractC93453ld abstractC93453ld = this.LJLLJ;
        if (abstractC93453ld == null) {
            return;
        }
        abstractC93453ld.LLFF(false);
    }

    public void LJIIJJI() {
        C73305Spp c73305Spp = this.LJLJLLL;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(8);
        }
        AbstractC93453ld abstractC93453ld = this.LJLLJ;
        if (abstractC93453ld != null && abstractC93453ld.getItemCount() == 0) {
            if (this.LJLJJLL) {
                C73306Spq c73306Spq = new C73306Spq();
                C73312Spw.LJIIIZ(c73306Spq);
                C73305Spp c73305Spp2 = this.LJLJLLL;
                if (c73305Spp2 != null) {
                    c73305Spp2.setStatus(c73306Spq);
                }
            } else {
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_large_person;
                c2068389v.LJ = Integer.valueOf(R.attr.gp);
                C73306Spq c73306Spq2 = new C73306Spq();
                c73306Spq2.LIZJ = 0;
                c73306Spq2.LIZIZ = c2068389v;
                String string = this.LJLIL.getString(R.string.h8g);
                o.LJIIIIZZ(string, "activity.getString(R.str….im_relation_empty_title)");
                c73306Spq2.LJFF = string;
                String string2 = this.LJLIL.getString(R.string.h8f);
                o.LJIIIIZZ(string2, "activity.getString(R.str…g.im_relation_empty_desc)");
                c73306Spq2.LJI = string2;
                C73305Spp c73305Spp3 = this.LJLJLLL;
                if (c73305Spp3 != null) {
                    c73305Spp3.setStatus(c73306Spq2);
                }
            }
            C73305Spp c73305Spp4 = this.LJLJLLL;
            if (c73305Spp4 == null) {
                return;
            }
            c73305Spp4.setVisibility(0);
            return;
        }
        C73305Spp c73305Spp5 = this.LJLJLLL;
        if (c73305Spp5 == null) {
            return;
        }
        c73305Spp5.setVisibility(8);
    }

    public final void LJIIL() {
        int i;
        Integer num;
        AbstractC93453ld abstractC93453ld = this.LJLLJ;
        if (abstractC93453ld != null) {
            i = abstractC93453ld.LJLJJLL.size();
        } else {
            i = 0;
        }
        if (i > 0) {
            C101043xs c101043xs = this.LJLLI;
            if (c101043xs != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(this.LJLIL.getString(R.string.h5t));
                LIZ.append('(');
                AbstractC93453ld abstractC93453ld2 = this.LJLLJ;
                if (abstractC93453ld2 != null) {
                    num = Integer.valueOf(abstractC93453ld2.LJLJJLL.size());
                } else {
                    num = null;
                }
                LIZ.append(num);
                LIZ.append(')');
                c101043xs.setRightText(X1D.LIZIZ(LIZ));
                View rightView = c101043xs.getRightView();
                if (rightView != null) {
                    rightView.setEnabled(true);
                }
                c101043xs.setRightTuxFont(42);
                Context context = c101043xs.getContext();
                o.LJIIIIZZ(context, "context");
                Integer LJI = C79045V0n.LJI(R.attr.eb, context);
                if (LJI != null) {
                    c101043xs.setRightTextColor(LJI.intValue());
                    return;
                }
                return;
            }
            return;
        }
        C101043xs c101043xs2 = this.LJLLI;
        if (c101043xs2 == null) {
            return;
        }
        c101043xs2.setRightText(R.string.h5t);
        c101043xs2.setEnabled(false);
        c101043xs2.setRightTuxFont(41);
        Context context2 = c101043xs2.getContext();
        o.LJIIIIZZ(context2, "context");
        Integer LJI2 = C79045V0n.LJI(R.attr.d0, context2);
        if (LJI2 == null) {
            return;
        }
        c101043xs2.setRightTextColor(LJI2.intValue());
    }

    public void LIZIZ() {
        AbstractC93453ld abstractC93453ld;
        if (C39419FdX.LIZIZ()) {
            if (this.LJLJI != null) {
                abstractC93453ld = new C93433lb() { // from class: X.3lV
                    @Override // X.AbstractC93453ld
                    public final void LJZ(int i) {
                        if (i < 0 || i >= ((ArrayList) this.LJLJI).size()) {
                            return;
                        }
                        Object obj = ListProtector.get(this.LJLJI, i);
                        int size = ((ArrayList) this.LJLJI).size();
                        for (int i2 = 0; i2 < size; i2++) {
                            if (o.LJ(obj, ListProtector.get(this.LJLJI, i2))) {
                                notifyItemChanged(i2);
                            }
                        }
                    }

                    @Override // X.C93433lb, X.AbstractC93453ld
                    public final C93423la LJZL(int i, ViewGroup parent) {
                        int i2;
                        o.LJIIIZ(parent, "parent");
                        LayoutInflater LLZIL = C16880lQ.LLZIL(parent.getContext());
                        if (i == 0) {
                            i2 = R.layout.b5b;
                        } else {
                            i2 = R.layout.b5c;
                        }
                        return new C93413lZ(this, C16880lQ.LLLLIILL(LLZIL, i2, parent, false));
                    }

                    @Override // X.C93433lb, X.AbstractC93453ld, X.AbstractC029409q
                    /* renamed from: onCreateViewHolder */
                    public final C93423la com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
                        C93423la LJZL = LJZL(i, viewGroup);
                        C0AX.LIZ(viewGroup, LJZL.itemView, R.id.lj7);
                        View view = LJZL.itemView;
                        if (view != null) {
                            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
                        }
                        try {
                            if (LJZL.itemView.getParent() != null) {
                                boolean z = true;
                                try {
                                    SettingsManager.LIZLLL().getClass();
                                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                                } catch (Exception unused) {
                                }
                                if (z) {
                                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                                    stringBuffer.append(LJZL.getClass().getName());
                                    stringBuffer.append(" parent ");
                                    stringBuffer.append(viewGroup.getClass().getName());
                                    stringBuffer.append(" viewType ");
                                    stringBuffer.append(i);
                                    C78983UzD.LJIILL(stringBuffer.toString());
                                    ViewGroup viewGroup2 = (ViewGroup) LJZL.itemView.getParent();
                                    if (viewGroup2 != null) {
                                        C16880lQ.LJLLL(LJZL.itemView, viewGroup2);
                                    }
                                }
                            }
                        } catch (Exception e) {
                            C78946Uyc.LIZIZ(e);
                            C36922EeM.LIZ(e);
                        }
                        C29127Bbv.LIZ = LJZL.getClass().getName();
                        return LJZL;
                    }
                };
            } else {
                abstractC93453ld = new C93433lb() { // from class: X.3lW
                    @Override // X.C93433lb, X.AbstractC93453ld
                    public final C93423la LJZL(int i, ViewGroup parent) {
                        int i2;
                        o.LJIIIZ(parent, "parent");
                        LayoutInflater LLZIL = C16880lQ.LLZIL(parent.getContext());
                        if (i == 0) {
                            i2 = R.layout.b5a;
                        } else {
                            i2 = R.layout.b5c;
                        }
                        View LLLLIILL = C16880lQ.LLLLIILL(LLZIL, i2, parent, false);
                        o.LJIIIIZZ(LLLLIILL, "from(parent.context).inf…           parent, false)");
                        return new C93403lY(this, LLLLIILL);
                    }

                    @Override // X.C93433lb, X.AbstractC93453ld, X.AbstractC029409q
                    /* renamed from: onCreateViewHolder */
                    public final C93423la com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
                        C93423la LJZL = LJZL(i, viewGroup);
                        C0AX.LIZ(viewGroup, LJZL.itemView, R.id.lj7);
                        View view = LJZL.itemView;
                        if (view != null) {
                            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
                        }
                        try {
                            if (LJZL.itemView.getParent() != null) {
                                boolean z = true;
                                try {
                                    SettingsManager.LIZLLL().getClass();
                                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                                } catch (Exception unused) {
                                }
                                if (z) {
                                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                                    stringBuffer.append(LJZL.getClass().getName());
                                    stringBuffer.append(" parent ");
                                    stringBuffer.append(viewGroup.getClass().getName());
                                    stringBuffer.append(" viewType ");
                                    stringBuffer.append(i);
                                    C78983UzD.LJIILL(stringBuffer.toString());
                                    ViewGroup viewGroup2 = (ViewGroup) LJZL.itemView.getParent();
                                    if (viewGroup2 != null) {
                                        C16880lQ.LJLLL(LJZL.itemView, viewGroup2);
                                    }
                                }
                            }
                        } catch (Exception e) {
                            C78946Uyc.LIZIZ(e);
                            C36922EeM.LIZ(e);
                        }
                        C29127Bbv.LIZ = LJZL.getClass().getName();
                        return LJZL;
                    }
                };
            }
        } else {
            abstractC93453ld = new AbstractC93453ld() { // from class: X.3lK
                @Override // X.AbstractC93453ld
                public final String LJLLLLLL(IMContact contact) {
                    o.LJIIIZ(contact, "contact");
                    IMUser LIZ = C81573Ib.LIZ(contact);
                    if (LIZ != null) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append('@');
                        LIZ2.append(LIZ.getUniqueId());
                        return X1D.LIZIZ(LIZ2);
                    }
                    return null;
                }
            };
        }
        this.LJLLJ = abstractC93453ld;
        abstractC93453ld.LJLJLLL = new ARunnableS37S0100000_1(this, UserLevelGeckoUpdateSetting.DEFAULT);
        abstractC93453ld.LJLL = this.LJLLLL;
        abstractC93453ld.LJLILLLLZI = C3RJ.LIZ(this.LJLJI);
        RecyclerView recyclerView = this.LJLL;
        if (recyclerView == null) {
            return;
        }
        recyclerView.setAdapter(this.LJLLJ);
    }

    public final boolean LIZ(IMContact iMContact) {
        boolean z;
        String str;
        Bundle bundle;
        Integer valueOf;
        if (iMContact instanceof IMConversation) {
            return true;
        }
        IMUser LIZ = C81573Ib.LIZ(iMContact);
        if (LIZ == null) {
            return false;
        }
        if (!TextUtils.equals(LIZ.getUid(), C80763Ey.LIZ(false)) && LIZ.getFollowStatus() != 2) {
            SharePackage sharePackage = this.LJLJI;
            String str2 = null;
            if (sharePackage == null || (bundle = sharePackage.extras) == null || (valueOf = Integer.valueOf(bundle.getInt("aweme_type"))) == null || (valueOf.intValue() != 501 && valueOf.intValue() != 502)) {
                z = false;
            } else {
                z = true;
            }
            SharePackage sharePackage2 = this.LJLJI;
            if (sharePackage2 != null) {
                str = sharePackage2.itemType;
            } else {
                str = null;
            }
            boolean equals = TextUtils.equals(str, "gif");
            SharePackage sharePackage3 = this.LJLJI;
            if (sharePackage3 != null) {
                str2 = sharePackage3.itemType;
            }
            if (TextUtils.equals(str2, "pic")) {
                RecyclerView recyclerView = this.LJLL;
                if (recyclerView != null) {
                    C26045AKb c26045AKb = new C26045AKb(recyclerView);
                    c26045AKb.LJIIIIZZ(R.string.h7r);
                    c26045AKb.LJIIJ();
                }
                return false;
            }
            if (equals && z) {
                RecyclerView recyclerView2 = this.LJLL;
                if (recyclerView2 != null) {
                    C26045AKb c26045AKb2 = new C26045AKb(recyclerView2);
                    c26045AKb2.LJIIIIZZ(R.string.h5o);
                    c26045AKb2.LJIIJ();
                }
                return false;
            }
        }
        return true;
    }

    public final void LJ(IMContact iMContact) {
        String str;
        if (this.LJLJJI == null) {
            str = "chat_list";
        } else {
            str = "chat_forward";
        }
        C4KZ.LIZLLL(this.LJLJI, iMContact, false, str, 112);
        if (iMContact instanceof IMUser) {
            String uid = ((IMUser) iMContact).getUid();
            Long valueOf = CastLongProtector.valueOf(uid);
            o.LJIIIIZZ(valueOf, "valueOf(uid)");
            String LIZIZ = C81273Gx.LIZIZ(valueOf.longValue());
            o.LJIIIIZZ(uid, "uid");
            LIZLLL(LIZIZ, uid);
            return;
        }
        if (!(iMContact instanceof IMConversation)) {
            return;
        }
        String conversationId = ((IMConversation) iMContact).getConversationId();
        o.LJIIIIZZ(conversationId, "contact.conversationId");
        LIZLLL(conversationId, "");
    }

    public void LJFF(List<? extends IMContact> contactList) {
        o.LJIIIZ(contactList, "contactList");
        if (C73340SqO.LJJIJ(this.LJLIL)) {
            this.LJLJJLL = false;
            AbstractC93453ld abstractC93453ld = this.LJLLJ;
            if (abstractC93453ld != null) {
                abstractC93453ld.LL(contactList);
            }
            LJIIJJI();
        }
    }

    public final void LIZLLL(String str, String str2) {
        SharePackage generateSharePackage;
        BaseContent baseContent = this.LJLJJI;
        if (baseContent != null && (generateSharePackage = baseContent.generateSharePackage()) != null) {
            String LJIIIZ = C106674Gp.LJIIIZ(generateSharePackage.itemType);
            if (!TextUtils.isEmpty(LJIIIZ)) {
                String LIZ = C80763Ey.LIZ(false);
                LIZ.toString();
                C85323Wm LIZJ = C05040Hs.LIZJ(LIZ, "fromUserId", "onEventV3");
                C1HQ LIZJ2 = HXX.LIZJ("message_category", LJIIIZ, "to_user_id", str2);
                LIZJ2.put("conversation_id", str);
                LIZJ2.put("from_user_id", LIZ);
                LIZJ.LIZIZ("message_forward", LIZJ2);
            }
        }
    }

    public void LJII(CharSequence keywords, List contactList) {
        o.LJIIIZ(contactList, "contactList");
        o.LJIIIZ(keywords, "keywords");
        if (C73340SqO.LJJIJ(this.LJLIL)) {
            this.LJLJJLL = true;
            AbstractC93453ld abstractC93453ld = this.LJLLJ;
            if (abstractC93453ld != null) {
                abstractC93453ld.LJLIL = 1;
                abstractC93453ld.LJLJJL = keywords.toString();
                ((ArrayList) abstractC93453ld.LJLJI).clear();
                ((ArrayList) abstractC93453ld.LJLJI).addAll(contactList);
                abstractC93453ld.notifyDataSetChanged();
            }
            LJIIJJI();
        }
    }

    public final void LJIIJ(String str, List list) {
        BaseContent baseContent = this.LJLJJI;
        if (baseContent == null) {
            baseContent = C107274Ix.LIZ(this.LJLJI);
        }
        SharePackage sharePackage = this.LJLJI;
        if (sharePackage == null) {
            return;
        }
        C101243yC.LIZJ(sharePackage, str, list, null, baseContent, this.LJLJJL, null, 64);
        if (C73340SqO.LJJIJ(this.LJLIL)) {
            this.LJLIL.finish();
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View v, MotionEvent event) {
        String str;
        o.LJIIIZ(v, "v");
        o.LJIIIZ(event, "event");
        if (o.LJ(v, this.LJLJL) && event.getAction() == 1) {
            if (this.LJLJJI != null) {
                str = "forward";
            } else if (this.LJLJI != null) {
                str = "share";
            } else {
                str = "contact";
            }
            C93363lU.LIZJ(str);
            return false;
        }
        return false;
    }

    public ViewOnTouchListenerC93253lJ(ActivityC45651qj activityC45651qj, View view, boolean z) {
        C101043xs c101043xs;
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = view;
        LIZJ();
        if (this.LJLLL == null) {
            this.LJLLL = new ACListenerS21S0100000_1(this, 243);
        }
        if (this.LJLLILLLL == null) {
            this.LJLLILLLL = new IDObjectS174S0100000_1(this, 9);
        }
        if (this.LJLLLL == null) {
            this.LJLLLL = new C93293lN(this);
        }
        C101043xs c101043xs2 = this.LJLLI;
        if (c101043xs2 != null) {
            c101043xs2.setOnTitlebarClickListener(new InterfaceC101063xu() { // from class: X.3lM
                @Override // X.InterfaceC101063xu
                public final void LIZ() {
                }

                @Override // X.InterfaceC101063xu
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC101063xu
                public final void LIZJ(int i) {
                }

                @Override // X.InterfaceC101063xu
                public final void LIZLLL() {
                }

                @Override // X.InterfaceC101063xu
                public final void LJ() {
                    ViewOnTouchListenerC93253lJ viewOnTouchListenerC93253lJ = ViewOnTouchListenerC93253lJ.this;
                    EditText editText = viewOnTouchListenerC93253lJ.LJLJL;
                    if (editText != null) {
                        AYA.LIZ(viewOnTouchListenerC93253lJ.LJLIL, editText);
                    }
                    ViewOnTouchListenerC93253lJ.this.LJLIL.finish();
                }
            });
        }
        ImageView imageView = this.LJLJLJ;
        if (imageView != null) {
            C16880lQ.LJIILLIIL(imageView, this.LJLLL);
        }
        final EditText editText = this.LJLJL;
        if (editText != null) {
            editText.addTextChangedListener(this.LJLLILLLL);
            editText.setOnKeyListener(new View.OnKeyListener() { // from class: X.3lR
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view2, int i, KeyEvent keyEvent) {
                    if (i == 66) {
                        AYA.LIZ(ViewOnTouchListenerC93253lJ.this.LJLIL, editText);
                        return true;
                    }
                    return false;
                }
            });
            editText.setOnTouchListener(this);
        }
        LIZIZ();
        if (!z || (c101043xs = this.LJLLI) == null) {
            return;
        }
        c101043xs.setVisibility(8);
    }
}
