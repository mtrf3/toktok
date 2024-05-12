package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.playereventreporter.VideoInfo;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class ITA {
    public final ArrayList<ITB> LIZ = new ArrayList<>();
    public ITB LIZIZ;

    public final synchronized ITB LIZ(String str) {
        String str2;
        int size;
        if (!TextUtils.isEmpty(str)) {
            ITB itb = this.LIZIZ;
            if (itb == null) {
                str2 = null;
            } else {
                str2 = itb.LIZIZ;
            }
            if (!TextUtils.equals(str, str2)) {
                if (this.LIZ.size() > 0 && this.LIZ.size() - 1 >= 0) {
                    while (true) {
                        int i = size - 1;
                        Object obj = ListProtector.get(this.LIZ, size);
                        o.LJIIIIZZ(obj, "sessionList[index]");
                        ITB itb2 = (ITB) obj;
                        if (!TextUtils.equals(itb2.LIZIZ, str)) {
                            if (i < 0) {
                                break;
                            }
                            size = i;
                        } else {
                            return itb2;
                        }
                    }
                }
                return null;
            }
        }
        return this.LIZIZ;
    }

    public final synchronized C46554IOw LIZIZ(String str) {
        IT3 it3;
        String str2;
        int size;
        C46554IOw c46554IOw = null;
        if (!TextUtils.isEmpty(str)) {
            ITB itb = this.LIZIZ;
            if (itb == null) {
                str2 = null;
            } else {
                str2 = itb.LIZIZ;
            }
            if (!TextUtils.equals(str, str2)) {
                if (this.LIZ.size() > 0 && this.LIZ.size() - 1 >= 0) {
                    while (true) {
                        int i = size - 1;
                        Object obj = ListProtector.get(this.LIZ, size);
                        o.LJIIIIZZ(obj, "sessionList[index]");
                        ITB itb2 = (ITB) obj;
                        if (TextUtils.equals(itb2.LIZIZ, str)) {
                            return itb2.LIZJ.LIZJ;
                        }
                        if (i < 0) {
                            break;
                        }
                        size = i;
                    }
                }
                return null;
            }
        }
        ITB itb3 = this.LIZIZ;
        if (itb3 != null && (it3 = itb3.LIZJ) != null) {
            c46554IOw = it3.LIZJ;
        }
        return c46554IOw;
    }

    public final synchronized VideoInfo LIZJ(String str) {
        IT3 it3;
        String str2;
        int size;
        if (C79146V4k.LJJJJIZL()) {
            String str3 = "";
            Iterator<ITB> it = this.LIZ.iterator();
            while (it.hasNext()) {
                ITB next = it.next();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str3);
                LIZ.append((Object) next.LIZIZ);
                LIZ.append(',');
                str3 = X1D.LIZIZ(LIZ);
            }
        }
        VideoInfo videoInfo = null;
        if (!TextUtils.isEmpty(str)) {
            ITB itb = this.LIZIZ;
            if (itb == null) {
                str2 = null;
            } else {
                str2 = itb.LIZIZ;
            }
            if (!TextUtils.equals(str, str2)) {
                if (this.LIZ.size() > 0 && this.LIZ.size() - 1 >= 0) {
                    while (true) {
                        int i = size - 1;
                        Object obj = ListProtector.get(this.LIZ, size);
                        o.LJIIIIZZ(obj, "sessionList[index]");
                        ITB itb2 = (ITB) obj;
                        if (TextUtils.equals(itb2.LIZIZ, str)) {
                            return itb2.LIZJ.LIZIZ;
                        }
                        if (i < 0) {
                            break;
                        }
                        size = i;
                    }
                }
                return null;
            }
        }
        ITB itb3 = this.LIZIZ;
        if (itb3 != null && (it3 = itb3.LIZJ) != null) {
            videoInfo = it3.LIZIZ;
        }
        return videoInfo;
    }

    public final synchronized void LJFF(String str) {
        int size;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ITB itb = this.LIZIZ;
        if (itb == null) {
            return;
        }
        if (TextUtils.equals(str, itb.LIZIZ)) {
            ITB itb2 = this.LIZIZ;
            o.LJI(itb2);
            itb2.LIZJ.getClass();
        } else if (this.LIZ.size() > 0 && this.LIZ.size() - 1 >= 0) {
            while (true) {
                int i = size - 1;
                Object obj = ListProtector.get(this.LIZ, size);
                o.LJIIIIZZ(obj, "sessionList[index]");
                ITB itb3 = (ITB) obj;
                if (TextUtils.equals(itb3.LIZIZ, str)) {
                    itb3.LIZJ.getClass();
                    break;
                } else if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
    }

    public final synchronized void LJI(String str) {
        int size;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ITB itb = this.LIZIZ;
        if (itb == null) {
            return;
        }
        if (TextUtils.equals(str, itb.LIZIZ)) {
            ITB itb2 = this.LIZIZ;
            o.LJI(itb2);
            itb2.LIZJ.getClass();
        } else if (this.LIZ.size() > 0 && this.LIZ.size() - 1 >= 0) {
            while (true) {
                int i = size - 1;
                Object obj = ListProtector.get(this.LIZ, size);
                o.LJIIIIZZ(obj, "sessionList[index]");
                ITB itb3 = (ITB) obj;
                if (TextUtils.equals(itb3.LIZIZ, str)) {
                    itb3.LIZJ.getClass();
                    break;
                } else if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
    }

    public final synchronized void LJII(String str) {
        int size;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ITB itb = this.LIZIZ;
        if (itb == null) {
            return;
        }
        if (TextUtils.equals(str, itb.LIZIZ)) {
            this.LIZIZ = null;
        } else if (this.LIZ.size() > 0 && this.LIZ.size() - 1 >= 0) {
            while (true) {
                int i = size - 1;
                Object obj = ListProtector.get(this.LIZ, size);
                o.LJIIIIZZ(obj, "sessionList[index]");
                ITB itb2 = (ITB) obj;
                if (TextUtils.equals(itb2.LIZIZ, str)) {
                    itb2.LIZJ.getClass();
                    break;
                } else if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
    }

    public final synchronized void LIZLLL(String str, IT2 it2) {
        int size;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ITB itb = this.LIZIZ;
        if (itb == null) {
            IT3 it3 = new IT3();
            String str2 = it2.LJJIJIIJI;
            o.LJI(str2);
            this.LIZIZ = new ITB(str2, str, it3);
            it3.LIZ(it2);
        } else if (TextUtils.equals(str, itb.LIZIZ)) {
            ITB itb2 = this.LIZIZ;
            o.LJI(itb2);
            itb2.LIZJ.LIZ(it2);
        } else if (this.LIZ.size() > 0 && this.LIZ.size() - 1 >= 0) {
            while (true) {
                int i = size - 1;
                Object obj = ListProtector.get(this.LIZ, size);
                o.LJIIIIZZ(obj, "sessionList[index]");
                ITB itb3 = (ITB) obj;
                if (TextUtils.equals(itb3.LIZIZ, str)) {
                    itb3.LIZJ.LIZ(it2);
                    break;
                } else if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
    }

    public final synchronized void LJ(String str, C46554IOw c46554IOw) {
        int size;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ITB itb = this.LIZIZ;
        if (itb == null) {
            return;
        }
        if (TextUtils.equals(str, itb.LIZIZ)) {
            ITB itb2 = this.LIZIZ;
            o.LJI(itb2);
            IT3 it3 = itb2.LIZJ;
            it3.getClass();
            it3.LIZJ = c46554IOw;
        } else if (this.LIZ.size() > 0 && this.LIZ.size() - 1 >= 0) {
            while (true) {
                int i = size - 1;
                Object obj = ListProtector.get(this.LIZ, size);
                o.LJIIIIZZ(obj, "sessionList[index]");
                ITB itb3 = (ITB) obj;
                if (TextUtils.equals(itb3.LIZIZ, str)) {
                    IT3 it32 = itb3.LIZJ;
                    it32.getClass();
                    it32.LIZJ = c46554IOw;
                    break;
                } else if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
    }

    public final synchronized void LJIIIIZZ(String str, ISM ism) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ITB itb = this.LIZIZ;
        if (itb != null) {
            if (!TextUtils.equals(str, itb.LIZIZ)) {
                if (this.LIZ.size() > 10) {
                    ListProtector.remove(this.LIZ, 0);
                }
                ArrayList<ITB> arrayList = this.LIZ;
                ITB itb2 = this.LIZIZ;
                o.LJI(itb2);
                arrayList.add(itb2);
                IT3 it3 = new IT3();
                String str2 = ism.LJFF;
                o.LJI(str2);
                this.LIZIZ = new ITB(str2, str, it3);
                it3.LIZIZ(str, ism);
            } else {
                ITB itb3 = this.LIZIZ;
                o.LJI(itb3);
                itb3.LIZJ.LIZJ(str, ism);
            }
        } else {
            IT3 it32 = new IT3();
            String str3 = ism.LJFF;
            o.LJI(str3);
            this.LIZIZ = new ITB(str3, str, it32);
            it32.LIZIZ(str, ism);
        }
    }
}
