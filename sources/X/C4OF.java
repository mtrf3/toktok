package X;

import Y.AObserverS69S0100000_1;
import Y.ARunnableS37S0100000_1;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageEventParcel;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelAndroidViewModel;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.sdk.share.viewmodel.SharePanelImHeadViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.core.ui.SkeletonSharePanelFragment;
import com.ss.android.ugc.aweme.share.improve.pkg.CommentSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.social.model.MAFIMUser;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AqS58S0110000_1;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.4OF, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4OF extends FrameLayout implements InterfaceC108594Nz {
    public SharePackage LJLIL;
    public List<? extends InterfaceC62225ObV> LJLILLLLZI;
    public SharePanelImHeadViewModel LJLJI;
    public C4ZZ LJLJJI;
    public C108484No LJLJJL;
    public C4OT LJLJJLL;
    public Fragment LJLJL;
    public boolean LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public InterfaceC108504Nq LJLLI;
    public boolean LJLLILLLL;
    public final java.util.Map<Integer, View> LJLLJ;

    @Override // X.InterfaceC108594Nz
    public final void Hq0(boolean z) {
    }

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLLJ;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC108594Nz
    public final void YX(boolean z) {
    }

    private final int getMargin16() {
        return ((Number) this.LJLL.getValue()).intValue();
    }

    private final int getMargin8() {
        return ((Number) this.LJLJLLL.getValue()).intValue();
    }

    public final void LJII() {
        SharePanelViewModel sharePanelViewModel;
        boolean z;
        String LIZIZ;
        SharePanelImHeadViewModel sharePanelImHeadViewModel = this.LJLJI;
        if (sharePanelImHeadViewModel == null || (sharePanelViewModel = sharePanelImHeadViewModel.LJLZ) == null || sharePanelViewModel.LLFF) {
            return;
        }
        if (sharePanelViewModel.LJIIIIZZ().isEmpty() && !this.LJLJLJ) {
            LIZ(R.id.jo0).setVisibility(8);
            return;
        }
        LIZ(R.id.jo0).setVisibility(0);
        SY4 sy4 = (SY4) LIZ(R.id.jo0);
        if (sharePanelViewModel.LJIIIIZZ().size() != 0) {
            z = true;
        } else {
            z = false;
        }
        sy4.setEnabled(z);
        TextView textView = (TextView) LIZ(R.id.jo0);
        C108484No c108484No = this.LJLJJL;
        if (c108484No != null && c108484No.LJ) {
            LIZIZ = LIZ(R.id.jo0).getResources().getString(R.string.gym);
        } else if (sharePanelViewModel.LJIIIIZZ().size() <= 1) {
            LIZIZ = LIZ(R.id.jo0).getResources().getString(R.string.h96);
        } else {
            C108484No c108484No2 = this.LJLJJL;
            if (c108484No2 != null && c108484No2.LJIIIZ) {
                LIZIZ = getContext().getString(R.string.gvb);
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(LIZ(R.id.jo0).getResources().getString(R.string.qib));
                LIZ.append('(');
                LIZ.append(sharePanelViewModel.LJIIIIZZ().size());
                LIZ.append(')');
                LIZIZ = X1D.LIZIZ(LIZ);
            }
        }
        textView.setText(LIZIZ);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        boolean z;
        View view;
        super.onAttachedToWindow();
        SharePackage sharePackage = this.LJLIL;
        if (sharePackage != null && !sharePackage.LJIIJ()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            InterfaceC111514Zf interfaceC111514Zf = new InterfaceC111514Zf() { // from class: X.4Ob
                @Override // X.InterfaceC111514Zf
                public final void LIZ(int i, String emojiText) {
                    o.LJIIIZ(emojiText, "emojiText");
                    C107234It.LJ(C4OF.this.LJLIL, i, emojiText);
                }
            };
            EditText multi_share_et = (EditText) LIZ(R.id.gpk);
            o.LJIIIIZZ(multi_share_et, "multi_share_et");
            ViewGroup share_mini_emoji_container = (ViewGroup) LIZ(R.id.jtr);
            o.LJIIIIZZ(share_mini_emoji_container, "share_mini_emoji_container");
            this.LJLJJI = new C4ZZ(multi_share_et, interfaceC111514Zf, share_mini_emoji_container);
            ViewGroup viewGroup = (ViewGroup) LIZ(R.id.jtr);
            C4ZZ c4zz = this.LJLJJI;
            if (c4zz != null) {
                view = c4zz.LJI.LJLIL;
            } else {
                view = null;
            }
            viewGroup.addView(view);
        }
        SharePanelImHeadViewModel sharePanelImHeadViewModel = this.LJLJI;
        if (sharePanelImHeadViewModel != null) {
            MutableLiveData<java.util.Set<IMContact>> mutableLiveData = sharePanelImHeadViewModel.LJLJLLL;
            Fragment fragment = this.LJLJL;
            if (fragment != null) {
                mutableLiveData.observe(fragment, new AObserverS69S0100000_1(this, 168));
                MutableLiveData<OSZ<IMContact, Boolean>> mutableLiveData2 = sharePanelImHeadViewModel.LJLLILLLL;
                Fragment fragment2 = this.LJLJL;
                if (fragment2 != null) {
                    mutableLiveData2.observe(fragment2, new AObserverS69S0100000_1(this, 157));
                    return;
                } else {
                    o.LJIJI("hostFragment");
                    throw null;
                }
            }
            o.LJIJI("hostFragment");
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC108504Nq interfaceC108504Nq = this.LJLLI;
        if (interfaceC108504Nq != null && interfaceC108504Nq.isShowing()) {
            interfaceC108504Nq.destroy();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4OF(C25600zU context) {
        super(context, null, 0);
        o.LJIIIZ(context, "context");
        this.LJLLJ = new LinkedHashMap();
        this.LJLJLLL = C221108m2.LIZIZ(C108714Ol.LJLIL);
        this.LJLL = C221108m2.LIZIZ(C108704Ok.LJLIL);
        View.inflate(getContext(), R.layout.b_3, this);
        if (C99W.LIZ) {
            ((C62846OlW) LIZ(R.id.gpj)).setCornerRadius(C32151Nz.LJIIZILJ(4));
        }
        LJIIIIZZ(false);
        LIZ(R.id.gpk).setOnTouchListener(new View.OnTouchListener() { // from class: X.4Oh
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                return false;
            }
        });
    }

    public final void LIZIZ(List<IMContact> list) {
        String str;
        SharePackage sharePackage;
        Bundle bundle;
        String str2;
        String str3;
        String str4;
        SendMessageTemplateTask sendMessageTemplateTask;
        SendMessageEventParcel sendMessageEventParcel;
        Bundle bundle2;
        boolean z;
        Boolean bool;
        SharePackage sharePackage2 = this.LJLIL;
        String str5 = null;
        if (sharePackage2 != null) {
            sharePackage2.extras.putInt("friends_shared_cnt", C1DH.LJIILLIIL(list));
            int size = list.size();
            View create_group_button = LIZ(R.id.byv);
            o.LJIIIIZZ(create_group_button, "create_group_button");
            if (create_group_button.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            C108484No c108484No = this.LJLJJL;
            if (c108484No != null) {
                bool = Boolean.valueOf(c108484No.LJIIL);
            } else {
                bool = null;
            }
            C107234It.LJIIL(sharePackage2, null, size, valueOf, bool, 32);
        }
        KeyboardUtils.LIZIZ(LIZ(R.id.gpk));
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
        String LIZIZ2 = C58314Muc.LIZIZ(arrayList3.toString(), 1, 1, "this as java.lang.String…ing(startIndex, endIndex)");
        int size2 = arrayList.size();
        int size3 = list.size() - size2;
        SharePackage sharePackage3 = this.LJLIL;
        if (sharePackage3 != null && (bundle2 = sharePackage3.extras) != null) {
            bundle2.putString("shareIdList", LIZIZ);
            bundle2.putStringArray("shared_users_id_list", (String[]) arrayList2.toArray(new String[0]));
            bundle2.putString("conversationIdList", LIZIZ2);
            bundle2.putStringArray("shared_conversation_id_list", (String[]) arrayList4.toArray(new String[0]));
            bundle2.putInt("chat_cnt", size2);
            bundle2.putInt("group_chat_cnt", size3);
        }
        this.LJLLILLLL = true;
        String str6 = "";
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
            if (str.length() > 0 && (sharePackage = this.LJLIL) != null && (bundle = sharePackage.extras) != null) {
                bundle.putString("rec_map", str);
            }
        }
        SharePackage sharePackage4 = this.LJLIL;
        if (sharePackage4 != null) {
            SendMessageTemplateTask sendMessageTemplateTask2 = sharePackage4.sendMessageTemplateTask;
            if (sendMessageTemplateTask2 != null) {
                str2 = sendMessageTemplateTask2.scene;
            } else {
                str2 = null;
            }
            boolean LJ = o.LJ(str2, "ai_avatar");
            if (LJ && (sendMessageTemplateTask = sharePackage4.sendMessageTemplateTask) != null && (sendMessageEventParcel = sendMessageTemplateTask.sendMessageEventParcel) != null) {
                sendMessageEventParcel.enterMethod = "icon";
            }
            Editable text = ((C19K) LIZ(R.id.gpk)).getText();
            if (text != null) {
                str3 = text.toString();
            } else {
                str3 = null;
            }
            C4OT c4ot = this.LJLJJLL;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String string = sharePackage4.extras.getString("video_sticker_status");
            if (string == null) {
                string = "";
            }
            linkedHashMap.put("video_sticker_status", string);
            String string2 = sharePackage4.extras.getString("from_group_id");
            if (string2 == null) {
                string2 = "";
            }
            linkedHashMap.put("from_group_id", string2);
            String string3 = sharePackage4.extras.getString("author_id");
            if (string3 == null) {
                string3 = "";
            }
            linkedHashMap.put("author_id", string3);
            String string4 = sharePackage4.extras.getString("story_music_with_mute");
            if (string4 != null) {
                str6 = string4;
            }
            linkedHashMap.put("story_music_with_mute", str6);
            C101243yC.LIZJ(sharePackage4, str3, list, c4ot, null, null, linkedHashMap, 48);
            if (LJ) {
                C85323Wm onEventV3 = C772831o.LIZ();
                o.LJIIIZ(onEventV3, "onEventV3");
                for (IMContact iMContact4 : list) {
                    C1HQ LIZIZ3 = C48339Iy7.LIZIZ("action_type", "send_to_chat");
                    C107234It.LIZIZ(LIZIZ3, iMContact4);
                    onEventV3.LIZIZ("ai_avatar_save_finish_page", LIZIZ3);
                }
            } else {
                Editable text2 = ((C19K) LIZ(R.id.gpk)).getText();
                if (text2 != null) {
                    str4 = text2.toString();
                } else {
                    str4 = null;
                }
                LIZJ(sharePackage4, str4, list);
            }
            if (o.LJ("live_event", sharePackage4.itemType)) {
                Iterator<IMContact> it3 = list.iterator();
                while (it3.hasNext()) {
                    C4KZ.LJI(sharePackage4, it3.next());
                }
            }
            if (o.LJ(sharePackage4.itemType, "comment")) {
                C3Y4.LJ("enter_from", "comment_panel");
            }
            if (o.LJ(sharePackage4.itemType, "product")) {
                Editable text3 = ((C19K) LIZ(R.id.gpk)).getText();
                if (text3 != null) {
                    str5 = text3.toString();
                }
                C107184Io.LJIIIZ(sharePackage4, str5, list);
            }
        }
    }

    public final void LIZLLL(boolean z) {
        SharePanelImHeadViewModel sharePanelImHeadViewModel = this.LJLJI;
        if (sharePanelImHeadViewModel != null) {
            SharePanelViewModel sharePanelViewModel = sharePanelImHeadViewModel.LJLZ;
            if (sharePanelViewModel != null) {
                sharePanelViewModel.LLFF = z;
            }
            if (sharePanelImHeadViewModel != null) {
                sharePanelImHeadViewModel.LJLLI.setValue(Boolean.TRUE);
            }
        }
        ((SY4) LIZ(R.id.jo0)).setLoading(z);
        if (z) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            Integer LJI = C79045V0n.LJI(R.attr.eb, context);
            if (LJI != null) {
                LIZ(R.id.jo0).setBackgroundColor(LJI.intValue());
                return;
            }
            return;
        }
        C108484No c108484No = this.LJLJJL;
        if (c108484No != null) {
            c108484No.LJIIJ = false;
        }
        ((AppCompatTextView) LIZ(R.id.jo0)).setBackgroundResource(R.drawable.bh9);
        LJII();
    }

    public final void LJI(java.util.Set<IMContact> selectedList) {
        boolean z;
        LiveData liveData;
        o.LJIIIZ(selectedList, "selectedList");
        Fragment fragment = this.LJLJL;
        ViewModel viewModel = null;
        if (fragment != null) {
            SkeletonSharePanelFragment skeletonSharePanelFragment = (SkeletonSharePanelFragment) fragment;
            boolean z2 = true;
            if (selectedList.isEmpty() && !this.LJLJLJ) {
                SharePanelImHeadViewModel sharePanelImHeadViewModel = this.LJLJI;
                if (sharePanelImHeadViewModel != null) {
                    sharePanelImHeadViewModel.LJLLJ.setValue(Boolean.FALSE);
                }
                LIZ(R.id.jtr).setVisibility(8);
                skeletonSharePanelFragment.Ml(8);
                KeyboardUtils.LIZIZ(LIZ(R.id.gpk));
            } else {
                SharePanelImHeadViewModel sharePanelImHeadViewModel2 = this.LJLJI;
                if (sharePanelImHeadViewModel2 != null) {
                    sharePanelImHeadViewModel2.LJLLJ.setValue(Boolean.TRUE);
                }
                skeletonSharePanelFragment.Ml(0);
                LIZ(R.id.coz).setVisibility(0);
                LIZ(R.id.jo0).setVisibility(0);
                SY4 sy4 = (SY4) LIZ(R.id.jo0);
                if (selectedList.size() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                sy4.setEnabled(z);
                C4ZZ c4zz = this.LJLJJI;
                if (c4zz != null) {
                    C107234It.LJFF(this.LJLIL, c4zz.LJFF);
                }
                C4JW.LJIJJ((C62846OlW) LIZ(R.id.gpj), (TuxIconView) LIZ(R.id.gpl), this.LJLIL, Boolean.FALSE);
                SharePackage sharePackage = this.LJLIL;
                if (sharePackage != null) {
                    View edit_layout = LIZ(R.id.coz);
                    o.LJIIIIZZ(edit_layout, "edit_layout");
                    C4OI.LIZ(sharePackage, edit_layout);
                }
                LIZ(R.id.jtr).setVisibility(0);
            }
            Context context = getContext();
            if (context instanceof ActivityC45651qj) {
                viewModel = ViewModelProviders.of((ActivityC45651qj) context).get(SharePanelAndroidViewModel.class);
            }
            SharePanelAndroidViewModel sharePanelAndroidViewModel = (SharePanelAndroidViewModel) viewModel;
            if (sharePanelAndroidViewModel == null || (liveData = (LiveData) sharePanelAndroidViewModel.LJLIL.getValue()) == null) {
                return;
            }
            if (LIZ(R.id.coz).getVisibility() != 0) {
                z2 = false;
            }
            liveData.setValue(Boolean.valueOf(z2));
            return;
        }
        o.LJIJI("hostFragment");
        throw null;
    }

    public final void LJIIIIZZ(boolean z) {
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        Integer LJI = C79045V0n.LJI(R.attr.cl, context);
        if (LJI != null) {
            LIZ(R.id.g3y).setBackgroundColor(LJI.intValue());
        }
        ViewGroup.LayoutParams layoutParams = LIZ(R.id.g3y).getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.leftMargin = getMargin8();
        layoutParams2.rightMargin = getMargin8();
        if (z) {
            layoutParams2.topMargin = getMargin8();
            layoutParams2.bottomMargin = getMargin16();
            LIZ(R.id.jo0).getClass();
        }
        LIZ(R.id.g3y).setLayoutParams(layoutParams2);
        LIZ(R.id.g3y).setBackgroundResource(R.drawable.bhu);
        ViewGroup.LayoutParams layoutParams3 = LIZ(R.id.jtr).getLayoutParams();
        o.LJII(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
        layoutParams4.leftMargin = getMargin8();
        layoutParams4.rightMargin = getMargin8();
        LIZ(R.id.jtr).setLayoutParams(layoutParams4);
    }

    @Override // X.InterfaceC108594Nz
    public final void gD(boolean z) {
        SharePanelImHeadViewModel sharePanelImHeadViewModel = this.LJLJI;
        if (sharePanelImHeadViewModel != null) {
            SharePanelViewModel sharePanelViewModel = sharePanelImHeadViewModel.LJLZ;
            if (sharePanelViewModel != null) {
                sharePanelViewModel.LLD = z;
            }
            sharePanelImHeadViewModel.LJLLI.setValue(Boolean.TRUE);
        }
        LJII();
    }

    @Override // X.InterfaceC108594Nz
    public final void ua(boolean z) {
        SharePanelViewModel sharePanelViewModel;
        if (z) {
            LJII();
        }
        SharePanelImHeadViewModel sharePanelImHeadViewModel = this.LJLJI;
        if (sharePanelImHeadViewModel == null || (sharePanelViewModel = sharePanelImHeadViewModel.LJLZ) == null) {
            return;
        }
        sharePanelViewModel.LLF = z;
    }

    public final void LJFF(List<? extends User> list, boolean z) {
        String str;
        Bundle bundle;
        InterfaceC108504Nq interfaceC108504Nq = this.LJLLI;
        AqS58S0110000_1 aqS58S0110000_1 = new AqS58S0110000_1(z, this, 9);
        if (interfaceC108504Nq != null) {
            interfaceC108504Nq.LIZJ(list);
            interfaceC108504Nq.LIZIZ(aqS58S0110000_1);
        } else {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
            SharePackage sharePackage = this.LJLIL;
            if (sharePackage == null || (bundle = sharePackage.extras) == null || (str = bundle.getString("enter_from")) == null) {
                str = "";
            }
            interfaceC108504Nq = C108534Nt.LIZIZ.LIZ.LIZ(new C87693cL(LJJIFFI, str));
            interfaceC108504Nq.LIZJ(list);
            interfaceC108504Nq.LIZIZ(aqS58S0110000_1);
            interfaceC108504Nq.LIZ(new C4OJ(this, interfaceC108504Nq));
            this.LJLLI = interfaceC108504Nq;
        }
        interfaceC108504Nq.show();
    }

    public static final void LIZJ(SharePackage sharePackage, String str, List<? extends IMContact> list) {
        String uid;
        C57428MgK.LJFF(sharePackage, str, ORZ.LLJILJILJ(list), 0, 56);
        if (o.LJ(sharePackage.itemType, "aweme") || o.LJ(sharePackage.itemType, "aweme_photo")) {
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

    public final void LJ(C62387Oe7 sharePanelConfig, Fragment hostFragment, InterfaceC108744Oo interfaceC108744Oo) {
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        String cid;
        User user;
        User user2;
        o.LJIIIZ(sharePanelConfig, "sharePanelConfig");
        o.LJIIIZ(hostFragment, "hostFragment");
        boolean z2 = false;
        this.LJLLILLLL = false;
        BaseSharePackage baseSharePackage = sharePanelConfig.LJIIJ;
        o.LJII(baseSharePackage, "null cannot be cast to non-null type com.ss.android.ugc.aweme.sharer.model.SharePackage");
        SharePackage sharePackage = (SharePackage) baseSharePackage;
        this.LJLIL = sharePackage;
        this.LJLILLLLZI = sharePanelConfig.LIZ;
        this.LJLJL = hostFragment;
        this.LJLJJLL = interfaceC108744Oo;
        Bundle bundle = sharePackage.extras;
        if (bundle != null) {
            z = bundle.getBoolean("comment_direct_share");
        } else {
            z = false;
        }
        this.LJLJLJ = z;
        SharePackage sharePackage2 = this.LJLIL;
        UrlModel urlModel = null;
        if (sharePackage2 != null) {
            List<? extends InterfaceC62225ObV> list = this.LJLILLLLZI;
            if (list != null) {
                SharePanelImHeadViewModel sharePanelImHeadViewModel = (SharePanelImHeadViewModel) new ViewModelProvider(hostFragment, new C4OM(sharePackage2, list, interfaceC108744Oo, null)).get(SharePanelImHeadViewModel.class);
                this.LJLJI = sharePanelImHeadViewModel;
                if (sharePanelImHeadViewModel != null) {
                    C48841JEv.LIZJ(sharePanelImHeadViewModel.LJLLLLLL, null);
                    sharePanelImHeadViewModel.iv0();
                }
            } else {
                o.LJIJI("channelList");
                throw null;
            }
        }
        if (this.LJLJLJ) {
            LJI(new LinkedHashSet());
        }
        SharePackage sharePackage3 = this.LJLIL;
        if (sharePackage3 != null) {
            str = sharePackage3.itemType;
        } else {
            str = null;
        }
        if (o.LJ(str, "comment")) {
            ((ImageView) LIZ(R.id.gpj)).setVisibility(8);
            LIZ(R.id.gpi).setVisibility(0);
            View LIZ = LIZ(R.id.gpi);
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZJ = C61328O5c.LIZJ(4);
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.cv);
            Context context = LIZ(R.id.gpi).getContext();
            o.LJIIIIZZ(context, "multi_share_comment_content.context");
            LIZ.setBackground(c110614Vt.LIZ(context));
            SharePackage sharePackage4 = this.LJLIL;
            o.LJII(sharePackage4, "null cannot be cast to non-null type com.ss.android.ugc.aweme.share.improve.pkg.CommentSharePackage");
            CommentSharePackage commentSharePackage = (CommentSharePackage) sharePackage4;
            Comment comment = commentSharePackage.comment;
            if (comment != null && (user2 = comment.getUser()) != null) {
                str2 = user2.getNickname();
            } else {
                str2 = null;
            }
            String str5 = "";
            if (str2 == null) {
                str2 = "";
            }
            Comment comment2 = commentSharePackage.comment;
            if (comment2 == null || (str3 = comment2.getText()) == null) {
                str3 = "";
            }
            Comment comment3 = commentSharePackage.comment;
            if (comment3 == null || (str4 = comment3.getReplyToUserName()) == null) {
                str4 = "";
            }
            Comment comment4 = commentSharePackage.comment;
            if (comment4 != null && (user = comment4.getUser()) != null) {
                urlModel = user.getAvatarThumb();
            }
            Comment comment5 = commentSharePackage.comment;
            if (comment5 != null) {
                i = comment5.getCommentMediaType();
            } else {
                i = 0;
            }
            if (str2.length() == 0 || str3.length() == 0 || urlModel == null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Share data error, [");
                Comment comment6 = commentSharePackage.comment;
                if (comment6 != null && (cid = comment6.getCid()) != null) {
                    str5 = cid;
                }
                YE1.LIZLLL(LIZ2, str5, "] creatorName:", str2, " comment:");
                LIZ2.append(str3);
                LIZ2.append(" avatarIsNull:");
                if (urlModel == null) {
                    z2 = true;
                }
                LIZ2.append(z2);
                C34B.LIZJ("SharePanelOperationLayout", X1D.LIZIZ(LIZ2));
            }
            Bitmap decodeResource = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.bia);
            o.LJIIIIZZ(decodeResource, "decodeResource(context.r…ble.im_ic_avatar_default)");
            C119414mP c119414mP = CommentSharePackage.Companion;
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
            c119414mP.getClass();
            ((TextView) LIZ(R.id.gpi)).setText(C119414mP.LIZ(context2, str2, str4, str3, decodeResource, LJJIIZ, i));
            W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
            LJII.LIZJ = getContext();
            LJII.LIZIZ("CommentShare");
            final String str6 = str2;
            final String str7 = str4;
            final String str8 = str3;
            final int i2 = i;
            LJII.LJIIIZ(new AbstractC85293Wj() { // from class: X.4OK
                @Override // X.InterfaceC78660Uu0
                public final void onFailed(Throwable th) {
                }

                @Override // X.InterfaceC78660Uu0
                public final void LIZIZ(Bitmap bitmap) {
                    C119414mP c119414mP2 = CommentSharePackage.Companion;
                    Context context3 = C4OF.this.getContext();
                    o.LJIIIIZZ(context3, "context");
                    String str9 = str6;
                    String str10 = str7;
                    String str11 = str8;
                    int LIZIZ = C7MY.LIZIZ(16);
                    int i3 = i2;
                    c119414mP2.getClass();
                    ((TextView) C4OF.this.LIZ(R.id.gpi)).setText(C119414mP.LIZ(context3, str9, str10, str11, bitmap, LIZIZ, i3));
                }
            });
        } else if (o.LJ(str, "aigc_avatar")) {
            LJIIIIZZ(true);
        }
        post(new ARunnableS37S0100000_1(this, 164));
    }
}
