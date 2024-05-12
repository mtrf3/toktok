package X;

import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.im.core.proto.Request;
import com.bytedance.im.core.proto.Response;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.OxN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC63581OxN implements InterfaceC63516OwK, InterfaceC63351Otf {
    public final HandlerC63347Otb LJLIL;
    public final HandlerC63347Otb LJLILLLLZI;
    public HandlerC63347Otb LJLJI;
    public final boolean LJLJLJ;
    public final ConcurrentLinkedQueue<C63622Oy2> LJLJJI = new ConcurrentLinkedQueue<>();
    public long LJLJJL = 0;
    public int LJLJJLL = 0;
    public long LJLJL = 0;
    public final boolean LJLJLLL = C63308Osy.LJI().LIZLLL().LJLLI;

    @Override // X.InterfaceC63516OwK
    public final EnumC35451Dvj LIZ() {
        return null;
    }

    public abstract String LJIIIZ();

    public abstract void LJIIJJI(C63622Oy2 c63622Oy2);

    public abstract void LJIIL(C63622Oy2 c63622Oy2);

    public void LJI() {
        this.LJLJJI.clear();
    }

    public AbstractC63581OxN() {
        HandlerThread handlerThread = new HandlerThread(LJIIIZ());
        handlerThread.start();
        this.LJLIL = new HandlerC63347Otb(handlerThread.getLooper(), this);
        this.LJLILLLLZI = new HandlerC63347Otb(handlerThread.getLooper(), this);
        boolean z = C63308Osy.LJI().LIZLLL().LJJJJLI.logCmdUsage;
        this.LJLJLJ = z;
        String LJIIIIZZ = LJIIIIZZ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BaseRequestManager logCmd:");
        LIZ.append(z);
        C63322OtC.LIZIZ(LJIIIIZZ, X1D.LIZIZ(LIZ));
    }

    public String LJIIIIZZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LJLLJ(getClass()));
        LIZ.append(" ");
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC63516OwK
    public final void clear() {
        LJI();
        this.LJLIL.removeMessages(101);
        this.LJLILLLLZI.removeMessages(102);
        this.LJLIL.removeMessages(103);
        this.LJLIL.removeMessages(105);
    }

    public static void LJIJJ(C63622Oy2 c63622Oy2) {
        Object[] objArr;
        if (c63622Oy2.LJLJJLL == null || c63622Oy2.LJFF() != EnumC63625Oy5.SEND_MESSAGE.getValue() || c63622Oy2.LJLLJ > 0 || c63622Oy2.LJLLL > 0 || (objArr = c63622Oy2.LJLJJL) == null || objArr.length <= 1) {
            return;
        }
        Object obj = objArr[1];
        if (!(obj instanceof Boolean) || !((Boolean) obj).booleanValue()) {
            return;
        }
        C63275OsR.LIZIZ().LIZLLL(EnumC63665Oyj.COUNTER, "send_msg_by_ws", null);
    }

    @Override // X.InterfaceC63516OwK
    public final void LIZIZ(Long l) {
        Message obtain = Message.obtain();
        obtain.what = 106;
        obtain.obj = l;
        this.LJLILLLLZI.sendMessage(obtain);
    }

    @Override // X.InterfaceC63516OwK
    public final void LIZJ(HandlerC63347Otb handlerC63347Otb) {
        this.LJLJI = handlerC63347Otb;
    }

    @Override // X.InterfaceC63516OwK
    public final void LIZLLL(List<Long> list) {
        if (list == null || list.isEmpty() || this.LJLJJI.isEmpty()) {
            return;
        }
        for (Long l : list) {
            Iterator<C63622Oy2> it = this.LJLJJI.iterator();
            while (true) {
                if (it.hasNext()) {
                    C63622Oy2 next = it.next();
                    if (l.longValue() == next.LJLIL) {
                        next.LJLJJI = null;
                        break;
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC63516OwK
    public final void LJ(C63622Oy2 c63622Oy2) {
        Request request = c63622Oy2.LJLJJLL;
        if (request != null && request.cmd.intValue() > EnumC63625Oy5.IMCMD_NOT_USED.getValue()) {
            InterfaceC63557Owz interfaceC63557Owz = c63622Oy2.LLD;
            if (interfaceC63557Owz != null) {
                C63546Owo c63546Owo = (C63546Owo) interfaceC63557Owz;
                if (c63546Owo.LIZIZ.LIZ == 0) {
                    c63546Owo.LIZIZ.LIZ = SystemClock.uptimeMillis();
                } else {
                    c63546Owo.LIZ("logHandlerSendTime");
                }
            }
            Message obtain = Message.obtain();
            obtain.what = 101;
            obtain.obj = c63622Oy2;
            this.LJLIL.sendMessage(obtain);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LJLLJ(getClass()));
        LIZ.append(" send abort, item invalid:");
        LIZ.append(c63622Oy2);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
    }

    public final C63622Oy2 LJII(long j) {
        Iterator<C63622Oy2> it = this.LJLJJI.iterator();
        while (it.hasNext()) {
            C63622Oy2 next = it.next();
            if (next.LJLJJLL != null && next.LJLIL == j) {
                return next;
            }
        }
        return null;
    }

    public void LJIILIIL(C63622Oy2 c63622Oy2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LJLLJ(getClass()));
        LIZ.append(" handleTimeOut");
        LIZ.append(c63622Oy2);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        if (c63622Oy2 != null) {
            c63622Oy2.LJIIJJI(-1002, "request time out");
            LJIILL(c63622Oy2);
        }
    }

    public void LJIILJJIL(C63622Oy2 c63622Oy2) {
        if (this.LJLJJI.contains(c63622Oy2)) {
            LJIJI(103, c63622Oy2);
            LJIJI(105, c63622Oy2);
            this.LJLJJI.remove(c63622Oy2);
            LJIILL(c63622Oy2);
        }
    }

    public final void LJIILL(C63622Oy2 c63622Oy2) {
        HandlerC63347Otb handlerC63347Otb = this.LJLJI;
        if (handlerC63347Otb != null) {
            Message obtain = Message.obtain(handlerC63347Otb, c63622Oy2.LJFF());
            obtain.obj = c63622Oy2;
            this.LJLJI.sendMessage(obtain);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x016e, code lost:
    
        if (X.C63308Osy.LJI().LIZLLL().LJIIL <= 0) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ac A[Catch: Oxw -> 0x01b7, TRY_LEAVE, TryCatch #0 {Oxw -> 0x01b7, blocks: (B:72:0x0094, B:75:0x00b0, B:76:0x00ef, B:78:0x00f8, B:80:0x0109, B:81:0x0160, B:82:0x010e, B:84:0x0114, B:86:0x0125, B:87:0x015c, B:88:0x012a, B:92:0x0172, B:94:0x0182, B:95:0x01a8, B:96:0x0187, B:98:0x018b, B:99:0x018f, B:104:0x01ac, B:107:0x019d, B:108:0x0164, B:110:0x00d2), top: B:71:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x019d A[Catch: Oxw -> 0x01b7, TryCatch #0 {Oxw -> 0x01b7, blocks: (B:72:0x0094, B:75:0x00b0, B:76:0x00ef, B:78:0x00f8, B:80:0x0109, B:81:0x0160, B:82:0x010e, B:84:0x0114, B:86:0x0125, B:87:0x015c, B:88:0x012a, B:92:0x0172, B:94:0x0182, B:95:0x01a8, B:96:0x0187, B:98:0x018b, B:99:0x018f, B:104:0x01ac, B:107:0x019d, B:108:0x0164, B:110:0x00d2), top: B:71:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0164 A[Catch: Oxw -> 0x01b7, TryCatch #0 {Oxw -> 0x01b7, blocks: (B:72:0x0094, B:75:0x00b0, B:76:0x00ef, B:78:0x00f8, B:80:0x0109, B:81:0x0160, B:82:0x010e, B:84:0x0114, B:86:0x0125, B:87:0x015c, B:88:0x012a, B:92:0x0172, B:94:0x0182, B:95:0x01a8, B:96:0x0187, B:98:0x018b, B:99:0x018f, B:104:0x01ac, B:107:0x019d, B:108:0x0164, B:110:0x00d2), top: B:71:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00d2 A[Catch: Oxw -> 0x01b7, TryCatch #0 {Oxw -> 0x01b7, blocks: (B:72:0x0094, B:75:0x00b0, B:76:0x00ef, B:78:0x00f8, B:80:0x0109, B:81:0x0160, B:82:0x010e, B:84:0x0114, B:86:0x0125, B:87:0x015c, B:88:0x012a, B:92:0x0172, B:94:0x0182, B:95:0x01a8, B:96:0x0187, B:98:0x018b, B:99:0x018f, B:104:0x01ac, B:107:0x019d, B:108:0x0164, B:110:0x00d2), top: B:71:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00b0 A[Catch: Oxw -> 0x01b7, TRY_ENTER, TryCatch #0 {Oxw -> 0x01b7, blocks: (B:72:0x0094, B:75:0x00b0, B:76:0x00ef, B:78:0x00f8, B:80:0x0109, B:81:0x0160, B:82:0x010e, B:84:0x0114, B:86:0x0125, B:87:0x015c, B:88:0x012a, B:92:0x0172, B:94:0x0182, B:95:0x01a8, B:96:0x0187, B:98:0x018b, B:99:0x018f, B:104:0x01ac, B:107:0x019d, B:108:0x0164, B:110:0x00d2), top: B:71:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f8 A[Catch: Oxw -> 0x01b7, TryCatch #0 {Oxw -> 0x01b7, blocks: (B:72:0x0094, B:75:0x00b0, B:76:0x00ef, B:78:0x00f8, B:80:0x0109, B:81:0x0160, B:82:0x010e, B:84:0x0114, B:86:0x0125, B:87:0x015c, B:88:0x012a, B:92:0x0172, B:94:0x0182, B:95:0x01a8, B:96:0x0187, B:98:0x018b, B:99:0x018f, B:104:0x01ac, B:107:0x019d, B:108:0x0164, B:110:0x00d2), top: B:71:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0114 A[Catch: Oxw -> 0x01b7, TryCatch #0 {Oxw -> 0x01b7, blocks: (B:72:0x0094, B:75:0x00b0, B:76:0x00ef, B:78:0x00f8, B:80:0x0109, B:81:0x0160, B:82:0x010e, B:84:0x0114, B:86:0x0125, B:87:0x015c, B:88:0x012a, B:92:0x0172, B:94:0x0182, B:95:0x01a8, B:96:0x0187, B:98:0x018b, B:99:0x018f, B:104:0x01ac, B:107:0x019d, B:108:0x0164, B:110:0x00d2), top: B:71:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0172 A[Catch: Oxw -> 0x01b7, TryCatch #0 {Oxw -> 0x01b7, blocks: (B:72:0x0094, B:75:0x00b0, B:76:0x00ef, B:78:0x00f8, B:80:0x0109, B:81:0x0160, B:82:0x010e, B:84:0x0114, B:86:0x0125, B:87:0x015c, B:88:0x012a, B:92:0x0172, B:94:0x0182, B:95:0x01a8, B:96:0x0187, B:98:0x018b, B:99:0x018f, B:104:0x01ac, B:107:0x019d, B:108:0x0164, B:110:0x00d2), top: B:71:0x0094 }] */
    /* JADX WARN: Type inference failed for: r1v11, types: [X.P0x] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ(X.C63622Oy2 r18) {
        /*
            Method dump skipped, instructions count: 995
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63581OxN.LJIIZILJ(X.Oy2):void");
    }

    public final void LJIJ(C63622Oy2 c63622Oy2) {
        if (c63622Oy2 == null) {
            return;
        }
        InterfaceC63557Owz interfaceC63557Owz = c63622Oy2.LLD;
        if (interfaceC63557Owz != null) {
            C63546Owo c63546Owo = (C63546Owo) interfaceC63557Owz;
            if (c63546Owo.LIZIZ.LJ == 0) {
                c63546Owo.LIZIZ.LJ = SystemClock.uptimeMillis();
                ConcurrentHashMap<Integer, C63621Oy1> concurrentHashMap = c63546Owo.LIZLLL;
                concurrentHashMap.get(Collections.max(concurrentHashMap.keySet())).getClass();
            } else {
                c63546Owo.LIZ("logReceiveHttpStart");
            }
        }
        Message obtain = Message.obtain();
        obtain.what = 102;
        obtain.obj = c63622Oy2;
        obtain.arg1 = 2;
        this.LJLILLLLZI.sendMessage(obtain);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.P0x] */
    public final void LJIJJLI(C63622Oy2 c63622Oy2) {
        if (TextUtils.isEmpty(C63308Osy.LJI().LIZLLL().LJIIIIZZ)) {
            C63322OtC.LIZLLL("sendByHttp abort, httpHost invalid");
            c63622Oy2.LJIIJJI(-1019, "httpHost invalid");
            LJIILL(c63622Oy2);
            return;
        }
        ?? newBuilder2 = c63622Oy2.LJLJJLL.newBuilder2();
        newBuilder2.LJIL = Integer.valueOf(c63622Oy2.LJLLJ + c63622Oy2.LJLLL);
        Request build = newBuilder2.build();
        c63622Oy2.LJLJJLL = build;
        Integer num = build.cmd;
        if (num != null) {
            try {
                String LIZ = C63626Oy6.LIZ(num.intValue());
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(C63308Osy.LJI().LIZLLL().LJIIIIZZ);
                LIZ2.append(LIZ);
                String LIZIZ = X1D.LIZIZ(LIZ2);
                C63614Oxu c63614Oxu = new C63614Oxu();
                C63606Oxm c63606Oxm = c63614Oxu.LIZ;
                c63606Oxm.LIZ = LIZIZ;
                c63606Oxm.LIZIZ = LIZ;
                InterfaceC63557Owz interfaceC63557Owz = c63622Oy2.LLD;
                if (this.LJLJLLL) {
                    int intValue = num.intValue();
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("Start Send Request By HTTP: cmd:");
                    LIZ3.append(num);
                    LIZ3.append(", sequenceId=");
                    LIZ3.append(c63622Oy2.LJLIL);
                    LIZ3.append(", path=");
                    LIZ3.append(c63614Oxu.LIZ.LIZ);
                    P04.LIZLLL(intValue, X1D.LIZIZ(LIZ3), build);
                } else {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("Start Send Request By HTTP: cmd:");
                    LIZ4.append(num);
                    LIZ4.append(", sequenceId=");
                    LIZ4.append(c63622Oy2.LJLIL);
                    LIZ4.append(", path=");
                    LIZ4.append(c63614Oxu.LIZ.LIZ);
                    C1A7.LJJIIJZLJL(num, X1D.LIZIZ(LIZ4), build);
                }
                C47922IrO.LIZ();
                c63614Oxu.LIZ.LIZJ = "application/x-protobuf";
                if (C63308Osy.LJI().LIZLLL().LJIJJ == 0) {
                    build.encode();
                    c63614Oxu.LIZ.getClass();
                } else {
                    c63614Oxu.LIZ.LIZLLL = build;
                }
                C63606Oxm c63606Oxm2 = c63614Oxu.LIZ;
                c63622Oy2.LL = System.currentTimeMillis();
                if (interfaceC63557Owz != null) {
                    C63546Owo c63546Owo = (C63546Owo) interfaceC63557Owz;
                    if (c63546Owo.LIZLLL.get(Integer.valueOf((c63622Oy2.LJLLL + 1) * 10)) == null) {
                        c63546Owo.LIZ("logSendByHttpBeforeSend is null");
                    } else {
                        SystemClock.uptimeMillis();
                    }
                }
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append(LJIIIIZZ());
                LIZ5.append("httpSend ");
                LIZ5.append(c63622Oy2);
                C63322OtC.LJFF(X1D.LIZIZ(LIZ5));
                C63308Osy.LJI().LIZIZ().LJIILLIIL(c63606Oxm2, new C63582OxO(this, c63622Oy2, interfaceC63557Owz, c63606Oxm2), false);
                int i = C63308Osy.LJI().LIZLLL().LJIILLIIL;
                if (i <= 0) {
                    return;
                }
                LJIJI(105, c63622Oy2);
                LJIILLIIL(105, c63622Oy2, i);
                return;
            } catch (Exception unused) {
            }
        }
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append("sendByHttp abort, cmd invalid:");
        LIZ6.append(num);
        C63322OtC.LIZLLL(X1D.LIZIZ(LIZ6));
        c63622Oy2.LJIIJJI(-1019, "cmd invalid");
        LJIILL(c63622Oy2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x017b, code lost:
    
        if (r8 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0265, code lost:
    
        if (r3 == false) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ad  */
    @Override // X.InterfaceC63351Otf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMsg(android.os.Message r16) {
        /*
            Method dump skipped, instructions count: 1160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63581OxN.handleMsg(android.os.Message):void");
    }

    @Override // X.InterfaceC63516OwK
    public final void LJFF(Response response, EP1 ep1) {
        if (response == null) {
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 102;
        obtain.obj = new C63609Oxp(response, ep1, SystemClock.uptimeMillis());
        obtain.arg1 = 1;
        this.LJLILLLLZI.sendMessage(obtain);
    }

    public final void LJIJI(int i, C63622Oy2 c63622Oy2) {
        HandlerC63347Otb handlerC63347Otb = this.LJLIL;
        if (handlerC63347Otb != null && c63622Oy2 != null) {
            handlerC63347Otb.removeMessages(i, c63622Oy2);
        }
    }

    public final void LJIIJ(C63622Oy2 c63622Oy2, C63606Oxm c63606Oxm, C114844f2 c114844f2) {
        String str;
        boolean z;
        if (c63622Oy2.LJLJJLL != null) {
            int i = c114844f2.LIZ;
            int i2 = 200;
            if (i >= 200 && i < 300) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                try {
                    Response response = c114844f2.LIZIZ;
                    if (response != null) {
                        c63622Oy2.LJLJL = response;
                    } else {
                        C63308Osy.LJI().LIZLLL().getClass();
                        c63622Oy2.LJLJL = Response.ADAPTER.decode((byte[]) null);
                    }
                } catch (Exception e) {
                    C63322OtC.LJ("RequestItem setResponse", e);
                    C16880lQ.LLLLIIL(e);
                }
            }
            if (c63622Oy2.LJLJL == null) {
                C63653OyX c63653OyX = new C63653OyX();
                Request request = c63622Oy2.LJLJJLL;
                c63653OyX.LIZLLL = request.cmd;
                c63653OyX.LJII = request.inbox_type;
                c63653OyX.LJI = null;
                c63653OyX.LJ = Long.valueOf(c63622Oy2.LJLIL);
                int i3 = c114844f2.LIZ;
                if (i3 < 200 || i3 >= 300) {
                    i2 = i3;
                }
                c63653OyX.LJFF = Integer.valueOf(i2);
                c63622Oy2.LJLJL = c63653OyX.build();
            }
            c63622Oy2.LJLL = c114844f2.LIZ;
        }
        LJIJ(c63622Oy2);
        long uptimeMillis = SystemClock.uptimeMillis();
        C115064fO c115064fO = new C115064fO();
        c115064fO.LIZ = "network";
        c115064fO.LIZIZ = "http";
        c115064fO.LIZJ.put("message_uuid", c63622Oy2.LJII());
        c115064fO.LIZJ.put("duration", Long.valueOf(uptimeMillis - c63622Oy2.LJLLILLLL));
        c115064fO.LIZJ.put("cmd", Integer.valueOf(c63622Oy2.LJFF()));
        c115064fO.LIZJ.put("url", c63606Oxm.LIZ);
        c115064fO.LIZJ.put("success", 1);
        Response response2 = c63622Oy2.LJLJL;
        if (response2 != null) {
            str = response2.log_id;
        } else {
            str = "-1";
        }
        c115064fO.LIZJ.put("logid", str);
        c115064fO.LIZ();
        C63584OxQ.LIZ(c63622Oy2, uptimeMillis - c63622Oy2.LJLLILLLL, false);
    }

    public final void LJIILLIIL(int i, C63622Oy2 c63622Oy2, long j) {
        HandlerC63347Otb handlerC63347Otb = this.LJLIL;
        if (handlerC63347Otb != null && c63622Oy2 != null) {
            if (j < 0) {
                j = 0;
            }
            Message obtainMessage = handlerC63347Otb.obtainMessage(i);
            obtainMessage.obj = c63622Oy2;
            this.LJLIL.sendMessageDelayed(obtainMessage, j);
        }
    }
}
