package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveKaraokeMaxDownloadCount;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import fjb.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.karaoke.download.KaraokeDownloader$downloadSongInfo$2", f = "KaraokeDownloader.kt", l = {139}, m = "invokeSuspend")
/* renamed from: X.2G2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2G2 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super EnumC23060vO>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C23080vQ LJLJI;
    public final /* synthetic */ C279917z LJLJJI;
    public final /* synthetic */ InterfaceC88471Ynr<Long, Integer, C76800UCe> LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2G2(C23080vQ c23080vQ, C279917z c279917z, InterfaceC88471Ynr<? super Long, ? super Integer, C76800UCe> interfaceC88471Ynr, boolean z, InterfaceC67352kd<? super C2G2> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c23080vQ;
        this.LJLJJI = c279917z;
        this.LJLJJL = interfaceC88471Ynr;
        this.LJLJJLL = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C2G2 c2g2 = new C2G2(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
        c2g2.LJLILLLLZI = obj;
        return c2g2;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        List LJJIJIIJI;
        String str;
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        boolean z = false;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj2);
            } else {
                C141335gf.LIZJ(obj2);
                InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
                if (this.LJLJI.LIZ >= LiveKaraokeMaxDownloadCount.INSTANCE.maxCount()) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Song Job stashed: ");
                    C31811Ce7.LJ(LIZ, this.LJLJJI.LIZJ, LIZ, "KaraokeDownloader");
                    this.LJLJI.LIZJ.addLast(new C23070vP(this.LJLJJI, this.LJLJJL, this.LJLJJLL));
                    return EnumC23060vO.QUEUE_FULL;
                }
                this.LJLJI.LIZ++;
                C23080vQ c23080vQ = this.LJLJI;
                C279917z songInfo = this.LJLJJI;
                boolean z2 = this.LJLJJLL;
                synchronized (c23080vQ) {
                    o.LJIIIZ(songInfo, "songInfo");
                    arrayList = new ArrayList();
                    if (z2) {
                        LJJIJIIJI = C47261Igj.LJJIJ(songInfo.LJIIIZ);
                    } else {
                        LJJIJIIJI = C47261Igj.LJJIJIIJI(songInfo.LIZIZ, songInfo.LJIIIIZZ, songInfo.LJIIIZ);
                    }
                    C0NB.LIZIZ("KaraokeDownloader", "Cache Key List: " + c23080vQ.LIZIZ.keySet());
                    if (c23080vQ.LIZIZ.containsKey((Object) Long.valueOf(songInfo.LIZ)) && C15420j4.LIZ(AnonymousClass011.LIZ(songInfo.LJIIIIZZ.LIZIZ())) && C15420j4.LIZ(AnonymousClass011.LIZ(songInfo.LIZIZ.LIZIZ())) && C15420j4.LIZ(AnonymousClass011.LIZ(songInfo.LJIIIZ.LIZIZ()))) {
                        List list = (List) c23080vQ.LIZIZ.get((Object) Long.valueOf(songInfo.LIZ));
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : LJJIJIIJI) {
                            if (!ujb.o.LJJJJJL(((AnonymousClass013) obj3).LIZIZ)) {
                                arrayList2.add(obj3);
                            }
                        }
                        Iterator it = arrayList2.iterator();
                        int i2 = 0;
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i3 = i2 + 1;
                            if (i2 >= 0) {
                                AnonymousClass013 anonymousClass013 = (AnonymousClass013) next;
                                if (list != null) {
                                    str = (String) ListProtector.get(list, i2);
                                } else {
                                    str = null;
                                }
                                if (!o.LJ(str, anonymousClass013.LIZ)) {
                                    arrayList.add(new OSZ(anonymousClass013.LIZIZ, anonymousClass013.LIZIZ()));
                                }
                                i2 = i3;
                            } else {
                                C47261Igj.LJJJJJ();
                                throw null;
                            }
                        }
                        C0NB.LIZIZ("KaraokeDownloader", "TaskCount: " + arrayList.size());
                    } else {
                        C0NB.LIZIZ("KaraokeDownloader", "TaskCount: 3, not in cache");
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj4 : LJJIJIIJI) {
                            if (!ujb.o.LJJJJJL(((AnonymousClass013) obj4).LIZIZ)) {
                                arrayList3.add(obj4);
                            }
                        }
                        ArrayList arrayList4 = new ArrayList(C32I.LJJL(arrayList3, 10));
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            AnonymousClass013 anonymousClass0132 = (AnonymousClass013) it2.next();
                            arrayList4.add(new OSZ(anonymousClass0132.LIZIZ, anonymousClass0132.LIZIZ()));
                        }
                        arrayList.addAll(arrayList4);
                    }
                }
                C279917z c279917z = this.LJLJJI;
                C23080vQ c23080vQ2 = this.LJLJI;
                ArrayList arrayList5 = new ArrayList(C32I.LJJL(arrayList, 10));
                Iterator it3 = arrayList.iterator();
                int i4 = 0;
                while (it3.hasNext()) {
                    Object next2 = it3.next();
                    int i5 = i4 + 1;
                    if (i4 >= 0) {
                        arrayList5.add(XKX.LIZIZ(interfaceC70422pa, T2R.LJIIJJI(), null, new C2G1(i4, (OSZ) next2, c279917z, c23080vQ2, null), 2));
                        i4 = i5;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
                if (!arrayList5.isEmpty()) {
                    InterfaceC88471Ynr<Long, Integer, C76800UCe> interfaceC88471Ynr = this.LJLJJL;
                    if (interfaceC88471Ynr != null) {
                        C23080vQ c23080vQ3 = this.LJLJI;
                        C279917z c279917z2 = this.LJLJJI;
                        c23080vQ3.LIZLLL.put(new Long(c279917z2.LIZ), new C23050vN(arrayList5.size(), c279917z2.LIZ, interfaceC88471Ynr));
                    }
                    this.LJLIL = 1;
                    obj2 = T1W.LIZ(arrayList5, this);
                    if (obj2 == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                } else {
                    this.LJLJI.LIZ--;
                    return EnumC23060vO.SUCCESS;
                }
            }
            List list2 = (List) obj2;
            this.LJLJI.LIZLLL.remove(new Long(this.LJLJJI.LIZ));
            C0NB.LIZIZ("KaraokeDownloader", "All Jobs finished");
            this.LJLJI.LIZ--;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it4 = list2.iterator();
                while (it4.hasNext()) {
                    if (!((Boolean) it4.next()).booleanValue()) {
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                this.LJLJI.LIZ(this.LJLJJI, this.LJLJJLL);
                return EnumC23060vO.SUCCESS;
            }
            return EnumC23060vO.FAIL;
        } catch (Exception unused) {
            C0NB.LIZIZ("KaraokeDownloader", "Some Job goes wrong");
            this.LJLJI.LIZ--;
            return EnumC23060vO.FAIL;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super EnumC23060vO> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
