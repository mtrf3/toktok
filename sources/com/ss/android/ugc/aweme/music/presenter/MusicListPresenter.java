package com.ss.android.ugc.aweme.music.presenter;

import X.FGR;
import X.InterfaceC84938XVe;
import X.XVZ;
import Y.ACallableS40S1100000_15;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.ss.android.ugc.aweme.music.model.MusicList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes16.dex */
public class MusicListPresenter implements WeakHandler.IHandler {
    public int mCursor;
    public WeakHandler mHandler;
    public boolean mHasMore = true;
    public InterfaceC84938XVe mIMusicListView;
    public boolean mIsLoading;
    public MusicList mMusicLists;

    public boolean isHasMore() {
        return this.mHasMore;
    }

    public MusicListPresenter(InterfaceC84938XVe interfaceC84938XVe) {
        MusicList musicList = new MusicList();
        this.mMusicLists = musicList;
        musicList.items = new ArrayList();
        this.mHandler = new WeakHandler(this);
    }

    public void fetchMoreMusicList(String str) {
        if (this.mIsLoading) {
            return;
        }
        this.mIsLoading = true;
        FGR.LIZIZ().LIZ(this.mHandler, new ACallableS40S1100000_15(this, str, 0), 1010);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        this.mIsLoading = false;
        if (message.what != 1010) {
            return;
        }
        Object obj = message.obj;
        if (!(obj instanceof Exception)) {
            MusicList musicList = (MusicList) obj;
            if (musicList == null) {
                return;
            }
            boolean isHasMore = this.mHasMore & musicList.isHasMore();
            this.mHasMore = isHasMore;
            if (isHasMore) {
                this.mCursor = musicList.getCursor();
                List<Music> list = musicList.items;
                if (list != null) {
                    Iterator<Music> it = list.iterator();
                    while (it.hasNext()) {
                        this.mMusicLists.items.add(it.next());
                    }
                }
                MusicCollectionItem musicCollectionItem = musicList.mcInfo;
                if (musicCollectionItem != null) {
                    this.mMusicLists.mcInfo = musicCollectionItem;
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public void fetchMusicList(String str, int i, int i2) {
        if (this.mIsLoading) {
            return;
        }
        this.mIsLoading = true;
        FGR.LIZIZ().LIZ(this.mHandler, new XVZ(str, i, i2), 1010);
    }
}
