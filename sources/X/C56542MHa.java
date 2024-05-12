package X;

import Y.AObjectS32S0000000_9;
import Y.AObjectS42S0101000_5;
import Y.AObjectS44S0101000_8;
import Y.AObjectS52S0101000_7;
import Y.ARunnableS28S0200000_9;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.api.MusicAwemeApi;
import com.ss.android.ugc.aweme.music.model.MusicAwemeList;
import com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.MHa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56542MHa extends AbstractC51036K1g<Aweme, MusicAwemeList> {
    public int LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public String LJLJJI;
    public long LJLJJL;
    public int LJLJJLL;
    public boolean LJLJL;
    public String LJLJLJ = "";
    public final Boolean LJLJLLL = C03090Af.LIZIZ("music_cache_optimistic", false);
    public final HashSet<String> LJLLI = new HashSet<>();
    public boolean LJLLILLLL = false;
    public final MJ0 LJLL = new MJ0(new AObjectS42S0101000_5(2, this, 19), new AObjectS32S0000000_9(1));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final List<Aweme> getItems() {
        T t = this.mData;
        if (t == 0 || ((MusicAwemeList) t).items == null) {
            return null;
        }
        Iterator<Aweme> it = ((MusicAwemeList) t).items.iterator();
        while (it.hasNext()) {
            it.next().setLogPbBean(((MusicAwemeList) this.mData).logPb);
        }
        return ((MusicAwemeList) this.mData).items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final boolean isDataEmpty() {
        T t = this.mData;
        if ((t == 0 || !((MusicAwemeList) t).isHasMore()) && C79004UzY.LJJIFFI(getItems())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final boolean isHasMore() {
        T t = this.mData;
        if (t != 0 && ((MusicAwemeList) t).isHasMore()) {
            return true;
        }
        return false;
    }

    @Override // X.C8BS
    public final boolean checkParams(Object... objArr) {
        if (objArr != null && objArr.length >= 3) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC51036K1g
    public final boolean deleteItem(Aweme aweme) {
        return C78996UzQ.LJIIIIZZ(getItems(), aweme, this.mNotifyListeners);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x013d, code lost:
    
        if (r5 != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013f, code lost:
    
        X.C56543MHb.LIZ.getClass();
        X.C56543MHb.LIZJ.LJIIIIZZ(-1);
        ((X.C0M6) X.C56543MHb.LIZLLL.getValue()).LJIIIIZZ(-1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01df, code lost:
    
        if (r0 != false) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v58, types: [com.ss.android.ugc.aweme.music.model.MusicAwemeList, T] */
    /* JADX WARN: Type inference failed for: r11v1, types: [com.ss.android.ugc.aweme.music.model.MusicAwemeList, T, java.lang.Object] */
    @Override // X.C8BS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleData(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56542MHa.handleData(java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final void loadMoreList(Object... objArr) {
        long j;
        String str = (String) objArr[1];
        if (isDataEmpty()) {
            j = 0;
        } else {
            j = ((MusicAwemeList) this.mData).cursor;
        }
        LJIIIZ(this.LJLJJLL, ((Integer) objArr[2]).intValue(), j, str, false);
    }

    @Override // X.AbstractC51036K1g
    public final void refreshList(Object... objArr) {
        C56543MHb.LIZ.getClass();
        this.LJLLI.clear();
        if (objArr.length >= 6) {
            LJIIIZ(20, ((Integer) objArr[2]).intValue(), 0L, (String) objArr[1], ((Boolean) objArr[5]).booleanValue());
        } else {
            LJIIIZ(20, ((Integer) objArr[2]).intValue(), 0L, (String) objArr[1], false);
        }
    }

    @Override // X.C8BS
    public final void resetLoadingStatus(Message message) {
        super.resetLoadingStatus(message);
        C56543MHb.LIZ.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.music.model.MusicAwemeList, T] */
    @Override // X.AbstractC51036K1g
    public final void setItems(List<Aweme> list) {
        if (this.mData == 0) {
            this.mData = new MusicAwemeList();
        }
        T t = this.mData;
        ((MusicAwemeList) t).hasMore = 1;
        ((MusicAwemeList) t).items = list;
    }

    public final void LJIIIZ(final int i, final int i2, final long j, String str, boolean z) {
        MusicAwemeList musicAwemeList;
        boolean z2;
        String str2;
        boolean z3;
        final String musicId = str;
        if (this.LJLLILLLL) {
            return;
        }
        this.LJLLILLLL = true;
        this.LJLJJI = musicId;
        this.LJLJJL = j;
        this.LJLJJLL = i;
        this.LJLIL = i2;
        if (!TextUtils.isEmpty(musicId) && musicId.endsWith(" ")) {
            JSONObject jSONObject = new JSONObject();
            try {
                String stackTraceString = android.util.Log.getStackTraceString(new Throwable());
                if (stackTraceString.length() > 1024) {
                    stackTraceString = stackTraceString.substring(0, 1024);
                }
                jSONObject.put("error_stack", stackTraceString);
                jSONObject.put("music_id", musicId);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            FUA.LIZJ("music_id_has_space", jSONObject);
        }
        if (this.LJLJLLL.booleanValue() && !NetworkStandardUIServiceImpl.createINetworkStandardUIServicebyMonsterPlugin(false).isStandardUIEnable()) {
            boolean z4 = this.LJLILLLLZI;
            if (z4 && j == 0 && !z) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (i2 == 0) {
                str2 = MusicAwemeApi.LIZIZ;
            } else {
                str2 = MusicAwemeApi.LIZJ;
            }
            MJ0 mj0 = this.LJLL;
            if (j == 0 && z4) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (musicId != null) {
                musicId = musicId.trim();
            }
            C57316MeW c57316MeW = new C57316MeW(i, str2, musicId, j, MusicAwemeApi.LIZ(), i2);
            AObjectS44S0101000_8 aObjectS44S0101000_8 = new AObjectS44S0101000_8(2, this, 1);
            AObjectS52S0101000_7 aObjectS52S0101000_7 = new AObjectS52S0101000_7(0, this, 5);
            mj0.getClass();
            XKX.LIZLLL(mj0.LIZ(), null, null, new C57319MeZ(z2, c57316MeW, z3, mj0, aObjectS44S0101000_8, aObjectS52S0101000_7, null), 3);
            return;
        }
        if (this.LJLILLLLZI && j == 0 && !z) {
            C56543MHb c56543MHb = C56543MHb.LIZ;
            String str3 = this.LJLJLJ;
            c56543MHb.getClass();
            o.LJIIIZ(musicId, "musicId");
            C0M6 c0m6 = (C0M6) C56543MHb.LIZLLL.getValue();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(musicId);
            LIZ.append('&');
            LIZ.append(j);
            LIZ.append('&');
            LIZ.append(i);
            LIZ.append('&');
            LIZ.append(i2);
            LIZ.append(str3);
            C56545MHd c56545MHd = (C56545MHd) c0m6.LIZIZ(X1D.LIZIZ(LIZ));
            if (c56545MHd != null && System.currentTimeMillis() - c56545MHd.LIZIZ < C56543MHb.LIZIZ) {
                musicAwemeList = c56545MHd.LIZ;
            } else {
                musicAwemeList = null;
            }
            long j2 = -1;
            if (musicAwemeList != null) {
                long currentTimeMillis = System.currentTimeMillis();
                String fromGroupId = this.LJLJLJ;
                o.LJIIIZ(fromGroupId, "fromGroupId");
                C0M6 c0m62 = (C0M6) C56543MHb.LIZLLL.getValue();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(musicId);
                LIZ2.append('&');
                LIZ2.append(j);
                LIZ2.append('&');
                LIZ2.append(i);
                LIZ2.append('&');
                LIZ2.append(i2);
                LIZ2.append(fromGroupId);
                C56545MHd c56545MHd2 = (C56545MHd) c0m62.LIZIZ(X1D.LIZIZ(LIZ2));
                if (c56545MHd2 != null) {
                    j2 = c56545MHd2.LIZIZ;
                }
                FRW.LIZIZ(currentTimeMillis - j2, "md_hit_cache");
                if (musicAwemeList != null) {
                    this.LJLJI = false;
                    Message message = new Message();
                    message.obj = musicAwemeList;
                    this.LJLLILLLL = false;
                    new Handler().post(new ARunnableS28S0200000_9(message, this, 21));
                    return;
                }
            } else {
                FRW.LIZIZ(-1L, "md_hit_cache");
            }
        }
        if (j == 0) {
            this.LJLJI = true;
        }
        FGR.LIZIZ().LIZ(this.mHandler, new Callable() { // from class: X.9nz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str4;
                String str5 = musicId;
                long j3 = j;
                int i3 = i;
                int i4 = i2;
                String str6 = C56542MHa.this.LJLJLJ;
                if (i4 == 0) {
                    str4 = MusicAwemeApi.LIZIZ;
                } else {
                    str4 = MusicAwemeApi.LIZJ;
                }
                MusicAwemeApi.MusicService musicService = MusicAwemeApi.LIZ;
                if (str5 != null) {
                    str5 = str5.trim();
                }
                MusicAwemeList musicAwemeList2 = musicService.queryMusicAwemeList(str4, str5, j3, i3, i4, MusicAwemeApi.LIZ(), str6).get();
                C56542MHa.this.LJLLILLLL = false;
                return musicAwemeList2;
            }
        }, 0);
    }
}
