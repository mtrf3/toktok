package emotes.ui;

import X.B83;
import X.BPV;
import X.C05630Jz;
import X.C15380j0;
import X.C15510jD;
import X.C15640jQ;
import X.C28507BGt;
import X.C29044Baa;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29822Bn8;
import X.C30929CBx;
import X.C31106CIs;
import X.C31413CUn;
import X.C47261Igj;
import X.C73116Smm;
import X.C73933Szx;
import X.C73943T0h;
import X.C73969T1h;
import X.CFX;
import X.CJ2;
import X.CJ5;
import X.CJ8;
import X.CJ9;
import X.CJC;
import X.CJD;
import X.CJH;
import X.CJP;
import X.CN1;
import X.InterfaceC29856Bng;
import Y.AfS57S0100000_5;
import Y.IDcS37S0100000_5;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.room.SubscribeSuccessEvent;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.android.livesdk.chatroom.ui.SSGridLayoutManager;
import com.bytedance.android.livesdk.dataChannel.EmoteBaseInformationListChannel;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class EmotePreviewDialog extends LiveDialogFragment implements CJP {
    public RecyclerView LJLILLLLZI;
    public C73116Smm LJLJI;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public SSGridLayoutManager LJLJLLL;
    public EmoteModel LJLLJ;
    public final Map<Integer, View> LJLLL = new LinkedHashMap();
    public final boolean LJLIL = true;
    public final C31413CUn LJLJJI = new C31413CUn();
    public int LJLJJL = 5;
    public final CJ2 LJLL = new CJ2();
    public final ArrayList<EmoteModel> LJLLI = new ArrayList<>();
    public int LJLLILLLL = C15380j0.LIZ(58.0f);

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        int i;
        C28507BGt c28507BGt = new C28507BGt(R.layout.cwm);
        c28507BGt.LIZJ = R.style.aap;
        if (this.LJLIL) {
            i = 80;
        } else {
            i = 8388613;
        }
        c28507BGt.LJII = i;
        c28507BGt.LJIIJ = -2;
        c28507BGt.LJI = 0.0f;
        return c28507BGt;
    }

    public final void vl() {
        boolean z;
        if (this.LJLLI.isEmpty()) {
            return;
        }
        Iterator<EmoteModel> it = this.LJLLI.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            EmoteModel next = it.next();
            if (next.emotePrivateType == 1) {
                if (next != null) {
                    z = true;
                }
            }
        }
        z = false;
        this.LJLL.clear();
        CJ2 cj2 = this.LJLL;
        cj2.add(0, new CJ9(this.LJLJL, this.LJLJJLL, z));
        Iterator<EmoteModel> it2 = this.LJLLI.iterator();
        while (it2.hasNext()) {
            EmoteModel next2 = it2.next();
            next2.readOnly = true;
            next2.inputLimited = false;
        }
        cj2.addAll(this.LJLLI);
        boolean z2 = this.LJLJJLL;
        if (!z2 && !this.LJLJLJ) {
            cj2.add(new CJ8(this.LJLJL, z2));
        }
        this.LJLJJI.notifyDataSetChanged();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.getClass();
        dataChannelGlobal.jv0(this);
    }

    public final void onEvent(CJ5 cj5) {
        FollowPair followPair;
        if (cj5 == null || (followPair = cj5.LIZ) == null) {
            return;
        }
        this.LJLJL = followPair.LIZIZ();
        vl();
    }

    @Override // X.CJP
    public final void Bg(String str, String str2) {
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (getContext() != null && room != null) {
            Context context = getContext();
            if (context != null) {
                ((ISubscribeService) CN1.LIZ(ISubscribeService.class)).kg0(context, room, str, str2);
            }
            dismiss();
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        boolean z;
        boolean z2;
        User owner;
        User owner2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLJJL = 5;
        View findViewById = view.findViewById(R.id.j9z);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.rv_emotes)");
        this.LJLILLLLZI = (RecyclerView) findViewById;
        View findViewById2 = view.findViewById(R.id.f8o);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.iv_planet)");
        C73116Smm c73116Smm = (C73116Smm) findViewById2;
        this.LJLJI = c73116Smm;
        boolean z3 = false;
        c73116Smm.setVisibility(0);
        this.LJLLILLLL = (C15380j0.LJIIL() - C15380j0.LIZ(18.0f)) / this.LJLJJL;
        C31413CUn c31413CUn = this.LJLJJI;
        EmoteModel emoteModel = this.LJLLJ;
        if (emoteModel != null) {
            c31413CUn.LJLZ(CJ9.class, new CJH(emoteModel));
        }
        c31413CUn.LJLZ(EmoteModel.class, new CJC(this.LJLLILLLL, null, null, null));
        EmoteModel emoteModel2 = this.LJLLJ;
        if (emoteModel2 != null) {
            str = emoteModel2.emoteId;
        } else {
            str = null;
        }
        c31413CUn.LJLZ(CJ8.class, new CJD(this, str));
        getContext();
        SSGridLayoutManager sSGridLayoutManager = new SSGridLayoutManager(5);
        this.LJLJLLL = sSGridLayoutManager;
        sSGridLayoutManager.LLIILII = new IDcS37S0100000_5(this, 3);
        RecyclerView recyclerView = this.LJLILLLLZI;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.LJLJJI);
            RecyclerView recyclerView2 = this.LJLILLLLZI;
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager(this.LJLJLLL);
                RecyclerView recyclerView3 = this.LJLILLLLZI;
                if (recyclerView3 != null) {
                    recyclerView3.setHasFixedSize(true);
                    RecyclerView recyclerView4 = this.LJLILLLLZI;
                    if (recyclerView4 != null) {
                        recyclerView4.setItemViewCacheSize(36);
                        RecyclerView recyclerView5 = this.LJLILLLLZI;
                        if (recyclerView5 != null) {
                            C29306Beo.LJJJJJL(C15380j0.LIZ(32.0f), recyclerView5);
                            RecyclerView recyclerView6 = this.LJLILLLLZI;
                            if (recyclerView6 != null) {
                                recyclerView6.setNestedScrollingEnabled(false);
                                String LJIIIZ = C15510jD.LJIIIZ(CFX.LIZ("tiktok_live_basic_resource", "tiktok_live_watch_resource_demand_1"), "ttlive_bg_emote_header.png");
                                if (!TextUtils.isEmpty(LJIIIZ)) {
                                    C73116Smm c73116Smm2 = this.LJLJI;
                                    if (c73116Smm2 != null) {
                                        C15640jQ.LJ(c73116Smm2, new ImageModel(LJIIIZ, C47261Igj.LJJIJ(LJIIIZ)), 0);
                                    } else {
                                        o.LJIJI("ivPlanet");
                                        throw null;
                                    }
                                }
                                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
                                Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
                                if (room != null && (owner2 = room.getOwner()) != null) {
                                    z = owner2.isFollowing();
                                } else {
                                    z = false;
                                }
                                this.LJLJL = z;
                                ((InterfaceC29856Bng) C73943T0h.LIZ().LJ(CJ5.class).LJJJ(C73969T1h.LIZIZ()).LIZJ(C73933Szx.LIZLLL(this))).LIZIZ(new AfS57S0100000_5(this, 297));
                                Room room2 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
                                if (room2 != null && (owner = room2.getOwner()) != null) {
                                    z2 = owner.isSubscribed();
                                } else {
                                    z2 = false;
                                }
                                this.LJLJJLL = z2;
                                Room room3 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
                                if (room3 != null && ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId() == room3.getOwnerUserId()) {
                                    z3 = true;
                                }
                                this.LJLJLJ = z3;
                                C31106CIs c31106CIs = C31106CIs.LIZ;
                                if (C31106CIs.LIZJ(1)) {
                                    this.LJLLI.clear();
                                    Collection<? extends EmoteModel> collection = (Collection) dataChannelGlobal.mv0(EmoteBaseInformationListChannel.class);
                                    if (collection == null) {
                                        collection = new ArrayList<>();
                                    }
                                    this.LJLLI.addAll(collection);
                                }
                                dataChannelGlobal.nv0(this, this, SubscribeSuccessEvent.class, new AqS171S0100000_5(this, 766));
                                dataChannelGlobal.ov0(EmoteBaseInformationListChannel.class, this, new AqS171S0100000_5(this, 767));
                                Resources resources = getResources();
                                o.LJIIIIZZ(resources, "resources");
                                c31106CIs.LIZIZ(1, resources);
                                this.LJLJJI.LJLIL = this.LJLL;
                                vl();
                                if (dataChannelGlobal.mv0(C29044Baa.class) != null) {
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("show_entrance", "comment_area");
                                    BPV.LIZ(hashMap);
                                    C29822Bn8.LIZIZ("livesdk_privilege_emote_show", hashMap);
                                }
                                int size = this.LJLLI.size();
                                JSONObject jSONObject = new JSONObject();
                                C05630Jz.LIZ(size, "total_emotes_size", jSONObject);
                                C30929CBx.LJIIZILJ("subscription_emote_preview_show", jSONObject);
                                return;
                            }
                            o.LJIJI("mRecyclerView");
                            throw null;
                        }
                        o.LJIJI("mRecyclerView");
                        throw null;
                    }
                    o.LJIJI("mRecyclerView");
                    throw null;
                }
                o.LJIJI("mRecyclerView");
                throw null;
            }
            o.LJIJI("mRecyclerView");
            throw null;
        }
        o.LJIJI("mRecyclerView");
        throw null;
    }
}
