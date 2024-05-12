package X;

import Y.AfS57S0100000_5;
import Y.IDcS37S0100000_5;
import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.room.SubscribeSuccessEvent;
import com.bytedance.android.livesdk.chatroom.ui.SSGridLayoutManager;
import com.bytedance.android.livesdk.dataChannel.EmoteBaseInformationListChannel;
import com.bytedance.android.livesdk.livesetting.comment.LiveCommentEmoteInputMaxCount;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.1Oc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32181Oc extends C0Y5 {
    public C42221lC LJIIIIZZ;
    public CJ0 LJIIIZ;
    public InterfaceC42211lB LJIIJ;
    public InterfaceC32191Od LJIIJJI;

    @Override // X.C0Y5
    public final void LIZJ() {
        C42221lC c42221lC = this.LJIIIIZZ;
        if (c42221lC != null) {
            c42221lC.LIZIZ(this);
        }
        InterfaceC42211lB interfaceC42211lB = this.LJIIJ;
        if (interfaceC42211lB != null) {
            ((CI1) interfaceC42211lB).LIZ.LLI.dispatchKeyEvent(new KeyEvent(0, 67));
        }
    }

    public final void LJ() {
        if (this.LJII) {
            CJ0 cj0 = this.LJIIIZ;
            if (cj0 != null && !cj0.LJLLILLLL) {
                cj0.LJLLILLLL = true;
                cj0.LJJLJLI();
                return;
            }
            return;
        }
        CJ0 cj02 = this.LJIIIZ;
        if (cj02 == null || !cj02.LJLLILLLL) {
            return;
        }
        cj02.LJLLILLLL = false;
        cj02.LJJLJLI();
    }

    @Override // X.C0Y5
    public final void LIZ() {
        LJ();
    }

    public C32181Oc(Context context) {
        super(context);
    }

    @Override // X.C0Y5
    public final View LIZIZ(ViewGroup viewGroup) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        User owner;
        User owner2;
        Context context = this.LIZ;
        DataChannel dataChannel = this.LIZIZ;
        boolean z5 = this.LIZLLL;
        C42221lC c42221lC = this.LJIIIIZZ;
        CJ0 cj0 = new CJ0(context, dataChannel);
        cj0.setOnEmojiSelectListener(c42221lC);
        cj0.LJLJL = z5;
        if (z5) {
            i = 5;
        } else {
            i = 10;
        }
        cj0.LJLJLJ = i;
        View findViewById = cj0.findViewById(R.id.j9z);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.rv_emotes)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        cj0.LJLIL = recyclerView;
        recyclerView.setClipToPadding(false);
        cj0.LJZI = (C15380j0.LJIIL() - C15380j0.LIZ(18.0f)) / cj0.LJLJLJ;
        cj0.LJLJLLL = SystemClock.elapsedRealtime();
        C31413CUn c31413CUn = cj0.LJLILLLLZI;
        c31413CUn.LJLZ(CJ9.class, new CJI(cj0));
        c31413CUn.LJLZ(EmoteModel.class, new CJC(cj0.LJZI, cj0, cj0, cj0));
        cj0.getContext();
        SSGridLayoutManager sSGridLayoutManager = new SSGridLayoutManager(cj0.LJLJLJ);
        cj0.LJLJJI = sSGridLayoutManager;
        sSGridLayoutManager.LLIILII = new IDcS37S0100000_5(cj0, 4);
        RecyclerView recyclerView2 = cj0.LJLIL;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(cj0.LJLILLLLZI);
            RecyclerView recyclerView3 = cj0.LJLIL;
            if (recyclerView3 != null) {
                recyclerView3.setLayoutManager(cj0.LJLJJI);
                RecyclerView recyclerView4 = cj0.LJLIL;
                if (recyclerView4 != null) {
                    recyclerView4.setHasFixedSize(true);
                    RecyclerView recyclerView5 = cj0.LJLIL;
                    if (recyclerView5 != null) {
                        recyclerView5.setItemViewCacheSize(36);
                        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
                        Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
                        if (room != null && (owner2 = room.getOwner()) != null) {
                            z = owner2.isFollowing();
                        } else {
                            z = false;
                        }
                        cj0.LJLLL = z;
                        cj0.LJZ.LIZ(C73943T0h.LIZ().LJ(CJ5.class).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS57S0100000_5(cj0, 298)));
                        Room room2 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
                        if (room2 != null && (owner = room2.getOwner()) != null) {
                            z2 = owner.isSubscribed();
                        } else {
                            z2 = false;
                        }
                        cj0.LJLLJ = z2;
                        Room room3 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
                        if (room3 != null && ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId() == room3.getOwnerUserId()) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        cj0.LJLLLL = z3;
                        CJ3 cj3 = cj0.LJLJJLL;
                        if (cj3 != null) {
                            if (cj0.LJLLJ || z3) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            cj3.LIZIZ(z4);
                        }
                        C31106CIs c31106CIs = C31106CIs.LIZ;
                        if (C31106CIs.LIZJ(0)) {
                            cj0.LJLZ.clear();
                            Collection<? extends EmoteModel> collection = (Collection) dataChannelGlobal.mv0(EmoteBaseInformationListChannel.class);
                            if (collection == null) {
                                collection = new ArrayList<>();
                            }
                            cj0.LJLZ.addAll(collection);
                        }
                        if (cj0.getContext() instanceof LifecycleOwner) {
                            Object context2 = cj0.getContext();
                            o.LJII(context2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                            dataChannelGlobal.nv0(cj0, (LifecycleOwner) context2, SubscribeSuccessEvent.class, new AqS171S0100000_5(cj0, 768));
                        }
                        dataChannelGlobal.ov0(EmoteBaseInformationListChannel.class, cj0, new AqS171S0100000_5(cj0, 769));
                        if (!C31106CIs.LIZJ(0)) {
                            Resources resources = cj0.getResources();
                            o.LJIIIIZZ(resources, "resources");
                            c31106CIs.LIZIZ(0, resources);
                        }
                        cj0.LJLILLLLZI.LJLIL = cj0.LJLLLLLL;
                        cj0.LJJLJLI();
                        int dimensionPixelSize = cj0.getContext().getResources().getDimensionPixelSize(R.dimen.acw);
                        RecyclerView recyclerView6 = cj0.LJLIL;
                        if (recyclerView6 != null) {
                            int paddingLeft = recyclerView6.getPaddingLeft();
                            RecyclerView recyclerView7 = cj0.LJLIL;
                            if (recyclerView7 != null) {
                                int paddingTop = recyclerView7.getPaddingTop();
                                RecyclerView recyclerView8 = cj0.LJLIL;
                                if (recyclerView8 != null) {
                                    recyclerView6.setPadding(paddingLeft, paddingTop, recyclerView8.getPaddingRight(), dimensionPixelSize);
                                    this.LJIIIZ = cj0;
                                    LJ();
                                    if (cj0.LJLLJ || cj0.LJLLLL) {
                                        View view = this.LJI;
                                        if (view != null) {
                                            view.setVisibility(0);
                                        }
                                    } else {
                                        View view2 = this.LJI;
                                        if (view2 != null) {
                                            view2.setVisibility(8);
                                        }
                                    }
                                    cj0.setEmoteSelectPanelCallback(new CJ3() { // from class: X.1Ob
                                        @Override // X.CJ3
                                        public final void LIZ() {
                                            InterfaceC32191Od interfaceC32191Od = C32181Oc.this.LJIIJJI;
                                            if (interfaceC32191Od != null) {
                                                interfaceC32191Od.LIZ();
                                            }
                                        }

                                        @Override // X.CJ3
                                        public final void LIZIZ(boolean z6) {
                                            C32181Oc c32181Oc = C32181Oc.this;
                                            if (z6) {
                                                View view3 = c32181Oc.LJI;
                                                if (view3 == null) {
                                                    return;
                                                }
                                                view3.setVisibility(0);
                                                return;
                                            }
                                            View view4 = c32181Oc.LJI;
                                            if (view4 == null) {
                                                return;
                                            }
                                            view4.setVisibility(8);
                                        }
                                    });
                                    return cj0;
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
        o.LJIJI("mRecyclerView");
        throw null;
    }

    @Override // X.C0Y5
    public final void LIZLLL(boolean z) {
        CJ0 cj0 = this.LJIIIZ;
        if (cj0 != null && z) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            if (dataChannelGlobal.mv0(C29044Baa.class) != null) {
                HashMap hashMap = new HashMap();
                String str = (String) dataChannelGlobal.mv0(C54832Df.class);
                String str2 = "comment";
                if (str == null) {
                    str = "comment";
                }
                if (!ujb.o.LJJJJJL(str)) {
                    str2 = str;
                }
                hashMap.put("show_entrance", str2);
                BPV.LIZ(hashMap);
                C29822Bn8.LIZIZ("livesdk_privilege_emote_bar_show", hashMap);
            }
            int value = LiveCommentEmoteInputMaxCount.INSTANCE.getValue();
            int size = cj0.LJLZ.size();
            JSONObject jSONObject = new JSONObject();
            C05630Jz.LIZ(value, "limit_emotes_size", jSONObject);
            C05630Jz.LIZ(size, "total_emotes_size", jSONObject);
            C30929CBx.LJIIZILJ("subscription_emote_panel_show", jSONObject);
            if (!cj0.LJLLJ && !cj0.LJLLLL) {
                BPV.LIZLLL("emote_bar", null);
            }
        }
    }
}
