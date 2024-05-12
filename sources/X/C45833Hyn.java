package X;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.share.SystemShareActivity;
import com.zhiliaoapp.musically.R;
import fjb.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import ujb.o;
import ujb.s;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.share.SystemShareActivity$handleMultipleMediasSystemShare$1$1", f = "SystemShareActivity.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Hyn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45833Hyn extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ SystemShareActivity LJLIL;
    public final /* synthetic */ List<String> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45833Hyn(SystemShareActivity systemShareActivity, List<String> list, InterfaceC67352kd<? super C45833Hyn> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = systemShareActivity;
        this.LJLILLLLZI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C45833Hyn(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        C141335gf.LIZJ(obj);
        C45838Hys c45838Hys = this.LJLIL.LJLIL;
        List<String> list = this.LJLILLLLZI;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            C37247Ejb.LIZIZ.getClass();
            if (C37246Eja.LJFF(str)) {
                arrayList.add(str);
            }
        }
        c45838Hys.getClass();
        c45838Hys.LIZIZ = arrayList;
        String type = this.LJLIL.getIntent().getType();
        if (type != null) {
            z = o.LJJJLIIL(type, "video/", false);
        } else {
            z = false;
        }
        if (z) {
            this.LJLIL.LJLIL.LIZ = 4;
        } else {
            String type2 = this.LJLIL.getIntent().getType();
            if (type2 != null) {
                z2 = o.LJJJLIIL(type2, "image/", false);
            } else {
                z2 = false;
            }
            if (z2) {
                this.LJLIL.LJLIL.LIZ = 3;
            } else {
                String type3 = this.LJLIL.getIntent().getType();
                if (type3 != null) {
                    z3 = o.LJJJLIIL(type3, "*/*", false);
                } else {
                    z3 = false;
                }
                if (z3) {
                    List<String> paths = this.LJLILLLLZI;
                    kotlin.jvm.internal.o.LJIIIZ(paths, "paths");
                    int size = paths.size();
                    int i = 0;
                    while (true) {
                        if (i < size) {
                            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(C43723HDz.LIZIZ((String) ListProtector.get(paths, i)));
                            if (!TextUtils.isEmpty(mimeTypeFromExtension)) {
                                kotlin.jvm.internal.o.LJI(mimeTypeFromExtension);
                                if (!s.LJJJLZIJ(mimeTypeFromExtension, "image", false)) {
                                    List<String> paths2 = this.LJLILLLLZI;
                                    kotlin.jvm.internal.o.LJIIIZ(paths2, "paths");
                                    int size2 = paths2.size();
                                    for (int i2 = 0; i2 < size2; i2++) {
                                        String LIZIZ = C43723HDz.LIZIZ((String) ListProtector.get(paths2, i2));
                                        kotlin.jvm.internal.o.LJI(LIZIZ);
                                        Locale locale = Locale.getDefault();
                                        kotlin.jvm.internal.o.LJIIIIZZ(locale, "getDefault()");
                                        String lowerCase = LIZIZ.toLowerCase(locale);
                                        kotlin.jvm.internal.o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                                        String mimeTypeFromExtension2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
                                        if (!TextUtils.isEmpty(mimeTypeFromExtension2)) {
                                            kotlin.jvm.internal.o.LJI(mimeTypeFromExtension2);
                                            if (!s.LJJJLZIJ(mimeTypeFromExtension2, "video", false)) {
                                                C5S1 c5s1 = new C5S1(C16880lQ.LLLLLLIL(this.LJLIL));
                                                c5s1.LIZLLL(this.LJLIL.getString(R.string.r4c));
                                                c5s1.LJ();
                                                C43723HDz.LIZ();
                                                return C76800UCe.LIZ;
                                            }
                                        }
                                    }
                                    this.LJLIL.LJLIL.LIZ = 4;
                                }
                            }
                            i++;
                        } else {
                            this.LJLIL.LJLIL.LIZ = 3;
                            break;
                        }
                    }
                } else {
                    C5S1 c5s12 = new C5S1(C16880lQ.LLLLLLIL(this.LJLIL));
                    c5s12.LIZLLL(this.LJLIL.getString(R.string.r4c));
                    c5s12.LJ();
                    C43723HDz.LIZ();
                    return C76800UCe.LIZ;
                }
            }
        }
        C44014HPe.LIZ("system_share");
        SystemShareActivity systemShareActivity = this.LJLIL;
        C43722HDy c43722HDy = systemShareActivity.LJLILLLLZI;
        if (c43722HDy != null) {
            c43722HDy.mShareMediaType = systemShareActivity.LJLIL.LIZ();
            SystemShareActivity systemShareActivity2 = this.LJLIL;
            SystemShareActivity systemShareActivity3 = this.LJLIL;
            systemShareActivity2.LJLJJI = new C45827Hyh(systemShareActivity3.LJLIL, systemShareActivity3.LJLJLJ.getCreationId(), null);
            SystemShareActivity systemShareActivity4 = this.LJLIL;
            C45827Hyh c45827Hyh = systemShareActivity4.LJLJJI;
            if (c45827Hyh != null) {
                C43722HDy c43722HDy2 = systemShareActivity4.LJLILLLLZI;
                if (c43722HDy2 != null) {
                    c45827Hyh.LIZIZ(systemShareActivity4, c43722HDy2);
                    c45827Hyh.LJ.observeForever(systemShareActivity4.LJLL);
                    c45827Hyh.LJI.observeForever(systemShareActivity4.LJLJLLL);
                    return C76800UCe.LIZ;
                }
                kotlin.jvm.internal.o.LJIJI("shareContext");
                throw null;
            }
            kotlin.jvm.internal.o.LJIJI("shareActionHelper");
            throw null;
        }
        kotlin.jvm.internal.o.LJIJI("shareContext");
        throw null;
    }
}
