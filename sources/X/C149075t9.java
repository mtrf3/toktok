package X;

import com.ss.android.ttve.nativePort.TEImageInterface;
import com.ss.android.ugc.aweme.image.model.ImageBufferData;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import fjb.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.image.utils.ImageModeUtils$processDataForImageMode$1", f = "ImageModeUtils.kt", l = {87, 99}, m = "invokeSuspend")
/* renamed from: X.5t9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149075t9 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ ArrayList<MediaModel> LJLJI;
    public final /* synthetic */ File LJLJJI;
    public final /* synthetic */ ArrayList<InterfaceC68342mE<Object>> LJLJJL;
    public final /* synthetic */ File LJLJJLL;
    public final /* synthetic */ ConcurrentHashMap<String, MediaModel> LJLJL;
    public final /* synthetic */ CopyOnWriteArrayList<String> LJLJLJ;
    public final /* synthetic */ InterfaceC88472Yns<ArrayList<MediaModel>, C76800UCe> LJLJLLL;
    public final /* synthetic */ long LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C149075t9(ArrayList<MediaModel> arrayList, File file, ArrayList<InterfaceC68342mE<Object>> arrayList2, File file2, ConcurrentHashMap<String, MediaModel> concurrentHashMap, CopyOnWriteArrayList<String> copyOnWriteArrayList, InterfaceC88472Yns<? super ArrayList<MediaModel>, C76800UCe> interfaceC88472Yns, long j, InterfaceC67352kd<? super C149075t9> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = arrayList;
        this.LJLJJI = file;
        this.LJLJJL = arrayList2;
        this.LJLJJLL = file2;
        this.LJLJL = concurrentHashMap;
        this.LJLJLJ = copyOnWriteArrayList;
        this.LJLJLLL = interfaceC88472Yns;
        this.LJLL = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C149075t9 c149075t9 = new C149075t9(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, interfaceC67352kd);
        c149075t9.LJLILLLLZI = obj;
        return c149075t9;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        ConcurrentHashMap concurrentHashMap;
        String str;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            concurrentHashMap = (ConcurrentHashMap) this.LJLILLLLZI;
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            concurrentHashMap = new ConcurrentHashMap();
            ArrayList<MediaModel> arrayList = this.LJLJI;
            o.LJI(arrayList);
            Iterator<MediaModel> it = arrayList.iterator();
            while (it.hasNext()) {
                MediaModel next = it.next();
                String path = this.LJLJJI.getPath();
                C151535x7 c151535x7 = C151535x7.LIZ;
                String str2 = next.fileLocalUriPath;
                o.LJIIIIZZ(str2, "mediaModel.fileLocalUriPath");
                c151535x7.getClass();
                this.LJLJJL.add(XKX.LIZIZ(interfaceC70422pa, C78613UtF.LIZJ, null, new C145705ni(next, new File(path, C151535x7.LIZLLL(str2)).getPath(), this.LJLJLJ, this.LJLJL, concurrentHashMap, null), 2));
            }
            ArrayList<InterfaceC68342mE<Object>> arrayList2 = this.LJLJJL;
            this.LJLILLLLZI = concurrentHashMap;
            this.LJLIL = 1;
            if (T1W.LIZ(arrayList2, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        CopyOnWriteArrayList<String> copyOnWriteArrayList = this.LJLJLJ;
        ConcurrentHashMap<String, MediaModel> concurrentHashMap2 = this.LJLJL;
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            C151535x7 c151535x72 = C151535x7.LIZ;
            MediaModel mediaModel = (MediaModel) entry.getKey();
            String str3 = (String) entry.getValue();
            c151535x72.getClass();
            C151535x7.LJIIJJI(mediaModel, str3, copyOnWriteArrayList, concurrentHashMap2);
        }
        if (!C151435wx.LIZIZ().getEnableVEImageCacheManager()) {
            File bufferDir = this.LJLJJLL;
            Collection<MediaModel> values = this.LJLJL.values();
            o.LJIIIIZZ(values, "map.values");
            List<MediaModel> originImages = ORZ.LLJI(values);
            o.LJIIIZ(bufferDir, "bufferDir");
            o.LJIIIZ(originImages, "originImages");
            for (MediaModel mediaModel2 : originImages) {
                String path2 = mediaModel2.fileLocalUriPath;
                String path3 = bufferDir.getPath();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(C173376rF.LJI(path2));
                LIZ.append(".buff");
                String bufferPath = new File(path3, X1D.LIZIZ(LIZ)).getPath();
                ImageBufferData imageBufferData = C151425ww.LIZ.get(path2);
                if (imageBufferData != null) {
                    str = imageBufferData.getPath();
                } else {
                    str = null;
                }
                if (!o.LJ(str, bufferPath) || !C1B6.LIZIZ(bufferPath)) {
                    int LIZ2 = C151105wQ.LIZ();
                    int LIZ3 = C151105wQ.LIZ();
                    if (mediaModel2.height > mediaModel2.width) {
                        LIZ2 = (int) (LIZ3 * 0.5625f);
                    } else {
                        LIZ3 = (int) (LIZ3 * 0.5625f);
                    }
                    o.LJIIIIZZ(path2, "path");
                    o.LJIIIIZZ(bufferPath, "bufferPath");
                    int[] nativeDecodeBufferToLocalPathStatic = TEImageInterface.nativeDecodeBufferToLocalPathStatic(path2, bufferPath, LIZ2, LIZ3, false, false);
                    if (nativeDecodeBufferToLocalPathStatic != null && nativeDecodeBufferToLocalPathStatic.length == 2) {
                        int length = nativeDecodeBufferToLocalPathStatic.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                if (nativeDecodeBufferToLocalPathStatic[i2] > 0) {
                                    i2++;
                                }
                            } else {
                                C151425ww.LIZ.put(path2, new ImageBufferData(bufferPath, nativeDecodeBufferToLocalPathStatic[0], nativeDecodeBufferToLocalPathStatic[1]));
                                break;
                            }
                        }
                    }
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<MediaModel> it2 = this.LJLJI.iterator();
        while (it2.hasNext()) {
            MediaModel mediaModel3 = this.LJLJL.get(it2.next().fileLocalUriPath);
            if (mediaModel3 != null) {
                arrayList3.add(mediaModel3);
            }
        }
        XIF xif = EXU.LIZ;
        C145695nh c145695nh = new C145695nh(this.LJLJLLL, arrayList3, this.LJLL, null);
        this.LJLILLLLZI = null;
        this.LJLIL = 2;
        if (XKX.LJI(xif, c145695nh, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
