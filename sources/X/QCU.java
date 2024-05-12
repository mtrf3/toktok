package X;

import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QCU implements InterfaceC48038ItG, InterfaceC39646FhC, InterfaceC156516Ch, InterfaceC56535MGt {
    public static int LJLIL;
    public static String LJLJI;
    public static boolean LJLJJI;
    public static final QCU LJLILLLLZI = new QCU();
    public static final char[] LJLJJL = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    @Override // X.InterfaceC39646FhC
    public void LIZ() {
    }

    public static final JSONObject LIZIZ(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        ShortVideoContextViewModel shortVideoContextViewModel = (ShortVideoContextViewModel) ((ViewModelProvider) diContainer.LJ(ViewModelProvider.class, null)).get(ShortVideoContextViewModel.class);
        ShortVideoContext shortVideoContext = shortVideoContextViewModel.LJLIL;
        if (shortVideoContext == null) {
            JSONObject LJ = new C6BK().LJ();
            o.LJIIIIZZ(LJ, "newBuilder().build()");
            return LJ;
        }
        C6BK c6bk = new C6BK();
        c6bk.LIZ.put("creation_id", shortVideoContext.LJI());
        c6bk.LIZ.put("shoot_way", shortVideoContext.shootWay);
        String str = "1";
        c6bk.LIZ.put("route", "1");
        if (!shortVideoContextViewModel.gv0()) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c6bk.LIZ.put("is_photo", str);
        c6bk.LIZ.put("position", "shoot_page");
        JSONObject LJ2 = c6bk.LJ();
        o.LJIIIIZZ(LJ2, "builder.build()");
        return LJ2;
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        List list = (List) obj;
        ArrayList LJ = AnonymousClass391.LJ(list, "it");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AVMusic transformMusicModel = C78934UyQ.LJLIL.getMusicService().transformMusicModel((MusicModel) it.next());
            if (transformMusicModel != null) {
                LJ.add(transformMusicModel);
            }
        }
        return LJ;
    }

    @Override // X.InterfaceC56535MGt
    public void onEvent(java.util.Map map) {
        FMX.LJIIL("power_preload_duration_key", map);
    }

    public static C6FI LJ(WM7 scene, InterfaceC65784Pro interfaceC65784Pro) {
        o.LJIIIZ(scene, "scene");
        if (C60903NvH.LJIIJJI().getAccountService().isChildrenMode()) {
            return new C164636d9(scene);
        }
        return new C153195zn(interfaceC65784Pro);
    }

    public static void LJFF(String content, Exception exc, int i) {
        if ((i & 1) != 0) {
            content = "";
        }
        String logTag = null;
        if ((i & 2) != 0) {
            exc = null;
        }
        if ((i & 4) != 0) {
            logTag = "EnsureWithToastUtil";
        }
        o.LJIIIZ(content, "content");
        o.LJIIIZ(logTag, "logTag");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DM_ENSURE_TAG:");
        LIZ.append(content);
        C78983UzD.LJIJ(exc, X1D.LIZIZ(LIZ));
    }

    public static String LIZLLL(String str, String str2, boolean z, boolean z2) {
        return LIZJ(str, 0, str.length(), str2, false, z, z2);
    }

    public static String LJI(int i, int i2, String str, boolean z) {
        int i3 = i;
        while (i3 < i2) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                C64533PUj c64533PUj = new C64533PUj();
                c64533PUj.LJJIZ(i, i3, str);
                while (i3 < i2) {
                    int codePointAt = str.codePointAt(i3);
                    if (codePointAt == 37) {
                        int i4 = i3 + 2;
                        if (i4 < i2) {
                            int LJI = PVA.LJI(str.charAt(i3 + 1));
                            int LJI2 = PVA.LJI(str.charAt(i4));
                            if (LJI != -1 && LJI2 != -1) {
                                c64533PUj.LJJIII((LJI << 4) + LJI2);
                                i3 = i4;
                            }
                        }
                        c64533PUj.LJJJIL(codePointAt);
                    } else {
                        if (codePointAt == 43 && z) {
                            c64533PUj.LJJIII(32);
                        }
                        c64533PUj.LJJJIL(codePointAt);
                    }
                    i3 += Character.charCount(codePointAt);
                }
                return c64533PUj.LJIILL();
            }
            i3++;
        }
        return str.substring(i, i2);
    }

    public static String LIZJ(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3) {
        String str3;
        int i3 = i;
        while (i3 < i2) {
            int codePointAt = str.codePointAt(i3);
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z3) || str2.indexOf(codePointAt) != -1 || ((codePointAt == 37 && !z) || (codePointAt == 43 && z2)))) {
                C64533PUj c64533PUj = new C64533PUj();
                c64533PUj.LJJIZ(i, i3, str);
                C64533PUj c64533PUj2 = null;
                while (i3 < i2) {
                    int codePointAt2 = str.codePointAt(i3);
                    if (!z || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z2) {
                            if (z) {
                                str3 = "+";
                            } else {
                                str3 = "%2B";
                            }
                            c64533PUj.LJJJI(str3);
                        } else if (codePointAt2 >= 32 && codePointAt2 != 127 && ((codePointAt2 < 128 || !z3) && str2.indexOf(codePointAt2) == -1 && (codePointAt2 != 37 || z))) {
                            c64533PUj.LJJJIL(codePointAt2);
                        } else {
                            if (c64533PUj2 == null) {
                                c64533PUj2 = new C64533PUj();
                            }
                            c64533PUj2.LJJJIL(codePointAt2);
                            while (!c64533PUj2.LLJ()) {
                                try {
                                    int readByte = c64533PUj2.readByte() & 255;
                                    c64533PUj.LJJIII(37);
                                    char[] cArr = LJLJJL;
                                    c64533PUj.LJJIII(cArr[(readByte >> 4) & 15]);
                                    c64533PUj.LJJIII(cArr[readByte & 15]);
                                } catch (EOFException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    }
                    i3 += Character.charCount(codePointAt2);
                }
                return c64533PUj.LJIILL();
            }
            i3 += Character.charCount(codePointAt);
        }
        return str.substring(i, i2);
    }
}
