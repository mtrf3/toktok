package com.bytedance.android.livesdk.microom;

import X.ActivityC45651qj;
import X.B5G;
import X.B83;
import X.BJM;
import X.BZI;
import X.C03660Ck;
import X.C03880Dg;
import X.C05170If;
import X.C15380j0;
import X.C15640jQ;
import X.C15650jR;
import X.C16880lQ;
import X.C17190lv;
import X.C1UQ;
import X.C28507BGt;
import X.C28787BRn;
import X.C28835BTj;
import X.C29291BeZ;
import X.C29363Bfj;
import X.C29366Bfm;
import X.C29374Bfu;
import X.C29401Dk;
import X.C29432Bgq;
import X.C29435Bgt;
import X.C29436Bgu;
import X.C29437Bgv;
import X.C2A7;
import X.C2NU;
import X.C30868C9o;
import X.C30929CBx;
import X.C47071t1;
import X.C62819Ol5;
import X.C65300Pk0;
import X.C73318Sq2;
import X.C75806Tp4;
import X.C77437UaH;
import X.C78720Uuy;
import X.CN1;
import X.DialogC77438UaI;
import X.DialogInterfaceOnClickListenerC29361Bfh;
import X.DialogInterfaceOnClickListenerC29438Bgw;
import X.DialogInterfaceOnDismissListenerC29404BgO;
import X.DialogInterfaceOnShowListenerC29403BgN;
import X.InterfaceC29405BgP;
import X.InterfaceC29433Bgr;
import X.V8L;
import Y.ACListenerS25S0100000_5;
import Y.AfS57S0100000_5;
import Y.IDaS216S0100000_5;
import Y.IDcS170S0100000_5;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.room.SubscribeSuccessEvent;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.other.LiveImageLoaderModuleSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.FollowBackTextSetting;
import com.bytedance.android.livesdk.microom.model.AnchorCardInfo;
import com.bytedance.android.livesdk.microom.model.MicRoomDialogOfficialInfo;
import com.bytedance.android.livesdk.model.OfficialChannelInfo;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class LiveMicRoomInfoDialog extends LiveDialogFragment implements InterfaceC29433Bgr {
    public MicRoomDialogOfficialInfo LJLJJL;
    public boolean LJLJJLL;
    public Room LJLJL;
    public ActivityC45651qj LJLJLJ;
    public C29432Bgq LJLJLLL;
    public C29291BeZ LJLL;
    public long LJLLI;
    public String LJLLILLLL;
    public boolean LJLLJ;
    public int LJLLL;
    public User LJZ;
    public final Map<Integer, View> LJZI = new LinkedHashMap();
    public final String LJLIL = "livesdk_subscribe_icon_show";
    public final String LJLILLLLZI = "livesdk_subscribe_icon_click";
    public final String LJLJI = "profile_card";
    public final String LJLJJI = "subscribe_";
    public final List<C29437Bgv> LJLLLL = new ArrayList();
    public final C73318Sq2 LJLLLLLL = new C73318Sq2();
    public boolean LJLZ = true;

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJZI).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJZI;
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

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.LJLJJLL = false;
        C29432Bgq c29432Bgq = this.LJLJLLL;
        if (c29432Bgq != null) {
            c29432Bgq.detachView();
        }
        this.LJLLLLLL.LIZLLL();
        super.onDestroy();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        int i;
        int i2;
        int i3;
        if (this.LJLLJ) {
            i = R.layout.cyt;
        } else {
            i = R.layout.cyu;
        }
        C28507BGt c28507BGt = new C28507BGt(i);
        boolean z = this.LJLLJ;
        c28507BGt.LIZLLL = z;
        c28507BGt.LJI = 0.0f;
        if (z) {
            i2 = R.style.aai;
        } else {
            i2 = R.style.aan;
        }
        c28507BGt.LIZJ = i2;
        if (z) {
            i3 = 80;
        } else {
            i3 = 5;
        }
        c28507BGt.LJII = i3;
        c28507BGt.LJIIJ = -1;
        return c28507BGt;
    }

    public final void xl() {
        User user;
        boolean z;
        long j;
        int i;
        Long l;
        SubscribeInfo subscribeInfo;
        Resources resources;
        Resources resources2;
        AnchorCardInfo anchorCardInfo;
        MicRoomDialogOfficialInfo micRoomDialogOfficialInfo = this.LJLJJL;
        Long l2 = null;
        if (micRoomDialogOfficialInfo != null && (anchorCardInfo = micRoomDialogOfficialInfo.getAnchorCardInfo()) != null) {
            user = anchorCardInfo.getCurrentUser();
        } else {
            user = null;
        }
        if (_$_findCachedViewById(R.id.dk3) != null && this.isViewValid && this.LJLJL != null && user != null && vl(user)) {
            Room room = this.LJLJL;
            int i2 = 0;
            if (room != null && user.getId() == room.getOwnerUserId()) {
                SubscribeInfo subscribeInfo2 = user.getSubscribeInfo();
                if (subscribeInfo2 != null) {
                    z = subscribeInfo2.isSubscribed();
                } else {
                    z = false;
                }
                FollowInfo followInfo = user.getFollowInfo();
                if (followInfo != null) {
                    j = followInfo.getFollowStatus();
                } else {
                    j = -1;
                }
                if (j != 1 && j != 2 && !z) {
                    ((C2A7) _$_findCachedViewById(R.id.dk3)).setText(R.string.svj);
                    ((C2A7) _$_findCachedViewById(R.id.dk3)).setIcon((Drawable) null);
                    ((C2A7) _$_findCachedViewById(R.id.dk3)).LJJLL(R.style.a2z);
                    ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.dk3).getLayoutParams();
                    o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    Context context = getContext();
                    if (context != null && (resources2 = context.getResources()) != null) {
                        i2 = resources2.getDimensionPixelSize(R.dimen.af5);
                    }
                    marginLayoutParams.setMarginEnd(i2);
                    ((C2A7) _$_findCachedViewById(R.id.dk3)).setLayoutParams(marginLayoutParams);
                    _$_findCachedViewById(R.id.kps).setVisibility(8);
                    return;
                }
                ViewGroup.LayoutParams layoutParams2 = _$_findCachedViewById(R.id.dk3).getLayoutParams();
                o.LJII(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                Context context2 = getContext();
                if (context2 != null && (resources = context2.getResources()) != null) {
                    i = resources.getDimensionPixelSize(R.dimen.af5);
                } else {
                    i = 0;
                }
                marginLayoutParams2.setMarginEnd(i);
                ((C2A7) _$_findCachedViewById(R.id.dk3)).setLayoutParams(marginLayoutParams2);
                ((C2A7) _$_findCachedViewById(R.id.dk3)).LJJLL(R.style.a2o);
                if (j == 2) {
                    ((C2A7) _$_findCachedViewById(R.id.dk3)).setIcon(R.drawable.d_3);
                } else if (j == 1) {
                    ((C2A7) _$_findCachedViewById(R.id.dk3)).setIcon(R.drawable.d_2);
                } else {
                    ((C2A7) _$_findCachedViewById(R.id.dk3)).setIcon(R.drawable.d_1);
                }
                ((C2A7) _$_findCachedViewById(R.id.dk3)).setText((CharSequence) null);
                _$_findCachedViewById(R.id.kps).setVisibility(0);
                C16880lQ.LJJIII((C2A7) _$_findCachedViewById(R.id.kps), new ACListenerS25S0100000_5(this, 199));
                if (vl(user) && (subscribeInfo = user.getSubscribeInfo()) != null && subscribeInfo.isSubscribed()) {
                    ((C2A7) _$_findCachedViewById(R.id.kps)).setText(R.string.ohv);
                    ((C2A7) _$_findCachedViewById(R.id.kps)).LJJLL(R.style.a2o);
                }
                BZI LIZ = C28787BRn.LIZ(this.LJLIL);
                Room room2 = this.LJLJL;
                if (room2 != null) {
                    l = Long.valueOf(room2.getOwnerUserId());
                } else {
                    l = null;
                }
                LIZ.LJIJJ(l, "anchor_id");
                Room room3 = this.LJLJL;
                if (room3 != null) {
                    l2 = Long.valueOf(room3.getId());
                }
                LIZ.LJIJJ(l2, "room_id");
                LIZ.LJIJJ(BJM.LJFF(), "enter_from_merge");
                LIZ.LJIJJ(BJM.LJIIIIZZ(), "enter_method");
                LIZ.LIZJ("click");
                LIZ.LJIJJ(BJM.LJIILIIL(), "request_id");
                LIZ.LJIJJ(BJM.LJIJ(), "video_id");
                LIZ.LJIJJ(this.LJLJI, "show_entrance");
                LIZ.LJIJJ("user", "user_type");
                C62819Ol5.LJJII(LIZ, this.dataChannel, false);
                LIZ.LJIILLIIL(this.dataChannel);
                LIZ.LJJIIJZLJL();
                C30929CBx.LJIILLIIL(this.LJLJI);
            }
        }
    }

    @Override // X.InterfaceC29433Bgr
    public final void LJJZ() {
        View _$_findCachedViewById = _$_findCachedViewById(R.id.bst);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.setVisibility(8);
        }
        C29435Bgt c29435Bgt = (C29435Bgt) _$_findCachedViewById(R.id.c_g);
        if (c29435Bgt != null) {
            c29435Bgt.LIZJ();
        }
    }

    @Override // X.InterfaceC29433Bgr
    public final void hide() {
        dismiss();
    }

    public final void Al(Throwable th) {
        if (!this.LJLJJLL) {
            return;
        }
        if (th instanceof C29401Dk) {
            C29401Dk c29401Dk = (C29401Dk) th;
            C30868C9o.LJI(c29401Dk.getPrompt());
            Context context = getContext();
            if (c29401Dk.getErrorCode() == 4002173) {
                String oI = ((IHostResource) CN1.LIZ(IHostResource.class)).oI(context);
                C47071t1 c47071t1 = new C47071t1(context);
                c47071t1.LJII(oI);
                c47071t1.LJIIL(R.string.sof, new IDcS170S0100000_5(this, 24));
                c47071t1.LJIIIZ(R.string.osu, C75806Tp4.LJLIL);
                LiveDialog LIZ = c47071t1.LIZ();
                if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "-1345192598633239924")).LIZ) {
                    return;
                }
                LIZ.show();
                return;
            }
            return;
        }
        C30868C9o.LIZJ(R.string.svg);
    }

    public final void Dl(User user) {
        String str;
        String str2;
        boolean z;
        long j;
        this.LJZ = user;
        getContext();
        if (C2NU.LIZ.LIZIZ()) {
            int i = this.LJLLL;
            if (i == 0) {
                str = "live_audience_c_anchor";
            } else if (i == 2) {
                str = "right_anchor";
            } else {
                str = "live_audience_c_audience";
            }
            if (!user.isFollowing()) {
                Room room = this.LJLJL;
                if (room != null) {
                    C29432Bgq c29432Bgq = this.LJLJLLL;
                    if (c29432Bgq != null) {
                        room.getRequestId();
                        long id = user.getId();
                        long id2 = room.getId();
                        room.getLabels();
                        boolean z2 = this.LJLZ;
                        if (!c29432Bgq.LJLJI) {
                            c29432Bgq.LJLJI = true;
                            C73318Sq2 c73318Sq2 = c29432Bgq.LJLIL;
                            InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
                            C29366Bfm c29366Bfm = new C29366Bfm();
                            c29366Bfm.LIZIZ(id);
                            c29366Bfm.LIZLLL();
                            C29366Bfm c29366Bfm2 = c29366Bfm;
                            c29366Bfm2.LIZLLL();
                            c29366Bfm2.LJ(id2);
                            c29366Bfm2.LJFF = z2;
                            c73318Sq2.LIZ(((C29374Bfu) LIZIZ).LJIIIIZZ(new C29363Bfj(c29366Bfm2)).LJJJLL(new AfS57S0100000_5(c29432Bgq, 388), new AfS57S0100000_5(c29432Bgq, 389), new IDaS216S0100000_5(c29432Bgq, 8)));
                        }
                    }
                    User owner = room.getOwner();
                    if (C28835BTj.LJFF(this.dataChannel) && user.getId() == owner.getId()) {
                        HashMap LIZJ = C03660Ck.LIZJ("refer", "card_follow_button");
                        HashMap hashMap = new HashMap();
                        hashMap.put("anchor_id", String.valueOf(owner.getId()));
                        hashMap.put("room_id", String.valueOf(user.getId()));
                        C28835BTj.LIZ("live_ad", "follow", LIZJ, hashMap);
                    }
                }
                C29291BeZ c29291BeZ = this.LJLL;
                if (c29291BeZ != null) {
                    long id3 = user.getId();
                    int i2 = this.LJLLL;
                    if (B5G.LIZIZ().LJI == user.getId()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (user.getFollowInfo() != null) {
                        j = user.getFollowInfo().getFollowStatus();
                    } else {
                        j = 0;
                    }
                    c29291BeZ.LIZ(true, id3, i2, z, j, this.LJLLJ);
                    return;
                }
                return;
            }
            C77437UaH c77437UaH = new C77437UaH(getContext());
            Context context = getContext();
            if (context != null) {
                str2 = context.getString(R.string.mpp, C05170If.LIZ(user));
            } else {
                str2 = null;
            }
            c77437UaH.LJI = str2;
            c77437UaH.LJ(R.string.mpo, new DialogInterfaceOnClickListenerC29361Bfh(user, this, user, str), false);
            c77437UaH.LIZJ(R.string.snz, DialogInterfaceOnClickListenerC29438Bgw.LJLIL, false);
            c77437UaH.LJIILL = DialogInterfaceOnDismissListenerC29404BgO.LJLIL;
            c77437UaH.LJIILLIIL = DialogInterfaceOnShowListenerC29403BgN.LJLIL;
            DialogC77438UaI LIZ = c77437UaH.LIZ();
            if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveModalDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "-1345192598633239924")).LIZ) {
                return;
            }
            LIZ.show();
            return;
        }
        C30868C9o.LIZJ(R.string.n0o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x02b9, code lost:
    
        if (X.C76800UCe.LIZ != null) goto L107;
     */
    /* JADX WARN: Removed duplicated region for block: B:138:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03d4 A[LOOP:0: B:68:0x03d2->B:69:0x03d4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0468  */
    @Override // X.InterfaceC29433Bgr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void nl(com.bytedance.android.livesdk.microom.model.MicRoomDialogOfficialInfo r15) {
        /*
            Method dump skipped, instructions count: 1531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.microom.LiveMicRoomInfoDialog.nl(com.bytedance.android.livesdk.microom.model.MicRoomDialogOfficialInfo):void");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Room room;
        super.onCreate(bundle);
        this.LJLJJLL = true;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            room = (Room) dataChannel.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LJLJL = room;
        C29432Bgq c29432Bgq = this.LJLJLLL;
        if (c29432Bgq != null) {
            c29432Bgq.attachView(this);
        }
        C29432Bgq c29432Bgq2 = this.LJLJLLL;
        if (c29432Bgq2 != null) {
            c29432Bgq2.LJLILLLLZI = this;
        }
        DataChannelGlobal.LJLJJI.nv0(this, this, SubscribeSuccessEvent.class, new AqS171S0100000_5(this, 459));
        this.LJLLLLLL.LIZ(((C29374Bfu) B83.LIZ().LIZIZ()).LJIIIIZZ.LJJJJZI(new AfS57S0100000_5(this, 139)));
    }

    public final void onEvent(FollowPair followPair) {
        boolean z;
        User officialUser;
        boolean z2;
        User officialUser2;
        FollowInfo followInfo;
        User officialUser3;
        User officialUser4;
        boolean z3;
        AnchorCardInfo anchorCardInfo;
        User currentUser;
        FollowInfo followInfo2;
        AnchorCardInfo anchorCardInfo2;
        User currentUser2;
        AnchorCardInfo anchorCardInfo3;
        User currentUser3;
        AnchorCardInfo anchorCardInfo4;
        User currentUser4;
        MicRoomDialogOfficialInfo micRoomDialogOfficialInfo = this.LJLJJL;
        boolean z4 = true;
        boolean z5 = false;
        if (micRoomDialogOfficialInfo != null && (anchorCardInfo4 = micRoomDialogOfficialInfo.getAnchorCardInfo()) != null && (currentUser4 = anchorCardInfo4.getCurrentUser()) != null && followPair.LIZ == currentUser4.getId()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            MicRoomDialogOfficialInfo micRoomDialogOfficialInfo2 = this.LJLJJL;
            if (micRoomDialogOfficialInfo2 != null && (anchorCardInfo3 = micRoomDialogOfficialInfo2.getAnchorCardInfo()) != null && (currentUser3 = anchorCardInfo3.getCurrentUser()) != null) {
                currentUser3.setFollowStatus(followPair.LIZ());
            }
            MicRoomDialogOfficialInfo micRoomDialogOfficialInfo3 = this.LJLJJL;
            if (micRoomDialogOfficialInfo3 != null && (anchorCardInfo2 = micRoomDialogOfficialInfo3.getAnchorCardInfo()) != null && (currentUser2 = anchorCardInfo2.getCurrentUser()) != null) {
                z3 = currentUser2.isFollowing();
            } else {
                z3 = false;
            }
            C2A7 c2a7 = (C2A7) _$_findCachedViewById(R.id.dk3);
            MicRoomDialogOfficialInfo micRoomDialogOfficialInfo4 = this.LJLJJL;
            if (micRoomDialogOfficialInfo4 == null || (anchorCardInfo = micRoomDialogOfficialInfo4.getAnchorCardInfo()) == null || (currentUser = anchorCardInfo.getCurrentUser()) == null || (followInfo2 = currentUser.getFollowInfo()) == null || ((int) followInfo2.getFollowStatus()) != 3) {
                z4 = false;
            }
            Gl(z3, c2a7, 2, z4);
            xl();
            return;
        }
        MicRoomDialogOfficialInfo micRoomDialogOfficialInfo5 = this.LJLJJL;
        if (micRoomDialogOfficialInfo5 == null || (officialUser = micRoomDialogOfficialInfo5.getOfficialUser()) == null || followPair.LIZ != officialUser.getId()) {
            return;
        }
        MicRoomDialogOfficialInfo micRoomDialogOfficialInfo6 = this.LJLJJL;
        if (micRoomDialogOfficialInfo6 != null && (officialUser4 = micRoomDialogOfficialInfo6.getOfficialUser()) != null) {
            officialUser4.setFollowStatus(followPair.LIZ());
        }
        MicRoomDialogOfficialInfo micRoomDialogOfficialInfo7 = this.LJLJJL;
        if (micRoomDialogOfficialInfo7 != null && (officialUser3 = micRoomDialogOfficialInfo7.getOfficialUser()) != null) {
            z2 = officialUser3.isFollowing();
        } else {
            z2 = false;
        }
        C2A7 c2a72 = (C2A7) _$_findCachedViewById(R.id.h9v);
        MicRoomDialogOfficialInfo micRoomDialogOfficialInfo8 = this.LJLJJL;
        if (micRoomDialogOfficialInfo8 != null && (officialUser2 = micRoomDialogOfficialInfo8.getOfficialUser()) != null && (followInfo = officialUser2.getFollowInfo()) != null && ((int) followInfo.getFollowStatus()) == 3) {
            z5 = true;
        }
        Gl(z2, c2a72, 1, z5);
    }

    public final boolean vl(User user) {
        SubscribeInfo subscribeInfo;
        if (user == null || user.getSubscribeInfo() == null || (subscribeInfo = user.getSubscribeInfo()) == null) {
            return false;
        }
        return subscribeInfo.isAnchorQualified();
    }

    public static void wl(View view, ImageModel imageModel) {
        if (view != null) {
            if (LiveImageLoaderModuleSetting.useImageModule()) {
                if (!C15650jR.LIZIZ(imageModel)) {
                    return;
                }
                C78720Uuy LIZ = C15650jR.LIZ().LIZ(imageModel.getUrls());
                LIZ.LIZLLL(ImageView.ScaleType.CENTER_CROP);
                LIZ.LJIIZILJ(Float.valueOf(C15380j0.LIZ(8) + 0.0f));
                LIZ.LJIIJJI(view);
                return;
            }
            if (imageModel == null || !C15640jQ.LIZIZ(view.getContext())) {
                return;
            }
            C17190lv LJII = C17190lv.LJII(view.getContext());
            LJII.LIZLLL(C15640jQ.LIZ(imageModel));
            int LIZ2 = C15380j0.LIZ(8);
            if (LJII.LJIIJ == null) {
                LJII.LJIIJ = new V8L();
            }
            LJII.LJIIJ.LJFF(LIZ2);
            LJII.LJFF = imageModel;
            LJII.LIZ(ImageView.ScaleType.CENTER_CROP);
            LJII.LIZLLL = new C1UQ(imageModel, null);
            LJII.LIZJ(view);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        long j;
        OfficialChannelInfo officialChannelInfo;
        User user;
        C29435Bgt c29435Bgt;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        BZI LIZ = C28787BRn.LIZ("livesdk_audience_lineup_official_panel_show");
        LIZ.LJIILLIIL(this.dataChannel);
        LIZ.LJJIIJZLJL();
        View findViewById = view.findViewById(R.id.hr1);
        if (findViewById != null) {
            C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 200), findViewById);
        }
        Context context = getContext();
        if (context != null && (c29435Bgt = (C29435Bgt) _$_findCachedViewById(R.id.c_g)) != null) {
            c29435Bgt.setBuilder(new C29436Bgu(context, new ACListenerS25S0100000_5(this, 201)));
        }
        getContext();
        if (C2NU.LIZ.LIZIZ()) {
            C29435Bgt c29435Bgt2 = (C29435Bgt) _$_findCachedViewById(R.id.c_g);
            if (c29435Bgt2 != null) {
                c29435Bgt2.LIZ();
            }
            C29432Bgq c29432Bgq = this.LJLJLLL;
            if (c29432Bgq != null) {
                Room room = this.LJLJL;
                long j2 = 0;
                if (room != null && (officialChannelInfo = room.officialChannelInfo) != null && (user = officialChannelInfo.channelUser) != null) {
                    j = user.getId();
                } else {
                    j = 0;
                }
                Room room2 = this.LJLJL;
                if (room2 != null) {
                    j2 = room2.getOwnerUserId();
                }
                c29432Bgq.LJJJJ(j, j2);
                return;
            }
            return;
        }
        C29435Bgt c29435Bgt3 = (C29435Bgt) _$_findCachedViewById(R.id.c_g);
        if (c29435Bgt3 != null) {
            c29435Bgt3.LIZIZ();
        }
    }

    public static void Gl(boolean z, C2A7 c2a7, int i, boolean z2) {
        if (i != 1) {
            if (i != 2) {
                return;
            }
            if (!z) {
                if (c2a7 != null) {
                    c2a7.LJJLL(R.style.a2z);
                }
                if (z2) {
                    if (FollowBackTextSetting.INSTANCE.getValue()) {
                        if (c2a7 == null) {
                            return;
                        }
                        c2a7.setText(R.string.l9i);
                        return;
                    } else {
                        if (c2a7 == null) {
                            return;
                        }
                        c2a7.setText(R.string.svj);
                        return;
                    }
                }
                if (c2a7 == null) {
                    return;
                }
                c2a7.setText(R.string.svj);
                return;
            }
            if (c2a7 == null) {
                return;
            }
            c2a7.LJJLL(R.style.a2o);
            c2a7.setText(R.string.svk);
            return;
        }
        if (!z) {
            if (c2a7 != null) {
                c2a7.LJJLL(R.style.a35);
            }
            if (z2) {
                if (FollowBackTextSetting.INSTANCE.getValue()) {
                    if (c2a7 == null) {
                        return;
                    }
                    c2a7.setText(R.string.l9i);
                    return;
                } else {
                    if (c2a7 == null) {
                        return;
                    }
                    c2a7.setText(R.string.svj);
                    return;
                }
            }
            if (c2a7 == null) {
                return;
            }
            c2a7.setText(R.string.svj);
            return;
        }
        if (c2a7 == null) {
            return;
        }
        c2a7.LJJLL(R.style.a2t);
        c2a7.setText(R.string.svk);
    }
}
