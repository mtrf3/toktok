package Y;

import X.BPP;
import X.C04750Gp;
import X.C05170If;
import X.C0NB;
import X.C15380j0;
import X.C28467BFf;
import X.C30868C9o;
import X.C74947TbD;
import X.C76469Tzl;
import X.C76472Tzo;
import X.C76732zl;
import X.InterfaceC64592gB;
import X.JBR;
import X.TZL;
import X.U4R;
import X.U7H;
import X.X1D;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multilive.model.GuestMicCameraManageResponse;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfigSetting;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;

/* loaded from: classes14.dex */
public class AfS25S0301000_13 implements InterfaceC64592gB {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            case 5:
                accept$5(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS25S0301000_13 afS25S0301000_13, Object obj) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateLocalLinkedList delay:");
        LIZ.append(afS25S0301000_13.i3);
        LIZ.append(" seconds");
        U4R.LIZLLL("CoManager", X1D.LIZIZ(LIZ));
        U7H u7h = (U7H) afS25S0301000_13.l0;
        u7h.LJII = (List) afS25S0301000_13.l1;
        u7h.LIZLLL = (List) afS25S0301000_13.l2;
        u7h.LJJLIIIIJ(null, null);
        ((U7H) afS25S0301000_13.l0).LJJL();
    }

    public static final void accept$1(AfS25S0301000_13 afS25S0301000_13, Object obj) {
        C04750Gp c04750Gp;
        Bitmap decodeFile = BitmapFactory.decodeFile((String) obj);
        if (afS25S0301000_13.i3 == 0) {
            c04750Gp = (C04750Gp) ((Map) afS25S0301000_13.l0).get("image_4");
        } else {
            c04750Gp = (C04750Gp) ((Map) afS25S0301000_13.l0).get("image_6");
        }
        if (decodeFile != null) {
            ((C76732zl) afS25S0301000_13.l2).element++;
        }
        C76469Tzl.LJLIL(decodeFile, c04750Gp, 0);
    }

    public static final void accept$2(AfS25S0301000_13 afS25S0301000_13, Object obj) {
        C04750Gp c04750Gp;
        Bitmap decodeFile = BitmapFactory.decodeFile((String) obj);
        if (afS25S0301000_13.i3 == 0) {
            c04750Gp = (C04750Gp) ((Map) afS25S0301000_13.l0).get("image_0");
        } else {
            c04750Gp = (C04750Gp) ((Map) afS25S0301000_13.l0).get("image_2");
        }
        if (decodeFile != null) {
            ((C76732zl) afS25S0301000_13.l2).element++;
        }
        C76469Tzl.LJLIL(decodeFile, c04750Gp, 0);
    }

    public static final void accept$3(AfS25S0301000_13 afS25S0301000_13, Object obj) {
        C04750Gp c04750Gp;
        Bitmap decodeFile = BitmapFactory.decodeFile((String) obj);
        if (afS25S0301000_13.i3 == 0) {
            c04750Gp = (C04750Gp) ((Map) afS25S0301000_13.l0).get("image_4");
        } else {
            c04750Gp = (C04750Gp) ((Map) afS25S0301000_13.l0).get("image_6");
        }
        if (decodeFile != null) {
            ((C76732zl) afS25S0301000_13.l2).element++;
        }
        C76472Tzo.LJJLL(decodeFile, c04750Gp, 0);
    }

    public static final void accept$4(AfS25S0301000_13 afS25S0301000_13, Object obj) {
        C04750Gp c04750Gp;
        Bitmap decodeFile = BitmapFactory.decodeFile((String) obj);
        if (afS25S0301000_13.i3 == 0) {
            c04750Gp = (C04750Gp) ((Map) afS25S0301000_13.l0).get("image_0");
        } else {
            c04750Gp = (C04750Gp) ((Map) afS25S0301000_13.l0).get("image_2");
        }
        if (decodeFile != null) {
            ((C76732zl) afS25S0301000_13.l2).element++;
        }
        C76472Tzo.LJJLL(decodeFile, c04750Gp, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$5(AfS25S0301000_13 afS25S0301000_13, Object obj) {
        Integer num;
        String str;
        RequestError requestError;
        RequestError requestError2;
        boolean z;
        User user;
        Long l;
        User user2;
        User user3;
        Long l2;
        User user4;
        User user5;
        User user6;
        User user7;
        User user8;
        int i;
        GuestMicCameraManageResponse.ResponseData responseData;
        C28467BFf c28467BFf = (C28467BFf) obj;
        Throwable th = null;
        Object obj2 = null;
        th = null;
        if (C74947TbD.LJIJJ(c28467BFf)) {
            if (c28467BFf != null && (responseData = (GuestMicCameraManageResponse.ResponseData) c28467BFf.data) != null && responseData.ratelimit) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i2 = (int) ((GuestMicCameraManageResponse.ResponseData) c28467BFf.data).expirationTime;
                LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) afS25S0301000_13.l0;
                if (linkPlayerInfo != null) {
                    user8 = linkPlayerInfo.mUser;
                } else {
                    user8 = null;
                }
                if (afS25S0301000_13.i3 == 1) {
                    i = R.plurals.ns;
                } else {
                    i = R.plurals.nt;
                }
                C30868C9o.LJI(C15380j0.LJIIIIZZ(i, i2, C05170If.LIZ(user8), String.valueOf(i2)));
            } else {
                int i3 = afS25S0301000_13.i3;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 == 3) {
                                LinkPlayerInfo linkPlayerInfo2 = (LinkPlayerInfo) afS25S0301000_13.l0;
                                if (linkPlayerInfo2 != null) {
                                    user7 = linkPlayerInfo2.mUser;
                                } else {
                                    user7 = null;
                                }
                                C30868C9o.LJI(C15380j0.LJIILL(R.string.n_h, C05170If.LIZ(user7)));
                            }
                        } else if (MultiGuestLiveShowConfigSetting.INSTANCE.isOpenLiveShow()) {
                            if (((TZL) afS25S0301000_13.l1) != TZL.ANCHOR_MUTE_AUDIO_WHEN_FIRST_FRAME) {
                                LinkPlayerInfo linkPlayerInfo3 = (LinkPlayerInfo) afS25S0301000_13.l0;
                                if (linkPlayerInfo3 != null) {
                                    user6 = linkPlayerInfo3.mUser;
                                } else {
                                    user6 = null;
                                }
                                C30868C9o.LJI(C15380j0.LJIILL(R.string.n_i, C05170If.LIZ(user6)));
                            }
                        } else {
                            LinkPlayerInfo linkPlayerInfo4 = (LinkPlayerInfo) afS25S0301000_13.l0;
                            if (linkPlayerInfo4 != null) {
                                user5 = linkPlayerInfo4.mUser;
                            } else {
                                user5 = null;
                            }
                            C30868C9o.LJI(C15380j0.LJIILL(R.string.n_i, C05170If.LIZ(user5)));
                        }
                    } else {
                        LinkPlayerInfo linkPlayerInfo5 = (LinkPlayerInfo) afS25S0301000_13.l0;
                        if (linkPlayerInfo5 != null) {
                            user3 = linkPlayerInfo5.mUser;
                        } else {
                            user3 = null;
                        }
                        C30868C9o.LJI(C15380j0.LJIILL(R.string.nby, C05170If.LIZ(user3)));
                        LinkPlayerInfo linkPlayerInfo6 = (LinkPlayerInfo) afS25S0301000_13.l0;
                        if (linkPlayerInfo6 != null && (user4 = linkPlayerInfo6.mUser) != null) {
                            l2 = Long.valueOf(user4.getId());
                        } else {
                            l2 = null;
                        }
                        C74947TbD.LIZ.put(l2, Long.valueOf(System.currentTimeMillis()));
                    }
                } else {
                    LinkPlayerInfo linkPlayerInfo7 = (LinkPlayerInfo) afS25S0301000_13.l0;
                    if (linkPlayerInfo7 != null) {
                        user = linkPlayerInfo7.mUser;
                    } else {
                        user = null;
                    }
                    C30868C9o.LJI(C15380j0.LJIILL(R.string.nbz, C05170If.LIZ(user)));
                    LinkPlayerInfo linkPlayerInfo8 = (LinkPlayerInfo) afS25S0301000_13.l0;
                    if (linkPlayerInfo8 != null && (user2 = linkPlayerInfo8.mUser) != null) {
                        l = Long.valueOf(user2.getId());
                    } else {
                        l = null;
                    }
                    C74947TbD.LIZ.put(l, Long.valueOf(System.currentTimeMillis()));
                }
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("realAnchorMuteGuestOp-> success data ");
            if (c28467BFf != null) {
                obj2 = c28467BFf.data;
            }
            LIZ.append(obj2);
            C0NB.LJIIIZ("anchorMuteGuest/anchor", X1D.LIZIZ(LIZ));
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("realAnchorMuteGuestOp-> failed: code = ");
        if (c28467BFf != null) {
            num = Integer.valueOf(c28467BFf.statusCode);
        } else {
            num = null;
        }
        LIZ2.append(num);
        LIZ2.append(",msg=");
        if (c28467BFf != null && (requestError2 = c28467BFf.LJ) != null) {
            str = requestError2.message;
        } else {
            str = null;
        }
        JBR.LJIIJ(LIZ2, str, LIZ2, "anchorMuteGuest/anchor");
        Context context = (Context) afS25S0301000_13.l2;
        if (c28467BFf != null && (requestError = c28467BFf.LJ) != null) {
            th = new Throwable(requestError.message);
        }
        BPP.LIZJ(context, th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS25S0301000_13(int i, int i2, Map<String, C04750Gp> map, C76469Tzl c76469Tzl, C76732zl c76732zl) {
        this.$t = c76732zl;
        this.i3 = i;
        this.l0 = i2;
        this.l1 = map;
        this.l2 = c76469Tzl;
    }
}
