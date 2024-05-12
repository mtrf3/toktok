package X;

import Y.ARunnableS29S0200000_10;
import Y.IDbS398S0100000_1;
import Y.IDbS399S0100000_10;
import Y.IDcS407S0100000_10;
import android.os.SystemClock;
import com.bytedance.im.core.proto.MessagesPerUserInitV2ResponseBody;
import com.bytedance.im.core.proto.RequestBody;
import com.bytedance.im.core.proto.Response;
import com.bytedance.im.core.proto.ResponseBody;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* renamed from: X.Osk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63294Osk extends AbstractC63515OwJ {
    public final int LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;
    public long LJIILL;
    public long LJIILLIIL;
    public long LJIIZILJ;
    public int LJIJ;

    @Override // X.AbstractC63515OwJ
    public final boolean LJFF() {
        return true;
    }

    public C63294Osk(int i) {
        super(EnumC63625Oy5.GET_MESSAGES_BY_USER_INIT_V2.getValue());
        this.LJFF = 0;
        this.LJI = 0;
        this.LJII = 0;
        this.LJIIJ = 0L;
        this.LJIIJJI = 0L;
        this.LJIIL = 0L;
        this.LJIILIIL = 0L;
        this.LJIILJJIL = 0L;
        this.LJIILL = 0L;
        this.LJIILLIIL = 0L;
        this.LJIIZILJ = 0L;
        this.LJIJ = 0;
        this.LIZJ = i;
    }

    @Override // X.AbstractC63515OwJ
    public final boolean LJIIIZ(C63622Oy2 c63622Oy2) {
        ResponseBody responseBody = c63622Oy2.LJLJL.body;
        if (responseBody != null && responseBody.messages_per_user_init_v2_body != null) {
            return true;
        }
        return false;
    }

    public final void LJIILLIIL(long j) {
        this.LJIIZILJ = j;
        long uptimeMillis = SystemClock.uptimeMillis();
        C63486Ovq c63486Ovq = new C63486Ovq();
        c63486Ovq.LIZLLL = Long.valueOf(j);
        C63308Osy.LJI().LIZIZ().isNewUser();
        c63486Ovq.LJ = 0;
        C63308Osy.LJI().LIZLLL().getClass();
        C89453Z8v c89453Z8v = new C89453Z8v();
        c89453Z8v.LJFF = c63486Ovq.build();
        RequestBody build = c89453Z8v.build();
        C63272OsO.LIZ = false;
        LJIIJJI(this.LIZJ, build, null, new Object[0]);
        this.LJIIJJI = (SystemClock.uptimeMillis() - uptimeMillis) + this.LJIIJJI;
        this.LJIIIZ = SystemClock.uptimeMillis();
    }

    public final void LJIIZILJ(boolean z) {
        this.LIZLLL = z;
        StringBuilder LJI = JBR.LJI("IMInitHandler init, isRetry:", z, ", inbox:");
        LJI.append(this.LIZJ);
        C63322OtC.LJFF(X1D.LIZIZ(LJI));
        if (C63269OsL.LJFF(this.LIZJ)) {
            C63322OtC.LJFF("IMInitHandler init, already doing, return");
            return;
        }
        if (!z) {
            int i = this.LIZJ;
            ((CopyOnWriteArraySet) C63269OsL.LIZ).add(Integer.valueOf(i));
            C63308Osy.LJI().LIZIZ().LJIIL(i, 0);
        }
        C63291Osh LIZ = C63291Osh.LIZ();
        int i2 = this.LIZJ;
        LIZ.getClass();
        if (C63291Osh.LIZLLL.getBoolean(C63291Osh.LJIIIIZZ(i2, "im_init"))) {
            C63322OtC.LJFF("IMInitHandler init, already inited");
            RunnableC63345OtZ.LJ(new IDcS407S0100000_10(this, 9), new IDbS399S0100000_10(this, 10), false);
            C4ZF.LIZ().LIZ = true;
            return;
        }
        if (this.LIZJ == 3 && !C63308Osy.LJI().LIZLLL().LJLJJL) {
            C63322OtC.LJFF("IMInitHandler init, skip stranger inbox");
            return;
        }
        if (this.LIZJ == 0) {
            C63291Osh.LIZ().getClass();
            C63291Osh.LIZLLL.putBoolean(C63291Osh.LJIIIZ("allow_conversation_pagination"), true);
        }
        C63291Osh.LIZ().getClass();
        C63291Osh.LIZLLL.putBoolean(C63291Osh.LJIIIZ("msg_flag_bits_updated"), true);
        int i3 = this.LIZJ;
        ((CopyOnWriteArraySet) C63269OsL.LJFF).add(Integer.valueOf(i3));
        C63308Osy.LJI().LIZIZ().LJIIJ(this.LIZJ, 0);
        this.LJIIIIZZ = SystemClock.uptimeMillis();
        C63291Osh LIZ2 = C63291Osh.LIZ();
        int i4 = this.LIZJ;
        InterfaceC63293Osj interfaceC63293Osj = C63291Osh.LIZLLL;
        LIZ2.getClass();
        LJIILLIIL(interfaceC63293Osj.LIZLLL(0L, C63291Osh.LJIIIIZZ(i4, "im_init_page_cursor")));
        C63337OtR.LJI("im_total_pull", "get_session");
    }

    public static /* synthetic */ void LJIILIIL(C63294Osk c63294Osk, long j) {
        c63294Osk.LJIILLIIL += j;
    }

    @Override // X.AbstractC63515OwJ
    public final void LJII(C63622Oy2 c63622Oy2, ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
        boolean z;
        Response response;
        Response response2;
        boolean z2;
        MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody;
        Long l;
        boolean z3 = false;
        if (C63308Osy.LJI().LIZLLL().LJJIJIIJIL.initConvListPullAsyncEnable != 0) {
            this.LJIIJ = (SystemClock.uptimeMillis() - this.LJIIIZ) + this.LJIIJ;
            long uptimeMillis = SystemClock.uptimeMillis();
            if (c63622Oy2.LJIIJ() && LJIIIZ(c63622Oy2)) {
                z2 = true;
            } else {
                z2 = false;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("IMInitHandler handleResponse, seqId:");
            V1I.LIZJ(LIZ, c63622Oy2.LJLIL, ", isSuccess:", z2);
            C63322OtC.LJFF(X1D.LIZIZ(LIZ));
            if (z2) {
                messagesPerUserInitV2ResponseBody = c63622Oy2.LJLJL.body.messages_per_user_init_v2_body;
            } else {
                messagesPerUserInitV2ResponseBody = null;
            }
            if (z2) {
                if (messagesPerUserInitV2ResponseBody.init_type == P09.TYPE_BY_USER) {
                    z3 = true;
                }
                this.LJ = z3;
            }
            this.LJIILLIIL = (SystemClock.uptimeMillis() - uptimeMillis) + this.LJIILLIIL;
            RunnableC63345OtZ.LIZLLL(new C63299Osp(this, z2, c63622Oy2, messagesPerUserInitV2ResponseBody), new C63295Osl(this, SystemClock.uptimeMillis(), z2, messagesPerUserInitV2ResponseBody, c63622Oy2), C63346Ota.LIZJ());
            if (z2 && messagesPerUserInitV2ResponseBody.has_more.booleanValue() && (l = messagesPerUserInitV2ResponseBody.next_cursor) != null) {
                LJIILLIIL(l.longValue());
                return;
            }
            return;
        }
        this.LJIIJ = (SystemClock.uptimeMillis() - this.LJIIIZ) + this.LJIIJ;
        long uptimeMillis2 = SystemClock.uptimeMillis();
        if (c63622Oy2.LJIIJ() && LJIIIZ(c63622Oy2)) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("IMInitHandler handleResponse, logId: ");
        LIZ2.append(c63622Oy2.LJIIIIZZ());
        LIZ2.append(" seqId:");
        V1I.LIZJ(LIZ2, c63622Oy2.LJLIL, ", isSuccess:", z);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ2));
        if (z) {
            this.LJFF++;
            MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody2 = c63622Oy2.LJLJL.body.messages_per_user_init_v2_body;
            C63291Osh LIZ3 = C63291Osh.LIZ();
            int i = this.LIZJ;
            LIZ3.getClass();
            long LIZLLL = C63291Osh.LIZLLL(i);
            long j = 0;
            if (LIZLLL <= 0) {
                C63291Osh LIZ4 = C63291Osh.LIZ();
                int i2 = this.LIZJ;
                Long l2 = messagesPerUserInitV2ResponseBody2.per_user_cursor;
                if (l2 != null) {
                    j = l2.longValue();
                }
                LIZ4.getClass();
                C63291Osh.LJIIJJI(i2, j);
            }
            if (messagesPerUserInitV2ResponseBody2.init_type == P09.TYPE_BY_USER) {
                z3 = true;
            }
            this.LJ = z3;
            this.LJIILLIIL = (SystemClock.uptimeMillis() - uptimeMillis2) + this.LJIILLIIL;
            RunnableC63345OtZ.LIZLLL(new C63298Oso(this, c63622Oy2, messagesPerUserInitV2ResponseBody2), new C63296Osm(this, SystemClock.uptimeMillis(), messagesPerUserInitV2ResponseBody2, c63622Oy2), C63346Ota.LIZJ());
            return;
        }
        if (this.LIZJ == 3 && (response2 = c63622Oy2.LJLJL) != null && response2.status_code.intValue() == AbstractC63551Owt.LJI) {
            C63308Osy.LJI().LIZLLL().LJLJJL = false;
            C115394fv.LJII().LJ();
            return;
        }
        if (this.LJIJ < 10 && (response = c63622Oy2.LJLJL) != null && response.status_code.intValue() != -1000 && c63622Oy2.LJLJL.body != null) {
            this.LJIJ++;
            LJIILLIIL(this.LJIIZILJ);
            return;
        }
        C63308Osy.LJI().LIZIZ().LJIIJ(this.LIZJ, 1);
        this.LJIILLIIL = (SystemClock.uptimeMillis() - uptimeMillis2) + this.LJIILLIIL;
        LJIILJJIL(true, true);
        C63337OtR.LJII(c63622Oy2, false).LIZ();
        C63272OsO.LJII(false, SystemClock.uptimeMillis() - this.LJIIIIZZ, this.LJFF, this.LJI, this.LJII, C63623Oy3.LIZ(c63622Oy2), this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL);
    }

    public final void LJIILJJIL(boolean z, boolean z2) {
        if (C63308Osy.LJI().LIZLLL().LJJL) {
            RunnableC63345OtZ.LJ(new C63300Osq(this, z, z2), null, false);
        } else {
            LJIJ(z, z2);
        }
    }

    public final void LJIJ(boolean z, final boolean z2) {
        long uptimeMillis = SystemClock.uptimeMillis();
        int i = this.LIZJ;
        ((CopyOnWriteArraySet) C63269OsL.LJFF).remove(Integer.valueOf(i));
        C63308Osy.LJI().getClass();
        C63291Osh.LIZ().getClass();
        if (!C63291Osh.LIZLLL.getBoolean(C63291Osh.LJIIIZ("allow_conversation_pagination"))) {
            RunnableC63345OtZ.LJ(new C62814Ol0(), null, false);
        }
        final C115284fk LJIILIIL = C115284fk.LJIILIIL();
        LJIILIIL.getClass();
        C63308Osy.LJI().getClass();
        C63291Osh.LIZ().getClass();
        if (C63291Osh.LIZLLL.getBoolean(C63291Osh.LJIIIZ("allow_conversation_pagination"))) {
            final long uptimeMillis2 = SystemClock.uptimeMillis();
            if (((ConcurrentHashMap) LJIILIIL.LJ).containsKey("preload")) {
                C63322OtC.LJFF("ConversationListModel preAsync already isSyncing");
            } else if (!z2 && LJIILIIL.LJI && C63308Osy.LJI().LIZLLL().LJJIJIIJIL.batchQueryEnable != 0) {
                C63322OtC.LJFF("ConversationListModel preAsync first loaded");
            } else {
                ((ConcurrentHashMap) LJIILIIL.LJ).put("preload", LJIILIIL.LJFF);
                LJIILIIL.LJI = true;
                C63322OtC.LJFF("ConversationListModel start preAsync");
                RunnableC63345OtZ.LJ(new InterfaceC63352Otg<C81913Jj>() { // from class: X.4WI
                    @Override // X.InterfaceC63352Otg
                    public final C81913Jj LIZIZ() {
                        List<C63120Opw> LJIIIIZZ;
                        Integer valueOf;
                        C81913Jj c81913Jj;
                        boolean z3;
                        if (!((CopyOnWriteArraySet) C115284fk.this.LJII).isEmpty()) {
                            Iterator it = ((CopyOnWriteArraySet) C115284fk.this.LJII).iterator();
                            while (it.hasNext()) {
                                ((C4WS) it.next()).LJII();
                            }
                        }
                        C115284fk c115284fk = C115284fk.this;
                        c115284fk.getClass();
                        C81963Jo c81963Jo = new C81963Jo("preload", 0);
                        long uptimeMillis3 = SystemClock.uptimeMillis();
                        C114444eO LIZLLL = C63308Osy.LJI().LIZLLL();
                        if (LIZLLL != null) {
                            C63150OqQ.LJII(LIZLLL.LJJIFFI);
                        }
                        int i2 = C63308Osy.LJI().LIZLLL().LJJIIJZLJL;
                        if (C63308Osy.LJI().LIZLLL().LJJIIZ && C63308Osy.LJI().LIZLLL().LJIJI) {
                            LJIIIIZZ = C63133Oq9.LJIIJJI(i2 + 1);
                        } else {
                            LJIIIIZZ = C63133Oq9.LJIIIIZZ(-1);
                            C4WK.LIZIZ().LIZJ(LJIIIIZZ, false);
                            C63308Osy.LJI().LIZLLL().getClass();
                        }
                        C4WO.LIZIZ().getClass();
                        C47922IrO.LIZ();
                        c115284fk.LJIIIIZZ = SystemClock.uptimeMillis() - uptimeMillis3;
                        long uptimeMillis4 = SystemClock.uptimeMillis();
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("ConversationListModel preSyncConversionList, totalCount:");
                        if (LJIIIIZZ == null) {
                            valueOf = null;
                        } else {
                            valueOf = Integer.valueOf(LJIIIIZZ.size());
                        }
                        LIZ.append(valueOf);
                        LIZ.append(", limit:");
                        LIZ.append(i2);
                        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
                        if (LJIIIIZZ == null || LJIIIIZZ.isEmpty()) {
                            c115284fk.LJIIIZ = -1L;
                            c81913Jj = new C81913Jj(c81963Jo, C61878OQg.INSTANCE, false, Long.MAX_VALUE, 0, false);
                        } else if (i2 > 0) {
                            int size = LJIIIIZZ.size();
                            C115284fk.LJJIFFI(LJIIIIZZ);
                            if (LJIIIIZZ.size() > i2) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (C63308Osy.LJI().LIZLLL().LJIJI) {
                                if (LJIIIIZZ.size() > i2) {
                                    LJIIIIZZ = LJIIIIZZ.subList(0, i2);
                                }
                                c115284fk.LJJIIJ(LJIIIIZZ);
                            }
                            long sortOrder = ((C63120Opw) DIX.LIZJ(LJIIIIZZ, 1, LJIIIIZZ)).getSortOrder();
                            c115284fk.LJIIIZ = SystemClock.uptimeMillis() - uptimeMillis4;
                            c81913Jj = new C81913Jj(c81963Jo, LJIIIIZZ, z3, sortOrder, size, false);
                        } else {
                            c115284fk.LJIIIZ = -1L;
                            c81913Jj = new C81913Jj(c81963Jo, new ArrayList(), true, Long.MAX_VALUE, 0, false);
                        }
                        int size2 = c81913Jj.LJLILLLLZI.size();
                        boolean z4 = z2;
                        long uptimeMillis5 = SystemClock.uptimeMillis() - uptimeMillis2;
                        C115284fk c115284fk2 = C115284fk.this;
                        C63272OsO.LJ(size2, uptimeMillis5, c115284fk2.LJIIIIZZ, c115284fk2.LJIIIZ, true, z4);
                        return c81913Jj;
                    }
                }, new IDbS398S0100000_1(LJIILIIL, 4), false);
            }
        } else {
            final long uptimeMillis3 = SystemClock.uptimeMillis();
            if (((ConcurrentHashMap) LJIILIIL.LJ).containsKey("legacy")) {
                C63322OtC.LJFF("ConversationListModel async, already isSyncing");
            } else {
                ((ConcurrentHashMap) LJIILIIL.LJ).put("preload", LJIILIIL.LJFF);
                C63322OtC.LJFF("ConversationListModel start async");
                RunnableC63345OtZ.LJ(new InterfaceC63352Otg<List<C63120Opw>>() { // from class: X.4WJ
                    @Override // X.InterfaceC63352Otg
                    public final List<C63120Opw> LIZIZ() {
                        C115284fk c115284fk = C115284fk.this;
                        c115284fk.getClass();
                        long uptimeMillis4 = SystemClock.uptimeMillis();
                        C114444eO LIZLLL = C63308Osy.LJI().LIZLLL();
                        if (LIZLLL != null) {
                            C63150OqQ.LJII(LIZLLL.LJJIFFI);
                        }
                        List<C63120Opw> LJIIIIZZ = C63133Oq9.LJIIIIZZ(-1);
                        C4WO.LIZIZ().getClass();
                        C47922IrO.LIZ();
                        C4WK.LIZIZ().LIZJ(LJIIIIZZ, false);
                        C63308Osy.LJI().LIZLLL().getClass();
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("duration", SystemClock.uptimeMillis() - uptimeMillis4);
                            C63337OtR.LIZLLL("im_sync_conversation_list_duration", jSONObject);
                        } catch (Exception unused) {
                        }
                        c115284fk.LJIIIIZZ = SystemClock.uptimeMillis() - uptimeMillis4;
                        int i2 = C63308Osy.LJI().LIZLLL().LJJIIJ;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("ConversationListModel syncConversionList, totalCount:");
                        ArrayList arrayList = (ArrayList) LJIIIIZZ;
                        LIZ.append(Integer.valueOf(arrayList.size()));
                        LIZ.append(", limit:");
                        LIZ.append(i2);
                        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
                        if (!arrayList.isEmpty()) {
                            if (i2 > 0 && arrayList.size() > i2) {
                                C115284fk.LJJIFFI(LJIIIIZZ);
                                LJIIIIZZ = arrayList.subList(0, i2);
                            }
                            c115284fk.LJJIIJ(LJIIIIZZ);
                            return LJIIIIZZ;
                        }
                        return new ArrayList();
                    }
                }, new InterfaceC63353Oth<List<C63120Opw>>() { // from class: X.4WM
                    @Override // X.InterfaceC63353Oth
                    public final void LIZLLL(List<C63120Opw> list) {
                        C63272OsO.LJ(list.size(), SystemClock.uptimeMillis() - uptimeMillis3, C115284fk.this.LJIIIIZZ, 0L, false, z2);
                        C47922IrO.LIZ();
                        if (!((CopyOnWriteArraySet) C115284fk.this.LIZLLL).isEmpty()) {
                            C63322OtC.LJFF("ConversationListModel async onCallback");
                            Iterator it = ((CopyOnWriteArraySet) C115284fk.this.LIZLLL).iterator();
                            while (it.hasNext()) {
                                ((C4WP) it.next()).dU(C115284fk.this.LIZ);
                            }
                        }
                        C4WK.LIZIZ().LIZLLL();
                        ((ConcurrentHashMap) C115284fk.this.LJ).remove("preload");
                        C4ZF.LIZ().LIZIZ();
                        C47922IrO.LIZ();
                    }
                }, false);
            }
        }
        if (this.LIZLLL) {
            C63269OsL.LIZLLL(false);
        } else if (z) {
            C63308Osy.LJI().LJIIL(this.LIZJ, 0);
        } else {
            C63309Osz.LIZLLL().LIZIZ(this.LIZJ);
        }
        this.LJIILL = (SystemClock.uptimeMillis() - uptimeMillis) + this.LJIILL;
        C47922IrO.LIZ();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(4:20|21|(3:23|24|(3:56|57|58)(5:26|27|(7:31|(1:52)|37|(1:39)|40|(1:48)|49)|53|54))(3:59|60|61)|55)|17|18) */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x024a, code lost:
    
        r6 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x029c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair<java.lang.Long, java.lang.Long> LJIILL(X.C63622Oy2 r25, int r26, com.bytedance.im.core.proto.MessagesPerUserInitV2ResponseBody r27, long r28) {
        /*
            Method dump skipped, instructions count: 671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63294Osk.LJIILL(X.Oy2, int, com.bytedance.im.core.proto.MessagesPerUserInitV2ResponseBody, long):android.util.Pair");
    }

    public final void LJIJI(int i, int i2, boolean z, String str, long j, String str2) {
        if (!C63308Osy.LJI().LIZLLL().LJLLL) {
            return;
        }
        RunnableC63345OtZ.LJ(new C63297Osn(this, j, i, i2, z, str, str2), new C78555UsJ(), false);
    }
}
