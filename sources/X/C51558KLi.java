package X;

import com.byted.cast.common.api.MediaAssetBean;
import com.byted.cast.common.api.PlayerInfo;
import com.byted.cast.common.bean.DramaBean;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.BitRate;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.KLi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51558KLi {
    public static final /* synthetic */ int LIZ = 0;

    public static DramaBean[] LIZ(List awemeList) {
        String LIZJ;
        int i;
        int i2;
        List<String> list;
        Video video;
        ArrayList arrayList;
        Music music;
        UrlModel urlModel;
        AwemeStatistics awemeStatistics;
        String str;
        String str2;
        UrlModel originCover;
        List<String> urlList;
        String userDisplayName;
        o.LJIIIZ(awemeList, "awemeList");
        int size = awemeList.size();
        User user = null;
        if (size == 0) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        while (i4 < size) {
            Aweme aweme = (Aweme) ListProtector.get(awemeList, i4);
            if (C78688UuS.LJJJJJ(aweme)) {
                DramaBean dramaBean = new DramaBean();
                dramaBean.setDramaId(aweme.getAid());
                dramaBean.setHeadDuration(1);
                dramaBean.setTailDuration(1);
                String title = aweme.getTitle();
                if (title == null || title.length() == 0) {
                    title = EF7.LIZIZ().getString(R.string.bri);
                }
                DramaBean.UrlBean urlBean = new DramaBean.UrlBean();
                urlBean.setDramaId(aweme.getAid());
                String str3 = "";
                if (C78688UuS.LJJJJJ(aweme) && aweme.getVideo() != null && aweme.getVideo().getH264PlayAddr() != null && aweme.getVideo().getH264PlayAddr().getUrlList() != null && aweme.getVideo().getH264PlayAddr().getUrlList().size() > 0) {
                    Object obj = ListProtector.get(aweme.getVideo().getH264PlayAddr().getUrlList(), i3);
                    o.LJIIIIZZ(obj, "{\n            aweme.vide…Addr.urlList[0]\n        }");
                    LIZJ = (String) obj;
                } else if (C78688UuS.LJJJJJ(aweme) && aweme.getVideo() != null && aweme.getVideo().getPlayAddr() != null && aweme.getVideo().getPlayAddr().getUrlList() != null && aweme.getVideo().getPlayAddr().getUrlList().size() > 0) {
                    Object obj2 = ListProtector.get(aweme.getVideo().getPlayAddr().getUrlList(), i3);
                    o.LJIIIIZZ(obj2, "{\n            aweme.vide…Addr.urlList[0]\n        }");
                    LIZJ = (String) obj2;
                } else {
                    LIZJ = C31461Li.LIZJ("casting_default_static_video", "", "getInstance().getStringV…ideoSettings::class.java)");
                }
                urlBean.setUrl(LIZJ);
                Video video2 = aweme.getVideo();
                if (video2 != null) {
                    i = video2.getWidth();
                } else {
                    i = 0;
                }
                urlBean.setWidth(i);
                Video video3 = aweme.getVideo();
                if (video3 != null) {
                    i2 = video3.getHeight();
                } else {
                    i2 = 0;
                }
                urlBean.setHeight(i2);
                Aweme aweme2 = new Aweme();
                aweme2.setGroupId(aweme.getGroupId());
                aweme2.setAid(aweme.getAid());
                aweme2.setRegion(aweme.getRegion());
                aweme2.setDesc(aweme.getDesc());
                aweme2.setDescLanguage(aweme.getDescLanguage());
                aweme2.setUserDigg(aweme.getUserDigg());
                aweme2.setCreateTime(aweme.getCreateTime());
                aweme2.setAwemeType(aweme.getAwemeType());
                User author = aweme.getAuthor();
                if (author != null) {
                    user = new User();
                    user.setUid(author.getUid());
                    user.setSecUid(author.getSecUid());
                    user.setSignature(author.getSignature());
                    user.setNickname(author.getNickname());
                    user.setFavoritingCount(author.getFavoritingCount());
                    user.setUniqueId(author.getUniqueId());
                    user.setCustomVerify(author.getCustomVerify());
                    UrlModel avatarMedium = author.getAvatarMedium();
                    if (avatarMedium != null) {
                        UrlModel urlModel2 = new UrlModel();
                        urlModel2.setUri(avatarMedium.getUri());
                        List<String> urlList2 = avatarMedium.getUrlList();
                        if (urlList2 != null) {
                            list = ORZ.LLILLL(urlList2, 1);
                        } else {
                            list = null;
                        }
                        urlModel2.setUrlList(list);
                        urlModel2.setWidth(avatarMedium.getWidth());
                        urlModel2.setHeight(avatarMedium.getHeight());
                        user.setAvatarMedium(urlModel2);
                    }
                }
                aweme2.setAuthor(user);
                Video video4 = aweme.getVideo();
                if (video4 == null) {
                    video = null;
                } else {
                    video = new Video();
                    video.setWidth(video4.getWidth());
                    video.setHeight(video4.getHeight());
                    video.setRatio(video4.getRatio());
                    video.setDuration(video4.getDuration());
                    VideoUrlModel playAddr = video4.getPlayAddr();
                    if (playAddr != null) {
                        VideoUrlModel videoUrlModel = new VideoUrlModel();
                        videoUrlModel.setHeight(playAddr.getHeight());
                        videoUrlModel.setWidth(playAddr.getWidth());
                        videoUrlModel.setUrlKey(playAddr.getUrlKey());
                        videoUrlModel.setSize(playAddr.getSize());
                        videoUrlModel.setFileHash(playAddr.getFileHash());
                        videoUrlModel.setFileCheckSum(playAddr.getFileCheckSum());
                        videoUrlModel.setUri(playAddr.getUri());
                        videoUrlModel.setUrlList(playAddr.getUrlList());
                        video.setPlayAddr(videoUrlModel);
                    }
                    video.setPlayAddrBytevc1(video.getPlayAddr());
                    UrlModel cover = video4.getCover();
                    UrlModel urlModel3 = new UrlModel();
                    urlModel3.setUrlList(cover.getUrlList());
                    urlModel3.setWidth(cover.getWidth());
                    urlModel3.setHeight(cover.getHeight());
                    urlModel3.setUri(cover.getUri());
                    video.setCover(urlModel3);
                    List<BitRate> bitRate = video4.getBitRate();
                    if (bitRate == null) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList();
                        int i5 = 0;
                        BitRate bitRate2 = null;
                        for (BitRate bitRate3 : bitRate) {
                            if (bitRate3.getVideoWidth() > i5) {
                                i5 = bitRate3.getVideoWidth();
                                bitRate2 = bitRate3;
                            }
                        }
                        if (bitRate2 != null) {
                            BitRate bitRate4 = new BitRate();
                            bitRate4.setBytevc1(bitRate2.isBytevc1());
                            bitRate4.setGearName(bitRate2.getGearName());
                            bitRate4.setQualityType(bitRate2.getQualityType());
                            bitRate4.setBitRate(bitRate2.getBitRate());
                            UrlModel playAddr2 = bitRate2.getPlayAddr();
                            VideoUrlModel videoUrlModel2 = new VideoUrlModel();
                            videoUrlModel2.setHeight(playAddr2.getHeight());
                            videoUrlModel2.setWidth(playAddr2.getWidth());
                            videoUrlModel2.setUrlKey(playAddr2.getUrlKey());
                            videoUrlModel2.setSize(playAddr2.getSize());
                            videoUrlModel2.setFileHash(playAddr2.getFileHash());
                            videoUrlModel2.setUri(playAddr2.getUri());
                            videoUrlModel2.setUrlList(playAddr2.getUrlList());
                            bitRate4.setPlayAddr(videoUrlModel2);
                            arrayList.add(bitRate4);
                        }
                    }
                    video.setBitRate(arrayList);
                }
                aweme2.setVideo(video);
                Music music2 = aweme.getMusic();
                if (music2 == null) {
                    music = null;
                } else {
                    music = new Music();
                    music.setAlbum(music2.getAlbum());
                    music.setPgc(music2.isPgc());
                    music.setOriginMusic(music2.isOriginMusic());
                    music.setMusicName(music2.getMusicName());
                    music.setAuthorName(music2.getAuthorName());
                    UrlModel coverMedium = music2.getCoverMedium();
                    if (coverMedium == null) {
                        urlModel = null;
                    } else {
                        urlModel = new UrlModel();
                        urlModel.setUrlList(coverMedium.getUrlList());
                        urlModel.setWidth(coverMedium.getWidth());
                        urlModel.setHeight(coverMedium.getHeight());
                        urlModel.setUri(coverMedium.getUri());
                    }
                    music.setCoverMedium(urlModel);
                }
                aweme2.setMusic(music);
                AwemeStatistics statistics = aweme.getStatistics();
                if (statistics == null) {
                    awemeStatistics = null;
                } else {
                    awemeStatistics = new AwemeStatistics();
                    awemeStatistics.setCommentCount(statistics.getCommentCount());
                    awemeStatistics.setDiggCount(statistics.getDiggCount());
                }
                aweme2.setStatistics(awemeStatistics);
                String json = GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), aweme2);
                o.LJIIIIZZ(json, "get().gson.toJson(simpleAweme)");
                urlBean.setExtra(json);
                dramaBean.setUrlBean(urlBean);
                DramaBean.MediaAssetBean mediaAssetBean = new DramaBean.MediaAssetBean();
                mediaAssetBean.setTitle(title);
                mediaAssetBean.setAlbum("TikTok Casting Playlist");
                User author2 = aweme.getAuthor();
                if (author2 == null || (str = author2.getUserDisplayName()) == null) {
                    str = "";
                }
                mediaAssetBean.setCreator(str);
                User author3 = aweme.getAuthor();
                if (author3 != null && (userDisplayName = author3.getUserDisplayName()) != null) {
                    str3 = userDisplayName;
                }
                mediaAssetBean.setArtist(str3);
                mediaAssetBean.setMimeType(0);
                Video video5 = aweme.getVideo();
                if (video5 != null && (originCover = video5.getOriginCover()) != null && (urlList = originCover.getUrlList()) != null && urlList.size() > 0) {
                    str2 = (String) ListProtector.get(urlList, 0);
                } else {
                    str2 = null;
                }
                mediaAssetBean.setAlbumArtURI(str2);
                dramaBean.setMediaAssetBean(mediaAssetBean);
                arrayList2.add(dramaBean);
            } else {
                StringBuilder LJ = C7MY.LJ("convert2DramaList non-castable index: ", i4, ", aweme type: ");
                LJ.append(aweme.getAwemeType());
                C70922qO.LIZ("CastingUtils", X1D.LIZIZ(LJ));
            }
            i4++;
            user = null;
            i3 = 0;
        }
        return (DramaBean[]) arrayList2.toArray(new DramaBean[i3]);
    }

    public static PlayerInfo LIZIZ(List awemeList) {
        o.LJIIIZ(awemeList, "awemeList");
        C71082qe c71082qe = C71042qa.LIZIZ;
        if (c71082qe != null) {
            PlayerInfo playerInfo = new PlayerInfo();
            playerInfo.setType(0);
            playerInfo.setServiceInfo(c71082qe.LIZIZ.LJIIIIZZ.getValue());
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("convert2PlayInfo size = ");
            LIZ2.append(awemeList.size());
            C70922qO.LIZ("CastingUtils", X1D.LIZIZ(LIZ2));
            playerInfo.setDramaList(LIZ(ORZ.LLJILJILJ(awemeList)));
            playerInfo.setMetaDataBean(new MediaAssetBean());
            return playerInfo;
        }
        return null;
    }
}
