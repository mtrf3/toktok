package X;

import androidx.lifecycle.MutableLiveData;
import java.util.HashSet;

/* renamed from: X.MCw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56434MCw {
    public final MutableLiveData<HashSet<Integer>> LIZ;

    public C56434MCw() {
        MutableLiveData<HashSet<Integer>> mutableLiveData = new MutableLiveData<>();
        this.LIZ = mutableLiveData;
        HashSet hashSet = new HashSet();
        hashSet.add(-1);
        V1B.LJLJJI(mutableLiveData, hashSet);
    }

    public final void LIZ(int i) {
        HashSet<Integer> hashSet;
        HashSet<Integer> value = this.LIZ.getValue();
        if (value != null && value.contains(Integer.valueOf(i))) {
            MutableLiveData<HashSet<Integer>> mutableLiveData = this.LIZ;
            HashSet<Integer> value2 = mutableLiveData.getValue();
            if (value2 != null) {
                hashSet = new HashSet<>(value2);
                hashSet.remove(Integer.valueOf(i));
            } else {
                hashSet = null;
            }
            mutableLiveData.postValue(hashSet);
        }
    }

    public final void LIZIZ(int i) {
        HashSet<Integer> value = this.LIZ.getValue();
        if (value != null) {
            HashSet hashSet = new HashSet(value);
            if (i != -1) {
                if (i != 0) {
                    if (i != 2) {
                        if (i != 6) {
                            if (i == 7) {
                                if (hashSet.contains(6)) {
                                    hashSet.remove(6);
                                }
                                if (hashSet.contains(5)) {
                                    hashSet.remove(5);
                                }
                            }
                        } else if (hashSet.contains(7)) {
                            hashSet.remove(7);
                        }
                    } else if (hashSet.contains(0)) {
                        hashSet.remove(0);
                    }
                } else if (hashSet.contains(-1)) {
                    hashSet.remove(-1);
                }
            } else {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("set state: ");
            LIZ.append(i);
            LIZ.append("- ");
            LIZ.append(hashSet);
            LIZ.append(' ');
            LIZ.append(C16880lQ.LLLLIIIILLL());
            C221018lt.LJFF("Skylight_Lifecycle", X1D.LIZIZ(LIZ));
            V1B.LJLJJI(this.LIZ, hashSet);
        }
    }
}
