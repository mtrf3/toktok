package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.LruCache;
import com.google.android.gms.common.ConnectionResult;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.BotAnswerCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.botanswercard.BotAnswerCardItemComponent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Lock;
import kotlin.jvm.internal.o;

/* renamed from: X.Fha, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39670Fha implements InterfaceC67781Qiv, InterfaceC62818Ol4 {
    public Object LJLIL;

    public /* synthetic */ C39670Fha(C67757QiX c67757QiX) {
        this.LJLIL = c67757QiX;
    }

    public /* synthetic */ C39670Fha(Context context) {
        this.LJLIL = context;
    }

    @Override // X.InterfaceC62818Ol4
    public final Object zza() {
        AbstractC39672Fhc zzc;
        AbstractC39672Fhc zzc2;
        Context context = (Context) this.LJLIL;
        String str = Build.TYPE;
        String str2 = Build.TAGS;
        if ((!str.equals("eng") && !str.equals("userdebug")) || (!str2.contains("dev-keys") && !str2.contains("test-keys"))) {
            return AbstractC39672Fhc.zzc();
        }
        if (Build.VERSION.SDK_INT >= 24 && !context.isDeviceProtectedStorage()) {
            context = context.createDeviceProtectedStorageContext();
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            try {
                File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                if (file.exists()) {
                    zzc = AbstractC39672Fhc.zzd(file);
                } else {
                    zzc = AbstractC39672Fhc.zzc();
                }
            } catch (RuntimeException unused) {
                zzc = AbstractC39672Fhc.zzc();
            }
            if (zzc.zzb()) {
                File file2 = (File) zzc.zza();
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                    try {
                        HashMap hashMap = new HashMap();
                        HashMap hashMap2 = new HashMap();
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            String[] split = readLine.split(" ", 3);
                            if (split.length == 3) {
                                String str3 = new String(split[0]);
                                String decode = android.net.Uri.decode(new String(split[1]));
                                String str4 = (String) hashMap2.get(split[2]);
                                if (str4 == null) {
                                    String str5 = new String(split[2]);
                                    str4 = android.net.Uri.decode(str5);
                                    if (str4.length() < 1024 || str4 == str5) {
                                        hashMap2.put(str5, str4);
                                    }
                                }
                                if (!hashMap.containsKey(str3)) {
                                    hashMap.put(str3, new HashMap());
                                }
                                ((java.util.Map) hashMap.get(str3)).put(decode, str4);
                            }
                        }
                        file2.toString();
                        C39675Fhf c39675Fhf = new C39675Fhf(hashMap);
                        bufferedReader.close();
                        zzc2 = AbstractC39672Fhc.zzd(c39675Fhf);
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            } catch (Exception unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                zzc2 = AbstractC39672Fhc.zzc();
            }
            return zzc2;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public /* synthetic */ C39670Fha() {
        this.LJLIL = "GlobalPayment";
        StringBuilder LIZ = X1D.LIZ();
        this.LJLIL = C025908h.LIZIZ(LIZ, (String) this.LJLIL, "-", "IAP", LIZ);
    }

    public C39670Fha(int i) {
        if (i != 3) {
            if (i != 7) {
                this.LJLIL = new ConcurrentHashMap();
            } else {
                this.LJLIL = new LruCache(16);
            }
        }
    }

    @Override // X.InterfaceC67781Qiv
    public final void LIZIZ(Bundle bundle) {
        ((C67757QiX) this.LJLIL).LJLLJ.lock();
        try {
            Object obj = this.LJLIL;
            ((C67757QiX) obj).LJLLI = ConnectionResult.RESULT_SUCCESS;
            C67757QiX.LJIIJJI((C67757QiX) obj);
        } finally {
            ((C67757QiX) this.LJLIL).LJLLJ.unlock();
        }
    }

    @Override // X.InterfaceC67781Qiv
    public final void LIZJ(ConnectionResult connectionResult) {
        ((C67757QiX) this.LJLIL).LJLLJ.lock();
        try {
            Object obj = this.LJLIL;
            ((C67757QiX) obj).LJLLI = connectionResult;
            C67757QiX.LJIIJJI((C67757QiX) obj);
        } finally {
            ((C67757QiX) this.LJLIL).LJLLJ.unlock();
        }
    }

    public final List LIZLLL(int i) {
        List list = (List) ((java.util.Map) this.LJLIL).get(Integer.valueOf(i));
        if (list == null) {
            synchronized (this) {
                list = (List) ((java.util.Map) this.LJLIL).get(Integer.valueOf(i));
                if (list == null) {
                    java.util.Map map = (java.util.Map) this.LJLIL;
                    Integer valueOf = Integer.valueOf(i);
                    list = new ArrayList();
                    map.put(valueOf, list);
                }
            }
        }
        return list;
    }

    public final void LJFF(List list) {
        BotAnswerCardTemplate botAnswerCardTemplate;
        List<BotAnswerCardItemComponent> list2;
        C109544Rq c109544Rq = (C109544Rq) ORZ.LLFII(list);
        String str = null;
        if (c109544Rq != null) {
            str = c109544Rq.getConversationId();
        }
        if (o.LJ(str, ((C99033ud) this.LJLIL).getConversationId())) {
            C84973Vd c84973Vd = C84973Vd.LIZ;
            c84973Vd.getClass();
            if (((Number) C39676Fhg.LIZ.getValue()).intValue() == 1) {
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C109544Rq c109544Rq2 = (C109544Rq) it.next();
                    if (C93793mB.LJIIJJI(c109544Rq2)) {
                        BaseTemplate LJIILL = C1DJ.LJIILL(c109544Rq2);
                        if ((LJIILL instanceof BotAnswerCardTemplate) && (botAnswerCardTemplate = (BotAnswerCardTemplate) LJIILL) != null && (list2 = botAnswerCardTemplate.recommendItems) != null) {
                            ArrayList arrayList = new ArrayList(C32I.LJJL(list2, 10));
                            Iterator<BotAnswerCardItemComponent> it2 = list2.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(String.valueOf(it2.next().itemId));
                            }
                            copyOnWriteArrayList.addAll(arrayList);
                        }
                    }
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("pre download bot video, aweme list size:");
                LIZ.append(copyOnWriteArrayList.size());
                LIZ.append(" download 5 of them");
                V1B.LJIIZILJ(X1D.LIZIZ(LIZ));
                Iterator it3 = ORZ.LLILLL(copyOnWriteArrayList, 5).iterator();
                while (it3.hasNext()) {
                    C84973Vd.LJIIIIZZ(c84973Vd, (String) it3.next());
                }
            }
        }
    }

    public C39670Fha(EnumC62292cT type) {
        o.LJIIIZ(type, "type");
        this.LJLIL = type;
    }

    public /* synthetic */ C39670Fha(C99033ud c99033ud) {
        this.LJLIL = c99033ud;
    }

    @Override // X.InterfaceC67781Qiv
    public final void LIZ(int i, boolean z) {
        Lock lock;
        ((C67757QiX) this.LJLIL).LJLLJ.lock();
        try {
            Object obj = this.LJLIL;
            C67757QiX c67757QiX = (C67757QiX) obj;
            if (c67757QiX.LJLLILLLL) {
                c67757QiX.LJLLILLLL = false;
                C67757QiX.LJIIJ((C67757QiX) obj, i, z);
                lock = ((C67757QiX) this.LJLIL).LJLLJ;
            } else {
                c67757QiX.LJLLILLLL = true;
                ((C67757QiX) obj).LJLJJI.v7(i);
                lock = ((C67757QiX) this.LJLIL).LJLLJ;
            }
            lock.unlock();
        } catch (Throwable th) {
            ((C67757QiX) this.LJLIL).LJLLJ.unlock();
            throw th;
        }
    }

    public static String LJ(double d, double d2, String str, boolean z) {
        if (str != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append('(');
            LIZ.append(str);
            LIZ.append(")-(");
            LIZ.append(d);
            LIZ.append(")-(");
            LIZ.append(d2);
            LIZ.append(")-(");
            return C48339Iy7.LIZJ(LIZ, z, ')', LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append('(');
        LIZ2.append(d);
        LIZ2.append(")-(");
        LIZ2.append(d2);
        LIZ2.append(")-(");
        LIZ2.append(z);
        LIZ2.append(')');
        return X1D.LIZIZ(LIZ2);
    }

    public static void LJI(List list, List list2, ActivityC45651qj activityC45651qj, FEH feh) {
        boolean z;
        String str;
        Activity LIZJ = C109434Rf.LIZJ(activityC45651qj);
        if (LIZJ != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (true ^ ((FE5) obj).LJLJLJ) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                list.removeAll(arrayList);
                ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    FE5 fe5 = (FE5) it.next();
                    int hashCode = LIZJ.hashCode();
                    if (feh != null) {
                        z = true;
                        str = feh.getType();
                    } else {
                        z = false;
                        str = null;
                    }
                    int i = fe5.LJLILLLLZI;
                    String layoutName = fe5.LJLJI;
                    String id = fe5.LJLJJI;
                    InterfaceC38616FDo creator = fe5.LJLJJL;
                    int i2 = fe5.LJLJJLL;
                    o.LJIIJ(layoutName, "layoutName");
                    o.LJIIJ(id, "id");
                    o.LJIIJ(creator, "creator");
                    arrayList2.add(new FE5(i, layoutName, id, creator, i2, hashCode, true, z, str));
                }
                list.addAll(arrayList2);
            }
        }
    }
}
