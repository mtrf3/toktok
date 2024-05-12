package X;

import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Trm, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75974Trm extends C0A6 {
    public final /* synthetic */ C75975Trn LJLIL;

    public final void LJIIZILJ() {
        int i;
        int i2;
        int i3;
        int i4;
        C31413CUn c31413CUn;
        List<?> list;
        C75981Trt c75981Trt;
        boolean z;
        if (this.LJLIL.LIZ.getLayoutManager() instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.LJLIL.LIZ.getLayoutManager();
            if (linearLayoutManager != null) {
                i2 = linearLayoutManager.LLILLIZIL();
                i3 = linearLayoutManager.LLIL();
                i4 = linearLayoutManager.LLILLJJLI();
                i = linearLayoutManager.LLILL();
                if (i3 == -1 || i2 == -1) {
                    return;
                }
            } else {
                i = 0;
                i2 = 0;
                i3 = 0;
                i4 = 0;
            }
            AbstractC029409q adapter = this.LJLIL.LIZ.getAdapter();
            if (!(adapter instanceof C31413CUn) || (c31413CUn = (C31413CUn) adapter) == null || (list = c31413CUn.LJLIL) == null) {
                return;
            }
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                Object obj = ListProtector.get(list, i5);
                if ((obj instanceof C75981Trt) && (c75981Trt = (C75981Trt) obj) != null) {
                    boolean z2 = true;
                    if (i3 <= i5 && i5 <= i2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c75981Trt.LJLJLLL = z;
                    if (i > i5 || i5 > i4) {
                        z2 = false;
                    }
                    c75981Trt.LJLL = z2;
                }
            }
        }
    }

    public C75974Trm(C75975Trn c75975Trn) {
        this.LJLIL = c75975Trn;
    }

    public final void LJIILLIIL(Object obj) {
        int i;
        int i2;
        String str;
        RivalExtraInfo.Tag tag;
        String str2;
        boolean z;
        if (obj == null) {
            return;
        }
        int i3 = 1;
        if (obj instanceof C75981Trt) {
            C75981Trt c75981Trt = (C75981Trt) obj;
            if (!this.LJLIL.LJIIL.containsKey(c75981Trt.LJLIL.getIdStr())) {
                HashMap<String, Long> hashMap = this.LJLIL.LJIIL;
                String idStr = c75981Trt.LJLIL.getIdStr();
                o.LJIIIIZZ(idStr, "item.room.idStr");
                hashMap.put(idStr, Long.valueOf(System.currentTimeMillis()));
            }
            int i4 = 0;
            if (c75981Trt.LJLJI == EnumC75614Tly.RECOMMEND_INVITE) {
                this.LJLIL.LJ.add(c75981Trt.LJLIL.getIdStr());
                if (C29306Beo.LJIJJLI(c75981Trt.LIZ())) {
                    this.LJLIL.LJIIIIZZ.add(c75981Trt.LJLIL.getIdStr());
                }
                if (c75981Trt.LJLILLLLZI.topIndex > 0) {
                    this.LJLIL.LJII.add(c75981Trt.LJLIL.getIdStr());
                }
            }
            if (c75981Trt.LJLJI == EnumC75614Tly.FOLLOW_INVITE) {
                if (c75981Trt.LJLILLLLZI.topIndex > 0) {
                    this.LJLIL.LJFF.add(c75981Trt.LJLIL.getIdStr());
                }
                if (C29306Beo.LJIJJLI(c75981Trt.LIZ())) {
                    this.LJLIL.LJI.add(c75981Trt.LJLIL.getIdStr());
                }
            }
            User owner = c75981Trt.LJLIL.getOwner();
            o.LJIIIIZZ(owner, "item.room.owner");
            if (C44432HcC.LJIJ(owner)) {
                RivalExtraInfo rivalExtraInfo = c75981Trt.LJLJJI;
                this.LJLIL.LJIIJJI.add(c75981Trt.LJLIL.getIdStr());
                if (rivalExtraInfo != null) {
                    if (C78596Usy.LJIIIZ(rivalExtraInfo)) {
                        if (rivalExtraInfo != null && rivalExtraInfo.showPlayType == EnumC75767ToR.PLAYTYPE_APPLY.value) {
                            this.LJLIL.LJIIIZ.add(c75981Trt.LJLIL.getIdStr());
                        }
                    }
                }
                this.LJLIL.LJIIJ.add(c75981Trt.LJLIL.getIdStr());
            }
            if (!c75981Trt.LJLJLJ) {
                c75981Trt.LJLJLJ = true;
                C53734L7a c53734L7a = (C53734L7a) ((LinkedHashMap) C75642TmQ.LIZIZ).get(Long.valueOf(c75981Trt.LJLIL.getId()));
                if (c53734L7a != null) {
                    c53734L7a.LIZIZ = Boolean.TRUE;
                }
                String str3 = "";
                if (this.LJLIL.LIZJ) {
                    String str4 = c75981Trt.LJLJJL;
                    if (str4 != null) {
                        str3 = str4;
                    }
                    Room room = c75981Trt.LJLIL;
                    EnumC75614Tly enumC75614Tly = c75981Trt.LJLJI;
                    RivalExtraInfo rivalExtraInfo2 = c75981Trt.LJLJJI;
                    if (c75981Trt.LJLJJLL != EnumC76024Tsa.IDLE) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C75642TmQ.LJJJLL(str3, room, enumC75614Tly, rivalExtraInfo2, z, c75981Trt.LJLLILLLL, C44432HcC.LJIIIIZZ().getType());
                    return;
                }
                String str5 = c75981Trt.LJLJJL;
                Room room2 = c75981Trt.LJLIL;
                EnumC75614Tly enumC75614Tly2 = c75981Trt.LJLJI;
                if (enumC75614Tly2 != null) {
                    i = enumC75614Tly2.getType();
                } else {
                    i = 0;
                }
                RivalExtraInfo rivalExtraInfo3 = c75981Trt.LJLJJI;
                if (c75981Trt.LJLJJLL != EnumC76024Tsa.IDLE) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                if (room2 == null || room2.getOwner() == null) {
                    return;
                }
                if (rivalExtraInfo3 != null && rivalExtraInfo3.inviteBlockReason == 0) {
                    i4 = 1;
                }
                if (i == 1) {
                    str = "mutual_follow";
                } else {
                    str = "recommend";
                }
                HashMap LIZ = C45243HpH.LIZ("connection_type", "anchor", "invitee_list", str);
                LIZ.put("invitee_status", String.valueOf(i4));
                LIZ.put("invitee_id", String.valueOf(room2.getOwnerUserId()));
                LIZ.put("invited_room_id", room2.getIdStr());
                LIZ.put("connection_inviter_id", String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
                LIZ.put("connection_invitee_id", String.valueOf(room2.getOwnerUserId()));
                if (!TextUtils.isEmpty(str5)) {
                    LIZ.put("request_id", str5);
                }
                B5G.LIZIZ();
                C75648TmW c75648TmW = B5G.LIZIZ().LJJJ;
                if (c75648TmW != null && (str2 = c75648TmW.LIZ) != null) {
                    str3 = str2;
                }
                if (!TextUtils.isEmpty(str3)) {
                    LIZ.put("enter_from", str3);
                }
                LIZ.put("is_icon_show_anchor", String.valueOf(i2));
                if (rivalExtraInfo3 != null && (tag = rivalExtraInfo3.tag) != null) {
                    LIZ.put("relation_type", String.valueOf(tag.tagType));
                }
                C75017TcL.LJJIFFI("connection_invite_show", LIZ);
                return;
            }
            return;
        }
        if (!(obj instanceof C76059Tt9)) {
            return;
        }
        C76059Tt9 c76059Tt9 = (C76059Tt9) obj;
        this.LJLIL.getClass();
        if (c76059Tt9.LJLIL) {
            return;
        }
        c76059Tt9.LJLIL = true;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_cohost_guide_show");
        if (!(c76059Tt9 instanceof C76060TtA)) {
            i3 = 2;
        }
        UFE.LIZIZ(i3, LIZ2, "cohost_guide_type");
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0) {
            LJIIZILJ();
            AbstractC76019TsV abstractC76019TsV = this.LJLIL.LIZIZ;
            if (abstractC76019TsV != null) {
                abstractC76019TsV.LJIIL();
            }
        }
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        int i3;
        int i4;
        C31413CUn c31413CUn;
        List<?> list;
        o.LJIIIZ(recyclerView, "recyclerView");
        if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            if (linearLayoutManager != null) {
                i3 = linearLayoutManager.LLILLIZIL();
                i4 = linearLayoutManager.LLIL();
                if (i4 == -1 || i3 == -1) {
                    return;
                }
            } else {
                i3 = 0;
                i4 = 0;
            }
            AbstractC029409q adapter = recyclerView.getAdapter();
            if (!(adapter instanceof C31413CUn) || (c31413CUn = (C31413CUn) adapter) == null || (list = c31413CUn.LJLIL) == null) {
                return;
            }
            if (i2 == 0) {
                LJIIZILJ();
                if (i4 > i3) {
                    return;
                }
                while (i4 < list.size()) {
                    LJIILLIIL(ListProtector.get(list, i4));
                    if (i4 == i3) {
                        return;
                    } else {
                        i4++;
                    }
                }
                return;
            }
            if (i3 >= list.size() || !(ListProtector.get(list, i3) instanceof C75981Trt)) {
                return;
            }
            LJIILLIIL(ListProtector.get(list, i3));
        }
    }
}
