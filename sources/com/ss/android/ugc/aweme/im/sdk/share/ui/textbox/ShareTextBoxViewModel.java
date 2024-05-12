package com.ss.android.ugc.aweme.im.sdk.share.ui.textbox;

import X.C101203y8;
import X.C101243yC;
import X.C107274Ix;
import X.C108434Nj;
import X.C108454Nl;
import X.C108484No;
import X.C108544Nu;
import X.C1DH;
import X.C3UE;
import X.C4J3;
import X.C4NG;
import X.C4NQ;
import X.C4OT;
import X.C61878OQg;
import X.C84283Sm;
import X.C87277YNd;
import X.C90643h6;
import X.InterfaceC108394Nf;
import X.InterfaceC108594Nz;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageEventParcel;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.ShareTextBoxViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.social.model.MAFIMUser;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ShareTextBoxViewModel extends ViewModel implements InterfaceC108594Nz {
    public final SharePackage LJLIL;
    public final C4NQ LJLILLLLZI;
    public final C4OT LJLJI;
    public final InterfaceC108594Nz LJLJJI;
    public final MutableLiveData<Boolean> LJLJJL;
    public final C108434Nj LJLJJLL;
    public final C108484No LJLJL;
    public final MutableLiveData<Integer> LJLJLJ;
    public final MutableLiveData LJLJLLL;
    public final MutableLiveData<C108454Nl> LJLL;
    public final MutableLiveData LJLLI;
    public final MutableLiveData<C108544Nu> LJLLILLLL;
    public final MutableLiveData LJLLJ;
    public final MutableLiveData<Float> LJLLL;
    public final MutableLiveData LJLLLL;
    public final MutableLiveData<Boolean> LJLLLLLL;
    public final MutableLiveData LJLZ;
    public final MutableLiveData<List<User>> LJZ;
    public final MutableLiveData LJZI;
    public final NextLiveData<Boolean> LJZL;
    public final NextLiveData LL;
    public List<? extends IMContact> LLD;

    public final void lv0() {
        C108484No c108484No = this.LJLJL;
        if (c108484No != null) {
            if (c108484No.LJ) {
                this.LJLLILLLL.postValue(new C108544Nu(R.string.gym, 0));
                return;
            } else if (c108484No.LJIIIZ) {
                this.LJLLILLLL.postValue(new C108544Nu(R.string.gvb, 0));
                return;
            }
        }
        if (this.LLD.size() <= 1) {
            this.LJLLILLLL.postValue(new C108544Nu(R.string.h96, 0));
        } else {
            this.LJLLILLLL.postValue(new C108544Nu(R.string.qib, this.LLD.size()));
        }
    }

    @Override // X.InterfaceC108594Nz
    public final void Hq0(boolean z) {
        InterfaceC108594Nz interfaceC108594Nz = this.LJLJJI;
        if (interfaceC108594Nz != null) {
            interfaceC108594Nz.Hq0(z);
        }
    }

    @Override // X.InterfaceC108594Nz
    public final void YX(boolean z) {
        InterfaceC108594Nz interfaceC108594Nz = this.LJLJJI;
        if (interfaceC108594Nz != null) {
            interfaceC108594Nz.YX(z);
        }
    }

    @Override // X.InterfaceC108594Nz
    public final void gD(boolean z) {
        lv0();
        InterfaceC108594Nz interfaceC108594Nz = this.LJLJJI;
        if (interfaceC108594Nz != null) {
            interfaceC108594Nz.gD(z);
        }
    }

    public final void gv0(List<? extends IMContact> list) {
        String str;
        if (C3UE.LIZ()) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (IMContact iMContact : list) {
                    if (iMContact instanceof MAFIMUser) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("relation_tag", String.valueOf(((MAFIMUser) iMContact).getFollowStatus()));
                        jSONObject2.put("rec_type", ((MAFIMUser) iMContact).getRecType());
                        jSONObject.put(((MAFIMUser) iMContact).getUid(), jSONObject2);
                    }
                }
                str = jSONObject.toString();
                o.LJIIIIZZ(str, "jsonObject.toString()");
            } catch (Exception unused) {
                str = "";
            }
            if (str.length() > 0) {
                this.LJLIL.extras.putString("rec_map", str);
            }
        }
    }

    public final void jv0(boolean z) {
        InterfaceC108594Nz interfaceC108594Nz = this.LJLJJI;
        if (interfaceC108594Nz != null) {
            interfaceC108594Nz.Hq0(z);
        }
        this.LJLLLLLL.setValue(Boolean.valueOf(z));
        if (!z) {
            C108484No c108484No = this.LJLJL;
            if (c108484No != null) {
                c108484No.LJIIJ = false;
            }
            lv0();
        }
    }

    @Override // X.InterfaceC108594Nz
    public final void ua(boolean z) {
        if (z) {
            lv0();
        }
    }

    public final void iv0(final String str, final List list) {
        SharePackage sharePackage;
        SendMessageTemplateTask sendMessageTemplateTask;
        SendMessageEventParcel sendMessageEventParcel;
        this.LJLJJL.setValue(Boolean.TRUE);
        SharePackage sharePackage2 = this.LJLIL;
        final SendMessageTemplateTask sendMessageTemplateTask2 = sharePackage2.sendMessageTemplateTask;
        if (sendMessageTemplateTask2 == null) {
            return;
        }
        C87277YNd.LJJIJL(sharePackage2, list);
        kv0(C1DH.LJIILLIIL(list), this.LJLIL);
        if (o.LJ(this.LJLIL.itemType, "aigc_avatar") && (sendMessageTemplateTask = (sharePackage = this.LJLIL).sendMessageTemplateTask) != null && (sendMessageEventParcel = sendMessageTemplateTask.sendMessageEventParcel) != null) {
            String string = sharePackage.extras.getString("enter_method");
            if (string == null) {
                string = "";
            }
            sendMessageEventParcel.enterMethod = string;
        }
        C101203y8.LIZIZ.LIZ(list, sendMessageTemplateTask2, str, new InterfaceC108394Nf() { // from class: X.4NX
            @Override // X.InterfaceC108394Nf
            public final void LIZ(AbstractC108384Ne abstractC108384Ne) {
                ShareTextBoxViewModel shareTextBoxViewModel;
                C4NQ c4nq;
                Boolean bool;
                boolean z;
                if (abstractC108384Ne instanceof C108354Nb) {
                    ShareTextBoxViewModel shareTextBoxViewModel2 = ShareTextBoxViewModel.this;
                    C4NQ c4nq2 = shareTextBoxViewModel2.LJLILLLLZI;
                    if (c4nq2 != null) {
                        c4nq2.LIZ(shareTextBoxViewModel2.LJLIL);
                    }
                    if (C84283Sm.LJIIJ(ShareTextBoxViewModel.this.LJLIL)) {
                        C90643h6.LJIIIIZZ(list.size());
                        return;
                    }
                    return;
                }
                if (abstractC108384Ne instanceof C108364Nc) {
                    SharePackage sharePackage3 = ShareTextBoxViewModel.this.LJLIL;
                    int size = list.size();
                    SY4 sy4 = ShareTextBoxViewModel.this.LJLJJLL.LIZJ;
                    Boolean bool2 = null;
                    if (sy4 != null) {
                        if (sy4.getVisibility() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        bool = Boolean.valueOf(z);
                    } else {
                        bool = null;
                    }
                    C108484No c108484No = ShareTextBoxViewModel.this.LJLJL;
                    if (c108484No != null) {
                        bool2 = Boolean.valueOf(c108484No.LJIIL);
                    }
                    C107234It.LJIIL(sharePackage3, null, size, bool, bool2, 32);
                    ShareTextBoxViewModel shareTextBoxViewModel3 = ShareTextBoxViewModel.this;
                    C4NQ c4nq3 = shareTextBoxViewModel3.LJLILLLLZI;
                    if (c4nq3 != null) {
                        c4nq3.LIZJ(shareTextBoxViewModel3.LJLIL);
                    }
                    if (!o.LJ(sendMessageTemplateTask2.scene, "now_post")) {
                        return;
                    }
                    C57428MgK.LJFF(ShareTextBoxViewModel.this.LJLIL, str, ORZ.LLJILJILJ(list), 0, 56);
                    return;
                }
                if (!(abstractC108384Ne instanceof C108344Na) || (c4nq = (shareTextBoxViewModel = ShareTextBoxViewModel.this).LJLILLLLZI) == null) {
                    return;
                }
                c4nq.LIZIZ(shareTextBoxViewModel.LJLIL);
            }
        });
        C101243yC.LIZLLL(this.LJLIL, sendMessageTemplateTask2, list);
    }

    public final void kv0(int i, SharePackage sharePackage) {
        boolean z;
        C108484No c108484No = this.LJLJL;
        if (c108484No != null && c108484No.LJIIIZ) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            sharePackage.extras.putInt("is_create_group_chat", 1);
        } else {
            sharePackage.extras.putInt("is_create_group_chat", 0);
        }
        sharePackage.extras.putInt("friends_shared_cnt", i);
    }

    public final void hv0(final List<? extends IMContact> contactList, final String str, BaseContent baseContent, Map<String, String> map, Map<String, String> map2, boolean z) {
        o.LJIIIZ(contactList, "contactList");
        this.LJLJJL.setValue(Boolean.TRUE);
        final String uuid = UUID.randomUUID().toString();
        o.LJIIIIZZ(uuid, "randomUUID().toString()");
        C4NQ c4nq = this.LJLILLLLZI;
        if (c4nq != null) {
            c4nq.LIZ(this.LJLIL);
        }
        C87277YNd.LJJIJL(this.LJLIL, contactList);
        kv0(C1DH.LJIILLIIL(contactList), this.LJLIL);
        C4J3 c4j3 = new C4J3() { // from class: X.4NW
            @Override // X.C4J3
            public final void LIZIZ() {
                Boolean bool;
                Boolean bool2;
                String uid;
                boolean z2;
                ShareTextBoxViewModel shareTextBoxViewModel = ShareTextBoxViewModel.this;
                C4NQ c4nq2 = shareTextBoxViewModel.LJLILLLLZI;
                if (c4nq2 != null) {
                    c4nq2.LIZJ(shareTextBoxViewModel.LJLIL);
                }
                SharePackage sharePackage = ShareTextBoxViewModel.this.LJLIL;
                int size = contactList.size();
                SY4 sy4 = ShareTextBoxViewModel.this.LJLJJLL.LIZJ;
                if (sy4 != null) {
                    if (sy4.getVisibility() == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    bool = Boolean.valueOf(z2);
                } else {
                    bool = null;
                }
                C108484No c108484No = ShareTextBoxViewModel.this.LJLJL;
                if (c108484No != null) {
                    bool2 = Boolean.valueOf(c108484No.LJIIL);
                } else {
                    bool2 = null;
                }
                C107234It.LJIIL(sharePackage, null, size, bool, bool2, 32);
                C84943Va.LIZ().LIZIZ(contactList);
                C3VT.LIZIZ(ShareTextBoxViewModel.this.LJLIL, uuid, ORZ.LLJILJILJ(contactList));
                if (o.LJ(ShareTextBoxViewModel.this.LJLIL.itemType, "aweme")) {
                    List<IMContact> list = contactList;
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
                    C57428MgK.LJFF(ShareTextBoxViewModel.this.LJLIL, str, contactList, 0, 56);
                }
            }
        };
        gv0(contactList);
        C107274Ix.LJI(contactList, str, this.LJLIL, baseContent, map, map2, uuid, !z, c4j3);
        if (C84283Sm.LJIIJ(this.LJLIL)) {
            C90643h6.LJIIIIZZ(contactList.size());
        }
    }

    public ShareTextBoxViewModel(SharePackage sharePackage, C4NQ c4nq, C4NG c4ng, MutableLiveData dialogDismissEvent, C108434Nj c108434Nj, boolean z, boolean z2, boolean z3) {
        o.LJIIIZ(dialogDismissEvent, "dialogDismissEvent");
        this.LJLIL = sharePackage;
        this.LJLILLLLZI = c4nq;
        this.LJLJI = null;
        this.LJLJJI = c4ng;
        this.LJLJJL = dialogDismissEvent;
        this.LJLJJLL = c108434Nj;
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        this.LJLJLJ = mutableLiveData;
        this.LJLJLLL = mutableLiveData;
        MutableLiveData<C108454Nl> mutableLiveData2 = new MutableLiveData<>();
        this.LJLL = mutableLiveData2;
        this.LJLLI = mutableLiveData2;
        MutableLiveData<C108544Nu> mutableLiveData3 = new MutableLiveData<>();
        this.LJLLILLLL = mutableLiveData3;
        this.LJLLJ = mutableLiveData3;
        MutableLiveData<Float> mutableLiveData4 = new MutableLiveData<>();
        this.LJLLL = mutableLiveData4;
        this.LJLLLL = mutableLiveData4;
        MutableLiveData<Boolean> mutableLiveData5 = new MutableLiveData<>();
        this.LJLLLLLL = mutableLiveData5;
        this.LJLZ = mutableLiveData5;
        MutableLiveData<List<User>> mutableLiveData6 = new MutableLiveData<>();
        this.LJZ = mutableLiveData6;
        this.LJZI = mutableLiveData6;
        NextLiveData<Boolean> nextLiveData = new NextLiveData<>();
        this.LJZL = nextLiveData;
        this.LL = nextLiveData;
        this.LLD = C61878OQg.INSTANCE;
        if (z2) {
            C108484No c108484No = new C108484No(c108434Nj, sharePackage, this, z, z3);
            c108484No.LIZLLL();
            this.LJLJL = c108484No;
            return;
        }
        c108434Nj.LIZ.setVisibility(8);
    }
}
