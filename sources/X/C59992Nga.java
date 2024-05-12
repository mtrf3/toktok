package X;

import Y.IDComparatorS38S0000000_10;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import fjb.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

@InterfaceC65848Psq(c = "com.bytedance.ies.ugc.aweme.rich.impression.impl.staticviewability.StaticImpressionSDKService$shouldSendEvent$1$1$1", f = "StaticImpressionSDKService.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Nga, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59992Nga extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super OSZ<? extends Float, ? extends Long>>, Object> {
    public final /* synthetic */ C59885Ner LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59992Nga(C59885Ner c59885Ner, InterfaceC67352kd<? super C59992Nga> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c59885Ner;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C59992Nga(this.LJLIL, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        char c;
        int LIZ;
        float f;
        C141335gf.LIZJ(obj);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C59885Ner c59885Ner = this.LJLIL;
        if (!c59885Ner.LIZJ || c59885Ner.LIZLLL == null) {
            f = 0.0f;
        } else {
            C59993Ngb LIZ2 = C59995Ngd.LIZ(c59885Ner.LIZLLL, C59835Ne3.LIZIZ().getApplicationContext());
            ArrayList<C59993Ngb> LIZIZ = C59995Ngd.LIZIZ(LIZ2, c59885Ner.LJ);
            ArrayList<C59993Ngb> arrayList = new ArrayList<>();
            char c2 = 0;
            for (int i = 0; i < LIZIZ.size(); i++) {
                if (((C59993Ngb) ListProtector.get(LIZIZ, i)).LIZ < ((C59993Ngb) ListProtector.get(LIZIZ, i)).LIZJ && ((C59993Ngb) ListProtector.get(LIZIZ, i)).LIZIZ < ((C59993Ngb) ListProtector.get(LIZIZ, i)).LIZLLL) {
                    arrayList.add(ListProtector.get(LIZIZ, i));
                }
            }
            c59885Ner.LJFF = arrayList;
            if (arrayList.size() == 0) {
                LIZ = LIZ2.LIZ();
            } else {
                int size = arrayList.size();
                int[][] iArr = new int[size];
                int i2 = 0;
                while (true) {
                    c = 2;
                    if (i2 >= arrayList.size()) {
                        break;
                    }
                    int[] iArr2 = new int[4];
                    iArr2[0] = ((C59993Ngb) ListProtector.get(arrayList, i2)).LIZ;
                    iArr2[1] = ((C59993Ngb) ListProtector.get(arrayList, i2)).LIZIZ;
                    iArr2[2] = ((C59993Ngb) ListProtector.get(arrayList, i2)).LIZJ;
                    iArr2[3] = ((C59993Ngb) ListProtector.get(arrayList, i2)).LIZLLL;
                    iArr[i2] = iArr2;
                    i2++;
                }
                int i3 = size * 2;
                int[][] iArr3 = new int[i3];
                HashSet hashSet = new HashSet();
                int i4 = 0;
                for (int i5 = 0; i5 < size; i5++) {
                    int[] iArr4 = iArr[i5];
                    int i6 = i4 + 1;
                    int[] iArr5 = new int[4];
                    iArr5[0] = iArr4[1];
                    iArr5[1] = 1;
                    iArr5[2] = iArr4[0];
                    iArr5[3] = iArr4[2];
                    iArr3[i4] = iArr5;
                    i4 = i6 + 1;
                    int[] iArr6 = new int[4];
                    iArr6[0] = iArr4[3];
                    iArr6[1] = -1;
                    int i7 = iArr4[0];
                    iArr6[2] = i7;
                    iArr6[3] = iArr4[2];
                    iArr3[i6] = iArr6;
                    hashSet.add(Integer.valueOf(i7));
                    hashSet.add(Integer.valueOf(iArr4[2]));
                }
                Arrays.sort(iArr3, new IDComparatorS38S0000000_10(18));
                Integer[] numArr = (Integer[]) hashSet.toArray(new Integer[0]);
                Arrays.sort(numArr);
                HashMap hashMap = new HashMap();
                for (int i8 = 0; i8 < numArr.length; i8++) {
                    hashMap.put(numArr[i8], Integer.valueOf(i8));
                }
                C59996Nge c59996Nge = new C59996Nge(0, numArr.length - 1, numArr);
                int i9 = iArr3[0][0];
                long j = 0;
                long j2 = 0;
                int i10 = 0;
                while (i10 < i3) {
                    int[] iArr7 = iArr3[i10];
                    int i11 = iArr7[c2];
                    j += j2 * (i11 - i9);
                    j2 = c59996Nge.LIZ(((Integer) hashMap.get(Integer.valueOf(iArr7[c]))).intValue(), ((Integer) hashMap.get(Integer.valueOf(iArr7[3]))).intValue(), iArr7[1]);
                    i10++;
                    i9 = i11;
                    c2 = 0;
                    c = 2;
                }
                LIZ = LIZ2.LIZ() - ((int) j);
            }
            f = LIZ;
        }
        return new OSZ(new Float(f), new Long(SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super OSZ<? extends Float, ? extends Long>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
